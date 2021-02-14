import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet{
	public void service(HttpServletRequest sreq,HttpServletResponse sres)throws ServletException,IOException{
		PrintWriter out=null;
		try{
			sres.setContentType("text/html");
			out=sres.getWriter();
			HttpSession session=sreq.getSession();
			String n1=(String)session.getAttribute("name");
			String n2=(String)session.getAttribute("roll");
			out.println("Your Name= "+n1);
			out.println("Your Roll Number= "+n2);
			out.println("</boby></html>");
		}
		catch(Exception ex){
			out.println(ex);
		}
	}
}
