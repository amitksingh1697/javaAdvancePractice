import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
public class RegisterUser extends HttpServlet{
public void service(HttpServletRequest sreq,HttpServletResponse sres){
PrintWriter out=null;
  try
  {
   sres.setContentType("text/html");
   out=sres.getWriter();
   String s1=sreq.getParameter("name");
   String s2=sreq.getParameter("phone");
   String s3=sreq.getParameter("age");
   int n=Integer.parseInt(s3);
   String s4=sreq.getParameter("email");
   out.println("<html><body>");
   out.println("<h1>User Management Web Application</h1>");
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xyz","xyz");
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from user_info where email='"+s4+"'");
   if(rs.next())
    {
     sres.sendRedirect("registererror.html");
    }
	else
	{
		st.executeUpdate("insert into user_info (name,phone,age,email) values('"+s1+"','"+s2+"',"+n+",'"+s4+"')");
		sres.sendRedirect("registersuccess.html");
	}
   out.println("</boby></html>");
   con.close();
  }
  catch(Exception ex)
  {
	out.println(ex);
  }
 }
}