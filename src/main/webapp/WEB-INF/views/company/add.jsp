<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Company Data Form</title>
</head>
<body>
<h1>Dodaj nową firmę</h1>
<form:form modelAttribute="newCompany" method="post" action="/company/add">
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
    <input type="submit" value="Save">
</form:form>
</body>
</html>
