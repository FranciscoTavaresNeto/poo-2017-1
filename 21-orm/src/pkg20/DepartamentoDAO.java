package pkg20;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.time.LocalDateTime;

public class DepartamentoDAO extends DAO {
        
    public void salvar(Departamento d) {
        
        try {

            // abre a conexão
            Connection conexao = abrirConexao();

            // instrução
            String sql;
            
            if (d.getCodigo() == null) {
                sql = "INSERT INTO departamentos VALUES ("
                    + "DEFAULT, ?);";
            } else {
                sql = "UPDATE departamentos SET " 
                    + "nome = ? WHERE codigo = ?";
            }
                
            PreparedStatement comando
                    = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            if (d.getNome() != null) {
                comando.setString(1, d.getNome());
            } else {
                comando.setNull(1, Types.VARCHAR);
            }
            
            if (d.getCodigo() != null) {
                comando.setInt(2, d.getCodigo());
            }

            comando.execute();

            ResultSet key = comando.getGeneratedKeys();

            if (key.next()) {
                d.setCodigo(key.getInt(1));
            }
            
            conexao.close();

        } catch (SQLException sqle) {
            throw new RuntimeException("Erro no Banco", sqle);
        }
    }
    
    
    public Departamento buscaCodigo(int codigo) {
        Departamento d = null;
        try {
            Connection conexao = abrirConexao();            
            String sql = "SELECT * FROM departamentos WHERE codigo = ?";
            PreparedStatement comando = conexao.prepareStatement(sql);            
            comando.setInt(1, codigo);
            ResultSet result = comando.executeQuery();
            if (result.next()) {
                d = new Departamento();
                d.setCodigo(codigo);
                d.setNome(result.getString("nome"));                
            }
            conexao.close();
        } catch (SQLException sqle) {
            throw new RuntimeException("Erro no Banco", sqle);
        }
        return d;
    }
    
}
