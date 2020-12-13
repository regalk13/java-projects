
package frame1;
import java.sql.*;


public class Sqliteconnection {
  public static Connection connect() {
    Connection con = null;
    Statement stmt = null;
    try {
      Class.forName("org.sqlite.JDBC");
      con = DriverManager.getConnection("jdbc:sqlite:data.db"); // connecting to our database
      System.out.println("Connected!");
      stmt = con.createStatement();
      String sql = "CREATE TABLE IF NOT EXISTS Stocks " +
                        "(name TEXT PRIMARY KEY     NOT NULL," +
                        " price           TEXT    NOT NULL, " + 
                        " stocks          TEXT     NOT NULL)";
      stmt.executeUpdate(sql);
      stmt.close();
    } catch (ClassNotFoundException | SQLException e ) {
      // TODO Auto-generated catch block
      System.out.println(e+"");
    }
    
    return con; 
  }
}

