<html>
<head>
      <title>Demo of JSP Param Action Tags</title>
</head>	
<body>  
      <h1>JSP page:Demo Param along with forward</h1>
	  <jsp:forward page="second.jsp">
	  <jsp:param name="date" value="20-05-2010"/>
	  <jsp:param name="time" value="10:15AM"/>
	  <jsp:param name="data" value="ABC"/>
	  </jsp:forward>
</body>
</html>