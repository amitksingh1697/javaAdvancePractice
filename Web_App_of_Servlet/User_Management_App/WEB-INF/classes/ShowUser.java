import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
public class ShowUser extends HttpServlet{
public void service(HttpServletRequest sreq,HttpServletResponse sres){
PrintWriter out=null;
  try
  {
   sres.setContentType("text/html");
   out=sres.getWriter();
   String u=sreq.getParameter("user");
   out.println("<html><body><center>");
   out.println("<h1>User Management Web Application</h1>");
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xyz","xyz");
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from user_info where userid='"+u+"'");
   if(rs.next())
    {
     out.println("User Id:<b>"+rs.getString(1)+"</b><br/><br/>");
     out.println("Name:<b>"+rs.getString(2)+"</b><br/><br/>");
     out.println("Phone:<b>"+rs.getString(3)+"</b><br/><br/>");
     out.println("Age:<b>"+rs.getString(4)+"</b><br/><br/>");
     out.println("Email Id:<b>"+rs.getString(5)+"</b><br/><br/>");
     out.println("<a href='index.html'><b>home</b></a>");
     out.println("</boby></html></center>");
     con.close();
	}
  }
  catch(Exception ex)
  {
	out.println(ex);
  }
 }
}