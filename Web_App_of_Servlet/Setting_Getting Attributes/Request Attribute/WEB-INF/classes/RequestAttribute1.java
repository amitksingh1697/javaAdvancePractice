import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestAttribute1 extends HttpServlet{
	public void service(HttpServletRequest sreq,HttpServletResponse sres)throws ServletException,IOException{
		sres.setContentType("text/html");
		PrintWriter out=sres.getWriter();
		sreq.setAttribute("company","Incapp");
		out.println("Hello First Servlet");
		RequestDispatcher rd=sreq.getRequestDispatcher("s2");
		rd.forward(sreq,sres);
	}
}