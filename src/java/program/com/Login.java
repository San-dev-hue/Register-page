/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package program.com;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Lenovo
 */
public class Login extends HttpServlet
{
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException
  {
       String email2=req.getParameter("email1");
       String pass2=req.getParameter("pass1");
       
       HttpSession session=req.getSession();
      try
      {
       Connection con= dbconnection.getConnect();
          PreparedStatement ps=con.prepareStatement("select *from registerdemo where email=? and password=?");
         
          ps.setString(1, email2);
          ps.setString(2, pass2);
          
          ResultSet rs=ps.executeQuery();
          
          
          if( rs.next())
          {
            String name2=rs.getString("name");
             Employee emp= new Employee();
             emp.setName(name2);
             emp.setEmail(email2);
             
             session.setAttribute("session_emp",emp);
             res.sendRedirect("profile.jsp") ;
          }
          else
          {
              res.sendRedirect("index.jsp");
          }   
      }  
      catch(Exception e)
      {
          e.printStackTrace();
      } 
      
 }

}