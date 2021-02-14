import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class Logout extends HttpServlet
{
  public void service(HttpServletRequest sreq,HttpServletResponse sres)
  {
	  PrintWriter out=null;
    try
	{
	   sres.setContentType("text/html");
	   out=sres.getWriter();
	   HttpSession session=sreq.getSession(false);
	   session.invalidate();
	   out.print("Logout Successfully");
	   out.print("<br><a href='index.html'>Logout</a>");
	   out.close();
    }
	catch(Exception ex)
    {
	   out.println(ex);
    }
  }
}	 