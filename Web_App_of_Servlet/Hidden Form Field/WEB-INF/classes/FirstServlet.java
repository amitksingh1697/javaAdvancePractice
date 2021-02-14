import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet
{
  public void service(HttpServletRequest sreq,HttpServletResponse sres)throws ServletException,IOException
 {
  PrintWriter out=null;
  try
   {
	  sres.setContentType("text/html");
      out=sres.getWriter();
      String n1=sreq.getParameter("name");
      String n2=sreq.getParameter("roll");
      out.println("Hello "+n1);
      out.println("Your Roll Number= "+n2);
	  out.println("<form action='servlet2'>");
      out.println("<input type='hidden' name='name' value='"+n1+"'>");
	  out.println("<input type='hidden' name='roll' value='"+n2+"'>");
      out.println("<input type='submit' value='go'>");
	  out.println("</form>");
      out.println("</boby></html>");
   }
  catch(Exception ex)
   {
	 out.println(ex);
   }
 }
}
