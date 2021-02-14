<html>
<body>
<center>
<h1>Welcome to Login-Logout Web Application using MVC</h1>
<form action='LoginProcess.jsp' method="post">
User ID:<input type='text' name='uid' required/></br></br>
Password:<input type='password' name='pass' required/></br></br>
<input type='Submit' value='Login'/></br></br>
<input type='Reset' value='CLEAR'/></br></br>
</form>
<%
   String s=(String)session.getAttribute("msg");
   if(s!=null){
%>
   <b><%=s%></b>
<%
   }
%>
</center>
</body>
</html>