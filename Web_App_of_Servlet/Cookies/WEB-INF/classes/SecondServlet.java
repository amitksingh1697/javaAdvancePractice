import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SecondServlet extends HttpServlet{
	public void service(HttpServletRequest sreq,HttpServletResponse sres){
		PrintWriter out=null;
		try{
			sres.setContentType("text/html");
			out=sres.getWriter();
			Cookie ck[]=sreq.getCookies();
			out.println("Your Name= "+ck[0].getValue());
			out.println("Your Roll= "+ck[1].getValue());
			out.close();
		} 
		catch(Exception ex){
			out.println(ex);
		}
	}
}