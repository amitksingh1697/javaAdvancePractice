<%@ taglib uri="WEB-INF/MyTag1.tld" prefix="ct"%>
<html>
<head><title>First JSP</title></head>
<body>
<%="Hello JSP"%>
<br>
<ct:MyCustom a="10" b="5">
<%=sum%>
</ct:MyCustom>
</body>
</html>