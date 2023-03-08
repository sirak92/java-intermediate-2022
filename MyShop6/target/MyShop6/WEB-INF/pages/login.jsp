
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>

    <style>
        body {
            width: 600px;
            margin: 0 auto;


            background-color: lightcyan;
        }

        .error{
            color: red;
        }

    </style>
</head>
<body>
<a href="/">Back to home</a>

<c:if test="${param['error'] != null}">
    <p class="error">INVALID USERNAME OR PASSWORD</p>
</c:if>

<form method="post">
    <label>
        User name <input type="text" name="userName">
    </label>

    <label>
        Password <input type="password" name="password">
    </label>

    <input type="submit" value="Login">
</form>

</body>
</html>
