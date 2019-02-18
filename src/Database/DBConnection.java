/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DBConnection {
    private final static String jdbcURL = 
                "jdbc:mysql://localhost/db_pulizie?user=root&password=clraul" ;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver") ;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Driver JDBC non trovato", e) ; 
		}
		Connection c;
		try {
			c = (Connection) DriverManager.getConnection(jdbcURL);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException("Impossibile connettersi al database", e) ; 
		}
		return c ;
	}
        
        
        
        
  static  Connection  _con =null;
  static String _host="jdbc:mysql://localhost:3306/db_pulizie";
  static String _driver ="com.mysql.jdbc.Driver";
  static String _user = "root";
    
  public static Connection ConnectDB(String _user,String _psw ){
        
        try{
            Class.forName(_driver);
            _con = DriverManager.getConnection(_host,_user,_psw);
            if (_con == null) {
                System.out.println("Connection cannot be established");
            }
        }
        catch(Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            _con= null;
        }
        return _con;
}
  
  public static Connection getConnectDB( ){
    try {
        if(_con.isClosed() || _con==null){
            _con=  ConnectDB("root", "clraul");
        }
    } 
    catch (SQLException e) {
       System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
    }
    return _con;
}

  public static  Boolean CnSuccess(){
  Boolean _cnSuccess=false;
        try
        {
            if (_con!=null) _cnSuccess= true;
         }
        catch(Exception e) {
                    System.out.println("Connection closed");
                    _cnSuccess=false;
        } 
        return _cnSuccess;
   }


  public static void closeConnection(Connection _conn) {

        try {
            if (_conn!=null){
            _conn.close();
            }
        } catch (Exception e) {
          System.out.println("Connection cannot be established");
        }
}


  public static void closeStatement(Statement st) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  public static void closeResultset(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

  public static void rollback(Connection connection) {
        try {
            if (connection != null) {
                connection.rollback();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
