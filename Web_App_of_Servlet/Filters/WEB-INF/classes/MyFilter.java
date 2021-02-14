import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class MyFilter implements Filter
{
  FilterConfig config;
  PrintWriter out=null;
  public void init(FilterConfig c)
  {
    try
	{
	   config=c;
	}
	catch(Exception ex)
    {
	   out.println(ex);
    }
  }
  public void doFilter(ServletRequest sreq,ServletResponse sres,FilterChain chain)
  {
	try
	{
	   ServletContext ctx=config.getServletContext();
	   Integer count=(Integer)ctx.getAttribute("count");
	   if(count==null)
	   count=new Integer(0);
	   count=new Integer(count.intValue()+1);
	   ctx.setAttribute("count",count);
	   chain.doFilter(sreq,sres);
	}
	catch(Exception ex)
    {
	   out.println(ex);
    }
  }
  public void destroy(){}
}