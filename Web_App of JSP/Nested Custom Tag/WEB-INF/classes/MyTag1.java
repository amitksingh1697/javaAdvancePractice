package my;
import javax.servlet.jsp.*;
import java.io.*;
import javax.servlet.jsp.tagext.*;
public class MyTag1 extends TagSupport
{
	JspWriter out;
  public int doStartTag() throws JspException
  {
    out=pageContext.getOut();
	try
	{
	   out.println("hello Nested Custom Tag");
	   out.println("</br>");
	   MyInterface x=(MyInterface)TagSupport.findAncestorWithClass(this,MyInterface.class);
	   String s=x.getData();
	   out.println("Data= "+s);
	}
	catch(Exception e){
		System.out.println(e);
	}
	//return SKIP_BODY;
	return EVAL_BODY_INCLUDE;
  }
}