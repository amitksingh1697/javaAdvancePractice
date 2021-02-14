import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class ContextAttribute2 extends HttpServlet {
	public void service(HttpServletRequest sreq,HttpServletResponse sres)throws ServletException,IOException {
		sres.setContentType("text/html");
		PrintWriter out=sres.getWriter();
		ServletContext ctx=getServletContext();
		String c=(String)ctx.getAttribute("company");
		out.println("Hello"+c);
	}
}