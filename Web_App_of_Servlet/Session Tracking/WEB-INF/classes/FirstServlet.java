import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet{
	public void service(HttpServletRequest sreq,HttpServletResponse sres)throws ServletException,IOException{
		PrintWriter out=null;
		try{
		  sres.setContentType("text/html");
		  out=sres.getWriter();
		  String n1=sreq.getParameter("name");
		  String n2=sreq.getParameter("roll");
		  out.println("Hello "+n1);
		  out.println("Your Roll Number= "+n2);
		  HttpSession session=sreq.getSession();
		  session.setAttribute("name",n1);
		  session.setAttribute("roll",n2);
		  out.println("<br><a href='servlet2'>go</a>");
		  out.println("</boby></html>");
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
}
