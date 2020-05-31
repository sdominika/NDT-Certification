<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>Company List</title>
</head>
<body>
<table>
    <tr>
        <th>COMPANY NIP</th>
        <th>COMPANY NAME</th>
        <th>COMPANY STREET </th>
        <th>COMPANY CODE POST</th>
        <th>COMPANY CITY</th>
        <th>ACTION</th>
    </tr>
    <c:forEach items="${companies}" var="companyData">
            <tr>
                <td>${companyData.companyNIP}</td>
                <td>${companyData.companyName}</td>
                <td>${companyData.companyAddressStreet}}</td>
                <td>${companyData.companyAddressPostCode}}</td>
                <td>${companyData.companyAddressCity}}</td>
                <td><a href="/company/delete/${companyData.id}">Usuń</a>
                    <a href="/company/edit/${companyData.id}">Edytuj</a></td>
            </tr>
        </c:forEach>
</table>

<a href="/company/add">Add</a>
<a href="/home">Home Page</a>

</body>
</html>
