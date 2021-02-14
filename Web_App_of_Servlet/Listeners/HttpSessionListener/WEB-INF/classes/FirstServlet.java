import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet
{
  public void service(HttpServletRequest sreq,HttpServletResponse sres)
  {
	  PrintWriter out=null;
    try
	{
	   sres.setContentType("text/html");
	   out=sres.getWriter();
	   String n=sreq.getParameter("user");
	   out.print("Welcome"+n);
	   HttpSession session=sreq.getSession();
	   session.setAttribute("user",n);
	   ServletContext ctx=getServletContext();
	   int t=(Integer)ctx.getAttribute("Total Session");
	   int c=(Integer)ctx.getAttribute("Current Session");
	   out.print("<br>Total Session="+t);
	   out.print("<br>Current Session="+c);
	   out.print("<br><a href='Logout'>Logout</a>");
	   out.close();   
	}
	catch(Exception ex)
    {
	   out.println(ex);
    }
  }
}