
package Factory;
//importando biblioteca SQL;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//criando classe conectora com banco
public class ConnectorFactory {
    public Connection getconeConnetor(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/users" , "root" , "asdqwe123");
        } catch (SQLException ex) {
          throw new RuntimeException(ex);
        }
    }
}
