import java.sql.*;
import javax.swing.JOptionPane;


public class myconnection {
    Connection xc;
    Statement ST;
    
    public myconnection(){
        
        try{
           Class.forName("son.jdbc.odbc.JdbcOdbcDriver");
           xc=DriverManager.getConnection("jdbc:odbc:login","DESKTOP-99I7EJM","");
           
           ST = xc.createStatement();
           
           JOptionPane.showMessageDialog(null, "Connected"); 
        }catch(Exception ex){
        System.out.println(ex);
        }
     
        
    }
}
