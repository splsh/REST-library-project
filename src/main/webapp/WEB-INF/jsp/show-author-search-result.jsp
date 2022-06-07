<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title></title>
</head>
<body>
<h1>Finished</h1>
<%--<h2>Name: ${answer.authorList[1]}</h2>--%>
<%--<h2>Surname: ${answer.authorList[0]}</h2>--%>

Result:
<%--<c:forEach var="writer" items="${answer.authorList}">--%>

<%--<tr>--%>
<%--    <td>writer.firstName</td>--%>
<%--    <td>writer.lastName</td>--%>
<%--    <td>writer</td>--%>
<%--    <th>writer.lastName</th>--%>
<%--    <th>writer</th>--%>

<%--</tr>--%>

<%--</c:forEach>--%>


<ul>
    <c:forEach var="author" items="${answer.authorList}">
    <li>
            ${author}
    </li>
    </c:forEach>

    </ul>>
</body>

</html>