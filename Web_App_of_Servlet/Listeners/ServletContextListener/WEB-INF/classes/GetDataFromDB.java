import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
public class GetDataFromDB extends HttpServlet
{
  public void service(HttpServletRequest sreq,HttpServletResponse sres)
  {
    sres.setContentType("text/html");
    PrintWriter out=null;
	try
	{
	out=sres.getWriter();
	ServletContext ctx=getServletContext();
	Statement st=(Statement)ctx.getAttribute("stmt");
	ResultSet rs=st.executeQuery("select * from user_info");
	while(rs.next())
	out.print("</br>"+rs.getString(3)+": "+rs.getString(4));
	}
	catch(Exception ex)
    {
	  out.println(ex);
    }
	out.close();
  }
}