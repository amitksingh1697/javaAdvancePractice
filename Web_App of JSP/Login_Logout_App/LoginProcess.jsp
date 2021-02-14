<html>
<%@ page import="java.sql.*"%>
<body>
<center>
<h1>Welcome to Login-Logout Web Application</h1>
<%
   String u=request.getParameter("uid");
   String p=request.getParameter("pass");
   Statement st=(Statement)application.getAttribute("stmt");
ResultSet rs=st.executeQuery("select * from user_info where userid='"+u+"' and pass='"+p+"'");
  if(rs.next())
  {
    session.setAttribute("uid",u);
	session.setAttribute("result",rs);
    response.sendRedirect("about.jsp");
  }
  else
  {
%>
    <%@ include file="login.html"%>
    </br>Wrong Entries!!!</br>
<% 
  }
%>
</center>
</body>
</html>