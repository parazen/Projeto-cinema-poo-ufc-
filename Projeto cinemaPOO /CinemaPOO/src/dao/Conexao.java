
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Conexao {
    
    public Connection getConnection() throws SQLException{
        String url = "jdbc:postgresql://localhost:5432/postgres";
        Properties props = new Properties();
        props.setProperty("user","postgres");
        props.setProperty("password","gean123");
        props.setProperty("ssl","false");
        Connection conn = DriverManager.getConnection(url, props);
        
        return conn;
    }
    
}
