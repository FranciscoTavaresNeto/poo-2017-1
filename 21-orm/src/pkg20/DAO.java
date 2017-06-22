package pkg20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DAO {
    
    private static final String url
            = "jdbc:postgresql://10.132.214.1/poomarcio";
    private static final String user = "aluno";
    private static final String password = "aluno";
    
    protected Connection abrirConexao() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
    
}
