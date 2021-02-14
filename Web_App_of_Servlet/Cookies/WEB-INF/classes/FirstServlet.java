import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet{
	public void service(HttpServletRequest sreq,HttpServletResponse sres){
		PrintWriter out=null;
		try{
			sres.setContentType("text/html");
			out=sres.getWriter();
			String n1=sreq.getParameter("name");
			String n2=sreq.getParameter("roll");
			out.println("Hello= "+n1);
			out.println("Your Roll Number="+n2);
			Cookie ck1=new Cookie("name",n1);
			Cookie ck2=new Cookie("roll",n2);
			sres.addCookie(ck1);
			sres.addCookie(ck2);
			out.println("<form action='servlet2'>");
			out.println("<input type='submit' value='Go'>");
			out.println("</body></html>");
		} 
		catch(Exception ex){
			out.println(ex);
		}
		out.close();
	}
}
	 
