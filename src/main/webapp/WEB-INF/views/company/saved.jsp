<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Company Saved</title>
</head>
<body>
    <h1>Company saved</h1>
    <p><a href="/company/add">Add new company</a></p>
    <p><a href="/company/list">Show company list</a></p>
    <nav>
        <sec:authorize access="isAuthenticated()">
            <form action="<c:url value="/logout"/>" method="post">
                <input type="submit" value="Wyloguj">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </sec:authorize>
    </nav>

</body>
</html>
