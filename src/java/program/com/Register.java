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
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Lenovo 
 */
public class Register extends HttpServlet
{
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException
  {
       res.setContentType("text/html");
       PrintWriter out=res.getWriter();
        
      String email2=req.getParameter("email1");
      String name2=req.getParameter("name1");
      String pass2=req.getParameter("pass1");
     
      HttpSession session= req.getSession();
      
      try
      {
          Connection con= dbconnection.getConnect();
          PreparedStatement ps=con.prepareStatement("INSERT INTO registerdemo (name, email, password) VALUES (?, ?, ?)");
          ps.setString(1, name2);
          ps.setString(2, email2);
          ps.setString(3, pass2);
          
          int i=ps.executeUpdate();
          if(i>0)
          {
              Employee emp= new Employee();
              emp.setName(name2);
              emp.setEmail(email2);
              
              session.setAttribute("session_emp", emp);
              
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
