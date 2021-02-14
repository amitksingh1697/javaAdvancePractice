import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ContextAttribute1 extends HttpServlet{
	public void service(HttpServletRequest sreq,HttpServletResponse sres)throws ServletException,IOException{
		sres.setContentType("text/html");
		PrintWriter out=sres.getWriter();
		ServletContext ctx=getServletContext();
		ctx.setAttribute("company","Incapp");
		out.println("Hello First Servlet");
		out.println("<a href='s2'>second servlet</a>");
	}
}