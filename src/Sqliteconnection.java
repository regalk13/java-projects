
package frame1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sqliteconnection {
  public static Connection connect() {
    Connection con = null;
    try {
      Class.forName("org.sqlite.JDBC");
      con = DriverManager.getConnection("jdbc:sqlite:data.db"); // connecting to our database
      System.out.println("Connected!");
   
    } catch (ClassNotFoundException | SQLException e ) {
      // TODO Auto-generated catch block
      System.out.println(e+"");
    }
    
    return con; 
  }
}

