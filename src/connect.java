import java.sql.*;
import javax.swing.JOptionPane;

public class connect {
    Connection conn = null;

    public static Connection connectDB(){
        try{
           
                Class.forName("org.sqlite.JDBC");
                Connection conn = DriverManager.getConnection("jdbc:sqlite:mydatabase.sqlite");

                return conn;

            }catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
            }
            return null;
         }
}

