
package org.mypackage.helper;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
import javax.servlet.Servlet;

public class CreateUser extends HttpServlet{
    
    private static final String JDBC_DRIVER = "com.mysql.jdbc.driver" ;
    private static final String DB_URL = "jdbc:mysql://localhost/space_portal?useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "";
  
    /**
     *
     * @param request
     * @param response
     * @throws IOException
     * @throws javax.servlet.ServletException
     * @throws javax.servlet.Servlet
     * @throws Servlet
     */
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
    try{
        Class.forName(JDBC_DRIVER);
        Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
        PreparedStatement emailQuery = con.prepareStatement("Select * from user_details where email like ?");
        emailQuery.setString(1, request.getParameter("email_id"));
        ResultSet rs = emailQuery.executeQuery();
        while(rs.next()){
            HttpSession session = request.getSession();
            session.setAttribute("status" , "email_exists" );
            session.setAttribute("attempted_email", request.getParameter("email_id"));
            response.sendRedirect("signup.jsp");
        }
        PreparedStatement insertStmt = con.prepareStatement("insert into user_details (firstname,lastname,email,password) values (?,?,?,?)");
                        insertStmt.setString(1,request.getParameter("firstname"));
                        insertStmt.setString(2,request.getParameter("lastname"));
                        insertStmt.setString(3,request.getParameter("email_id"));
                        insertStmt.setString(4,request.getParameter("password"));
                        insertStmt.executeUpdate();
                        response.sendRedirect("index.jsp");
        
    }catch(Exception s){
                        s.printStackTrace();
                }
    }
    
}
