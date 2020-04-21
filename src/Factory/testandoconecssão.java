
package Factory;
import java.sql.*;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
public class testandoconecssão {
    public static void main(String[] args) {
        try {
            Connection connection = new ConnectorFactory().getconeConnetor();
            System.out.println("deu bom!!");
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(testandoconecssão.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
