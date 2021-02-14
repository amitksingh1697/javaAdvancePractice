import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestAttribute2 extends HttpServlet{
	public void service(HttpServletRequest sreq,HttpServletResponse sres)throws ServletException,IOException{
		sres.setContentType("text/html");
		PrintWriter out=sres.getWriter();
		String c=(String)sreq.getAttribute("company");
		out.println("Hello "+c);
	}
}