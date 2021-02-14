<%@ page errorPage="ExceptionPage.jsp" %>
<%
   String u=request.getParameter("uid");
   String p=request.getParameter("pass");
%>
    <jsp:useBean id="t1" class="bean.LoginBean" scope="session"/>
	<jsp:setProperty name="t1" property="user" value="<%=u%>"/>
	<jsp:setProperty name="t1" property="pass" value="<%=p%>"/>
   
<%
  if(t1.execute())
  {
    session.setAttribute("userid",u);
    response.sendRedirect("about.jsp");
  }
  else
  {
    session.setAttribute("msg","Wrong Id or Password.</br>");
    response.sendRedirect("login.jsp");
  }
%>
