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
	   int c=a+b;
	   pageContext.setAttribute("sum",String.valueOf(c));
	}
	catch(Exception e){
		System.out.println(e);
	}
	//return SKIP_BODY;
	return EVAL_BODY_INCLUDE;
  }
  public int doAfterBody() throws JspException
  {
		  return SKIP_BODY;
  }
}