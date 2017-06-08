package pkg20;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import pkg20.Funcionario.Genero;

public class FuncionarioDAO {

    private static final String url
            = "jdbc:postgresql://10.132.214.1/poomarcio";
    private static final String user = "aluno";
    private static final String password = "aluno";

    public void salvar(Funcionario f) {

        try {

            // abre a conexão
            Connection conexao = DriverManager.getConnection(url, user, password);

            // instrução
            String sql = "INSERT INTO funcionarios VALUES ("
                    + "DEFAULT, ?, ?, ?, ?, ?, ?, ?);"; // ? é um placeholder

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

            // envia o comando (executa de fato)
            comando.execute();

            // recuperar a chave gerada (codigo) ----
            ResultSet key = comando.getGeneratedKeys();

            // seta a chave no objeto
            if (key.next()) {
                f.setCodigo(key.getInt(1));
            }
            // --------------

            // fechar a conexão
            conexao.close();

        } catch (SQLException sqle) {
            throw new RuntimeException("Erro no Banco", sqle);
        }

    }

    public void excluir(int codigo) {
        
        try {
            Connection conexao = DriverManager.getConnection(url, user, password);
            
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
            Connection conexao = DriverManager.getConnection(url, user, password);
            
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
            }

            conexao.close();

        } catch (SQLException sqle) {
            throw new RuntimeException("Erro no Banco", sqle);
        }

        return f;
    }

}
