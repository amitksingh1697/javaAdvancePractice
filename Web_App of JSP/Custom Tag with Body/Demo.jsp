<%@ taglib uri="WEB-INF/MyTag1.tld" prefix="ct"%>
<html>
<head><title>First JSP</title></head>
<body>
<%="Hello JSP"%>
<br>
<%!String s="I love My India";%>
<ct:MyCustom a="10" b="5">
<%=s%>
</ct:MyCustom>
</body>
</html>