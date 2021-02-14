import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class HitCounter extends HttpServlet {
	public void service(HttpServletRequest sreq,HttpServletResponse sres)throws ServletException,IOException {
		sres.setContentType("text/html");
		PrintWriter out=sres.getWriter();
		ServletContext ctx=getServletContext();
		Integer c=(Integer)ctx.getAttribute("count");
		if(c==null)
		  c=0;
		c++;
		ctx.setAttribute("count",c);
		out.println(c);
	}
}