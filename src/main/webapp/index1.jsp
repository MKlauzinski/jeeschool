<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
    <title>Index</title>
</head>
<body>
    <jsp:include page="header.jsp"/>
    <tabel>
        <tr>
            <td>Opis</td>
            <td>Data</td>
            <td>Wiecej</td>
        </tr>
        <c:forEach var="solution" items="${recent}">
            <tr>
                <td>${solution.description}</td>
                <td>${solution.created}</td>
                <td>tutaj bedzie link do servleta z solucją</td>
            </tr>
        </c:forEach>
    </tabel>
    <jsp:include page="footer.jsp"/>
</body>
</html>
