<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: dariu
  Date: 27.05.2020
  Time: 10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
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
    <title>Title</title>
</head>
<body>
<h1>HomePage</h1>
<p><a href="/company/list">SHOW COMPANY LIST</a></p>
<p><a href="/company/list">EDIT COMPANY DATA</a></p>
<p><a href="/company/list">DELETE COMPANY DATA</a></p>
<p><a href="/company/add">ADD COMPANY DATA</a></p>

</body>
</html>
