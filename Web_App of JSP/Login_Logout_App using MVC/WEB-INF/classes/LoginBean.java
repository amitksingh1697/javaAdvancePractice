package bean;
import java.sql.*;
public class LoginBean implements java.io.Serializable
{
  public LoginBean(){}
  private String user;
  private String pass;
  private ResultSet rs;
  public String getUser()
  {
    return user;
  }
  public void setUser(String u)
  {
    user=u;
  }
  public String getPass()
  {
    return pass;
  }
  public void setPass(String pass)
  {
    this.pass=pass;
  }
  public void setRs(ResultSet r)
  {
	  rs=r;
  }
  public ResultSet getRs()
  {
	  return rs;
  }
  public boolean execute(){
	  try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ID","PASSWORD");
Statement st=con.createStatement();
rs=st.executeQuery("select * from user_info where userid='"+user+"' and pass='"+pass+"'");
          if(rs.next())
		  {
			  return true;
		  }
		  else
		  {
			  return false;
		  }
 	   }
	 catch(Exception ex)
	 {
		 return false;
	 }
  }
}