
package correoskata4.view;

import correoskata4.model.Mail;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class MailListReaderBD {
    static List<Mail> list = new ArrayList<>();

    
    
    public static List<Mail> read() throws ClassNotFoundException, SQLException{
        
        
        Class.forName("org.sqlite.JDBC");
        
        Connection connection = DriverManager.getConnection("jdbc:sqlite:data/Prueba.db");
        
        try(Statement statement= connection.createStatement()){
            
            
            ResultSet set = statement.executeQuery("SELECT email FROM PEOPLE");
            
            
            while (set.next()) {
                String direccion = set.getString("email");
                list.add(new Mail(direccion));
                
            }
        }
        
        
        return list;
    }
}
