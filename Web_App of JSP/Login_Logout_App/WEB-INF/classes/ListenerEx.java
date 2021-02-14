import javax.servlet.*;
import java.sql.*;
public class ListenerEx implements ServletContextListener
{
  public void contextInitialized(ServletContextEvent event)
  {
    try
	{
	 Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","xyz","xyz");
     Statement st=con.createStatement();
	 ServletContext ctx=event.getServletContext();
	 ctx.setAttribute("dbCon"con);
	 ctx.setAttribute("stmt",st);
	}
	catch(Exception e)
    {
	  e.printStackTrace();
    }
  }
  public void contextDestroyed(ServletContextEvent e){}
}