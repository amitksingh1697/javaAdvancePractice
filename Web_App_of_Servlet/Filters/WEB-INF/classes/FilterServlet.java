import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class FilterServlet extends HttpServlet
{
  public void service(HttpServletRequest sreq,HttpServletResponse sres)
  {
	PrintWriter out=null;
    try
	{
	   sres.setContentType("text/html");
	   out=sres.getWriter();
	   ServletContext s=getServletContext();
	   Integer count=(Integer)s.getAttribute("count");
	   out.print("No. of Times Website visited"+count.intValue());
	   out.close();
	}
	catch(Exception ex)
    {
	   out.println(ex);
    }
  }
}