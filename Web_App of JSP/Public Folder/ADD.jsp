<html>
<body>
<h1>My First Web Application using JSP</h1>
<%
   int n1=Integer.parseInt(request.getParameter("num1"));
   int n2=Integer.parseInt(request.getParameter("num2"));
   int n=n1+n2;
%>
Sum of <b><%=n1%></b> and <b><%=n2%></b> = <b><%=n%></b>
</body>
</html>