package pkg20;

import java.sql.*;
import java.time.LocalDateTime;
import pkg20.Funcionario.Genero;

public class FuncionarioDAO extends DAO {

    public void salvar(Funcionario f) {

        try {

            // abre a conexão
            Connection conexao = abrirConexao();

            // instrução
            String sql;
            
            if (f.getCodigo() == null) {
                sql = "INSERT INTO funcionarios VALUES ("
                    + "DEFAULT, ?, ?, ?, ?, ?, ?, ?, ?);"; // ? é um placeholder
            } else {
                sql = "UPDATE funcionarios SET " 
                    + "nome = ?, cpf = ?, data_nascimento = ?,"
                    + "genero = ?, salario = ?, atualizacao = ?,"
                    + "foto = ?, cod_departamento = ? WHERE codigo = ?";
            }
                
                
            // criar um objeto comando
            PreparedStatement comando
                    = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // preencher o comando
            if (f.getNome() != null) {
                comando.setString(1, f.getNome()); // 1ra ? seta como nome
            } else {
                comando.setNull(1, Types.VARCHAR);
            }

            if (f.getCpf() != null) {
                comando.setString(2, f.getCpf());
            } else {
                comando.setNull(2, Types.VARCHAR);
            }

            if (f.getDataNascimento() != null) {
                comando.setDate(3, Date.valueOf(f.getDataNascimento()));
            } else {
                comando.setNull(3, Types.DATE);
            }

            if (f.getGenero() != null) {
                comando.setInt(4, f.getGenero().ordinal());
            } else {
                comando.setNull(4, Types.SMALLINT);
            }

            if (f.getSalario() != null) {
                comando.setDouble(5, f.getSalario());
            } else {
                comando.setNull(5, Types.NUMERIC);
            }

            f.setUltimaAtualizacao(LocalDateTime.now());

            comando.setTimestamp(6, Timestamp.valueOf(f.getUltimaAtualizacao()));

            if (f.getFoto() != null) {
                comando.setBytes(7, f.getFoto());
            } else {
                comando.setNull(7, Types.ARRAY);
            }
            
            if (f.getDepartamento() != null) {
                if (f.getDepartamento().getCodigo() == null) {
                    DepartamentoDAO ddao = new DepartamentoDAO();
                    ddao.salvar(f.getDepartamento());
                }                    
                comando.setInt(8, f.getDepartamento().getCodigo());
            } else {
                comando.setNull(8, Types.INTEGER);
            }
            
            if (f.getCodigo() != null) {
                comando.setInt(9, f.getCodigo()); // WHERE
            }

            // envia o comando (executa de fato)
            comando.execute();

            // recuperar a chave gerada (codigo) ----
            ResultSet key = comando.getGeneratedKeys();

            // seta a chave no objeto
            if (key.next()) {
                f.setCodigo(key.getInt(1));
            }
            // --------------

            // salvar os relacionados (composição)
            
            salvarPontos(conexao, f);
            
            // fechar a conexão
            conexao.close();

        } catch (SQLException sqle) {
            throw new RuntimeException("Erro no Banco", sqle);
        }

    }

    public void excluir(int codigo) {
        
        try {
            Connection conexao = abrirConexao();
            
            String sql = "DELETE FROM funcionarios WHERE codigo = ?";

            PreparedStatement comando = conexao.prepareStatement(sql);
            
            comando.setInt(1, codigo);

            comando.execute();
            
            conexao.close();

            // dao.excluir(2)
        } catch (SQLException sqle) {
            throw new RuntimeException("Erro no Banco", sqle);
        }
    }
    
    public Funcionario buscaCodigo(int codigo) {
        Funcionario f = null;

        try {
            Connection conexao = abrirConexao();
            
            String sql = "SELECT * FROM funcionarios WHERE codigo = ?";

            PreparedStatement comando = conexao.prepareStatement(sql);
            
            comando.setInt(1, codigo);

            ResultSet result = comando.executeQuery();
            
            if (result.next()) {
                f = new Funcionario();
                f.setCodigo(codigo);
                f.setCpf(result.getString("cpf"));
                f.setDataNascimento(
                        result.getDate("data_nascimento").toLocalDate());
                f.setFoto(result.getBytes("foto"));
                f.setGenero(Genero.values()[result.getInt("genero")]);
                f.setNome(result.getString("nome"));
                f.setSalario(result.getDouble("salario"));
                f.setUltimaAtualizacao(
                        result.getTimestamp("atualizacao").toLocalDateTime());
                
                int codDepartamento = result.getInt("cod_departamento");
                if (codDepartamento != 0) { // carregar o departamento
                    DepartamentoDAO ddao = new DepartamentoDAO();
                    Departamento dep = ddao.buscaCodigo(codDepartamento);
                    dep.alocar(f);
                }                
            }

            conexao.close();

        } catch (SQLException sqle) {
            throw new RuntimeException("Erro no Banco", sqle);
        }

        return f;
    }
    
    public void carregaFuncionarios(Departamento d) {

        try {
            Connection conexao = abrirConexao();            
            String sql = "SELECT * FROM funcionarios "
                       + "WHERE cod_departamento = ?";
            PreparedStatement comando = conexao.prepareStatement(sql);            
            comando.setInt(1, d.getCodigo());
            ResultSet result = comando.executeQuery();            
            while (result.next()) {
                Funcionario f = new Funcionario();
                f.setCodigo(result.getInt("codigo"));
                f.setCpf(result.getString("cpf"));
                f.setDataNascimento(
                        result.getDate("data_nascimento").toLocalDate());
                f.setFoto(result.getBytes("foto"));
                f.setGenero(Genero.values()[result.getInt("genero")]);
                f.setNome(result.getString("nome"));
                f.setSalario(result.getDouble("salario"));
                f.setUltimaAtualizacao(
                        result.getTimestamp("atualizacao").toLocalDateTime());
                d.alocar(f);
            }
            conexao.close();
        } catch (SQLException sqle) {
            throw new RuntimeException("Erro no Banco", sqle);
        }
    }

    private void salvarPontos(Connection conexao, Funcionario f) throws SQLException {
        for (Ponto p : f.getPontos()) {
            if (p.getCodigo() == null) {
                salvaPonto(conexao, p, f.getCodigo());
            }
        }
    }

    private void salvaPonto(Connection conexao, Ponto p, int fk) throws SQLException {
        String sql = "INSERT INTO pontos VALUES (DEFAULT, ?, ?, ?)";
        PreparedStatement comando = conexao.prepareStatement(sql);
        comando.setTimestamp(1, Timestamp.valueOf(p.getEntrada()));
        comando.setTimestamp(2, Timestamp.valueOf(p.getSaida()));
        comando.setInt(3, fk);
        comando.execute();
    }
    
    

}
