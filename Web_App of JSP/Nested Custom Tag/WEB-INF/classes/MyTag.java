package my;
import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.jsp.tagext.*;
public class MyTag extends TagSupport implements MyInterface
{
	private int a,b,c;
	JspWriter out;
	public void setA(int a)
	{
		this.a=a;
	}
	public void setB(int b)
	{
		this.b=b;
	}
	public int getA()
	{
		return a;
	}
	public int getB()
	{
		return b;
	}
  public int doStartTag() throws JspException
  {
    out=pageContext.getOut();
	try
	{
	   out.println("hello Custom Tag");
	   out.println("</br>");
	   int c=a+b;
	   out.println("Sum= "+c);
	   }
	catch(Exception e){
		System.out.println(e);
	}
	//return SKIP_BODY;
	return EVAL_BODY_INCLUDE;
  }
  public int doAfterBody() throws JspException
  {
	  if(++c<5)
	  {
		  return EVAL_BODY_AGAIN;
	  }
	  else
		  return SKIP_BODY;
  }
  public String getData()
  {
	  return "Hello Incapp";
  }
}