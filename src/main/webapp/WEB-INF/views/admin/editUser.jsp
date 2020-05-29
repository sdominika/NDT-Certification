<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User edition</title>
</head>
<body>
<form:form method="post" action="/admin/edit" modelAttribute="user">
    <form:hidden path="id"/>
    <form:hidden path="username"/>
<%--    <form:hidden path="password"/>--%>
    <div>
        <label>Enter Your name: <form:input path="firstName"/></label>
        <form:errors path="firstName"/>
    </div>
    <div>
        <label>Enter Your surname: <form:input path="lastName"/></label>
        <form:errors path="lastName"/>
    </div>
    <div>
        <label>Enter Your address: <form:input path="email"/></label>
        <form:errors path="email"/>
    </div>
    <input type="submit" value="Confirm">
</form:form>
</body>
</html>
