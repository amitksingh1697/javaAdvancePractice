import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
public class Servlet2 extends HttpServlet
{
public void service(HttpServletRequest sreq,HttpServletResponse sres)
 {
PrintWriter out=null;
   try
   {
sres.setContentType("text/html");
out=sres.getWriter();
String n=sreq.getParameter("name");
out.println("<html><body>");
out.println("<h1>My Web Application</h1>");
out.println("Hello s2");
out.println("Name= "+n);
out.println("Bye s2");
    } 
   catch(Exception ex)
   {
	out.println(ex);
   }
 }
}