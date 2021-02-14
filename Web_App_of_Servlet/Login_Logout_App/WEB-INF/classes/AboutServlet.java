import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class AboutServlet extends HttpServlet{
	public void service(HttpServletRequest sreq,HttpServletResponse sres){
		PrintWriter out=null;
		try{
			sres.setContentType("text/html");
			out=sres.getWriter();
			HttpSession session=sreq.getSession(false);
			if(session!=null){
				String u=(String)session.getAttribute("uid");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xyz","xyz");
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from user_info where userid='"+u+"'");
				rs.next();
				out.println("<html><body><center>");
				out.println("<h1>My Login-Logout Web Application</h1>");
				out.println("<a href='LS2'>Logout</a></br></br>");
				out.println("User Id:<b>"+rs.getString(1)+"</b><br/><br/>");
				out.println("Name:<b>"+rs.getString(2)+"</b><br/><br/>");
				out.println("Phone:<b>"+rs.getString(3)+"</b><br/><br/>");
				out.println("Age:<b>"+rs.getString(4)+"</b><br/><br/>");
				out.println("Email Id:<b>"+rs.getString(5)+"</b><br/><br/>");
				out.println("</center></boby></html>");
				con.close();
			}
			else {
				sres.sendRedirect("indexerror2.html");
			}
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
}