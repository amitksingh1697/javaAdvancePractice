<%@ page import="java.sql.*"%>
<html>
<body>
<center>
<% 
   String u=(String)session.getAttribute("uid");
   if(session!=null)
   { 
%>
   <h1>Login-Logout JSP!!</h1>
   <%ResultSet rs=(ResultSet)session.getAttribute("result");%>
   Welcome,<%=session%>&nbsp&nbsp&nbsp<a href='logout.jsp'>Logout</a>
   <br>Name:<%=rs.getString(2)%>
   <br>Phone:<%=rs.getString(3)%>
   <br>Age:<%=rs.getString(4)%>
   <br>Email ID:<%=rs.getString(5)%>
<%
   }
   else{
%>   
    <%@ include file="login.html"%>
    </br>Please Login first!!!</br>
<%
    }
%>
</center>
</body>
</html>