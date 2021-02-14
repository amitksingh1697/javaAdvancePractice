<%@ taglib uri="WEB-INF/MyTag1.tld" prefix="ct"%>
<html>
<head><title>First JSP</title></head>
<body>
<%out.println("Hello JSP");%>
<ct:MyCustom a="10" b="5">
    <ct:MyNested />
</ct:MyCustom>
<br>Hello Jai<br>
  <ct:MyNested />
</body>
</html>