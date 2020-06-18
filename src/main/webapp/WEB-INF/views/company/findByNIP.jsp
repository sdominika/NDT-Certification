<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
    table * {
        border: 1px solid black;
        border-radius: 5px;
        caption-side: bottom;
        text-align: center;
        background-color: lightgray
    }
</style>
<head>
    <title>Find company by NIP</title>
</head>
<body>

<form action="/company/findByNIP" method="post">
    <input type="text" name="nip">
    <input type="submit">
</form>

<table>
    <tr>
        <th>NIP</th>
        <th>Company name</th>
        <th>Address street</th>
        <th>Address post code</th>
        <th>Address city</th>
        <th>Action</th>
    </tr>
    <tr>
        <td>${company.companyNIP}</td>
        <td>${company.companyName}</td>
        <td>${company.companyAddressStreet}</td>
        <td>${company.companyAddressPostCode}</td>
        <td>${company.companyAddressCity}</td>
        <td><a href="/company/delete/${company.id}">Usuń</a>
            <a href="/company/edit/${company.id}">Edytuj</a></td>
    </tr>

</table>


<a href="/home">Home Page</a>

</body>
</html>

