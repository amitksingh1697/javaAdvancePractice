import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest sreq,HttpServletResponse sres){
		PrintWriter out=null;
		try{
			sres.setContentType("text/html");
			out=sres.getWriter();
			String u=sreq.getParameter("uid");
			String p=sreq.getParameter("pass");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xyz","xyz");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from user_info where userid='"+u+"' and pass='"+p+"'");
			if(rs.next()){
			HttpSession session=sreq.getSession();
			session.setAttribute("uid",u);
			sres.sendRedirect("AS");
			}
			else{
			sres.sendRedirect("loginError.html");
			}
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
}