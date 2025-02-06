/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class dbconnection 
{    
    static Connection con;
    public static Connection getConnect()
    {
        try
        {
          Class.forName("com.mysql.cj.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/beandemo", "root","Developer@39");
        } 
        catch(ClassNotFoundException | SQLException e)
        {
          System.out.println(e);
          
        }
        
                
        return con; 
    } 
     
    public static void closeConnection() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Database connection closed successfully.");
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
  
}
