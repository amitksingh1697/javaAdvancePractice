import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
public class UserProcess extends HttpServlet{
public void service(HttpServletRequest sreq,HttpServletResponse sres){
PrintWriter out=null;
  try
  {
   sres.setContentType("text/html");
   out=sres.getWriter();
   String u=sreq.getParameter("user");
   out.println("<html><body>");
   out.println("<h1>User Management Web Application</h1>");
   Class.forName("oracle.jdbc.driver.OracleDriver");
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xyz","xyz");
   Statement st=con.createStatement();
   ResultSet rs=st.executeQuery("select * from user_info where userid='"+u+"'");
   if(rs.next())
    {
     RequestDispatcher rd=sreq.getRequestDispatcher("su");
	 rd.forward(sreq,sres);
    }
	else
	{
		sres.sendRedirect("indexerror.html");
	}
   out.println("</boby></html>");
  // con.close();
  }
  catch(Exception ex)
  {
	out.println(ex);
  }
 }
}