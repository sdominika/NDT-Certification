<%--
  Created by IntelliJ IDEA.
  User: skute
  Date: 29.05.2020
  Time: 14:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Company data edition</title>
</head>
<body>
<h1>Company data edition</h1>
<form:form method="post" modelAttribute="companyData" action="/company/edit">
    <form:hidden path="id"/>
    <div><label>NIP: <form:input path="companyNIP"/></label></div>
    <form:errors path="companyNIP"/>
    <div><label>Nazwa firmy: <form:input path="companyName"/></label></div>
    <form:errors path="companyName"/>
    <div><label>Adres firmy: <form:input path="companyAddressStreet"/></label></div>
    <form:errors path="companyAddressStreet"/>
    <div><label>Kod pocztowy: <form:input path="companyAddressPostCode"/></label></div>
    <form:errors path="companyAddressPostCode"/>
    <div><label>Miejscowość: <form:input path="companyAddressCity"/></label></div>
    <form:errors path="companyAddressCity"/><br>
    <input type="submit" value="Confirm">
</form:form>
<div>
    Home page-
    <a href="/home"> home page </a>
</div>

</body>
</html>