<%@ page import="java.sql.*"%>
<%@ page errorPage="ExceptionPage.jsp"%>
<html>
<body>
<center>
<% 
   String n=(String)session.getAttribute("userid");
   if(n!=null)
   { 
%>
   <jsp:useBean id="t1" class="bean.LoginBean" scope="session"/>
<%
   ResultSet rs=t1.getRs();
%>
   <h1>Login-Logout App!!</h1>
   Welcome <b><%=rs.getString(2)%></b></hr>
   <a href='logout.jsp'>Logout</a></br></br>
   User ID:<%=rs.getString(1)%></br></br>
   Phone:<%=rs.getString(3)%></br></br>
   Age:<%=rs.getString(4)%></br></br>
   Email ID:<%=rs.getString(5)%></br></br>
<%
   }
   else{
	   session.setAttribute("msg","Please Login First!!!</br>");
	   response.sendRedirect("login.jsp");
   }
%>   
</center>
</body>
</html>