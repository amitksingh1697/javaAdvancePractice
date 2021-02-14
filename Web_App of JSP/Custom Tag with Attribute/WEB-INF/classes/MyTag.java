package my;
import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.jsp.tagext.*;
public class MyTag extends TagSupport
{
	int a,b;
	JspWriter out;
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
  public int doStartTag() throws JspException
  {
    out=pageContext.getOut();
	try
	{
	   out.println("hello Custom Tag");
	   out.println("</br>");
	}
	catch(Exception e){
		System.out.println(e);
	}
	//return SKIP_BODY;
	return EVAL_BODY_INCLUDE;
  }
  public int doEndTag() throws JspException
  {
     try
	 {
		 
	   int c=a+b;
	   out.println("sum= "+c);
	 }
	 catch(Exception e){
		 System.out.println(e);
	 }
	// return EVAL_PAGE;
	 return SKIP_PAGE;
  }
}