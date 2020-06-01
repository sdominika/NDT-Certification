<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
    table * {
        border: 1px solid black;
        border-radius: 1px;
        caption-side: bottom;
        text-align: center;
        background-color: #529acc
    }
    p * {
        border: 1px solid black;
        border-radius: 5px;
        caption-side: bottom;
        text-align: center;
        background-color: #282c34;
        color: white;
        text-decoration: none;
        padding: 5px;
    }
</style>
<head>
    <title>Admin panel</title>
</head>
<body>

<table>
    <tr>
        <th>FIRST NAME</th>
        <th>LAST NAME</th>
        <th>USERNAME/EMAIL</th>
        <th>ROLES</th>
        <th>ACTION</th>

    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.username}</td>
            <td><c:forEach items="${user.roles}" var="role">${role.name}</c:forEach></td>
            <td><a href="/admin/edit/${user.id}">Edit</a>
                <a href="/admin/delete/${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<p><a href="/admin/addUser">Add user</a></p>
<p><a href="/admin/addAdmin">Add admin</a></p><br>

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
