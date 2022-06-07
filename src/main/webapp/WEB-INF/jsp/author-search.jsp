<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Author Search util</h1>
<h2></h2>

<form:form action="getAuthor" modelAttribute="author" method="get">

Surname <form:input path="lastName"/>
<form:errors path="lastName"/>

<input type="submit" value="Ok">
</form:form>

</body>

</html>