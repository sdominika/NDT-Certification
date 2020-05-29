<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin panel</title>
</head>
<body>
<nav>
    <sec:authorize access="isAuthenticated()">
        <form action="<c:url value="/logout"/>" method="post">
            <input type="submit" value="Wyloguj">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
    </sec:authorize>
</nav>
<table>
    <tr>
        <th>First name</th>
        <th>Last name</th>
        <th>Username/email</th>
        <th>Roles</th>
        <th>Actions</th>
    </tr>
<c:forEach items="${users}" var="user">
    <tr>
        <td>${user.firstName}</td>
        <td>${user.lastName}</td>
        <td>${user.username}</td>
        <td><c:forEach items="${user.roles}" var="role">${role.name}</c:forEach></td>
        <td><a href="/admin/edit/${user.id}">Edit</a></td>
        <td><a href="/admin/delete/${user.id}">Delete</a></td>
    </tr>
</c:forEach>
<p><a href="/admin/addUser">Add user</a></p>
<p><a href="/admin/addAdmin">Add admin</a></p>
</body>
</html>
