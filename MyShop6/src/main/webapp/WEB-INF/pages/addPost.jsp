
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            width: 600px;
            margin: 0 auto;

            background-color: lightblue;

        }
    </style>

</head>
<body>

<a href="/">Back to home</a>

<form method="post">
    <label>
        Title <input type="text" name="title">
    </label>

    <label>
        Image<input type="text" name="imgUrl">
    </label>

    <input type="submit" value="Add post">
</form>

</body>
</html>
