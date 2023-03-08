<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        div {

            margin-top: 0px;
            margin-bottom: 100px;
            margin-right: 10px;
            margin-left: 1700px;

        }

        body {
            background-color: lavenderblush;
        }


    </style>

</head>
<body>

<div>
    <button class="button button1" onclick="window.location='/add';" value=>Add post</button>
    <button class="button button1" onclick="window.location='/loggedIn';" value=>Back to home</button>

</div>

<c:forEach var="post" items="${post}">
    <c:out value="${post.title}"/>
<img src="${post.imgUrl}"/>

<a href="${pageContext.request.contextPath}/delete?postId=${post.postId}">Delete</a>


<br/>


</c:forEach>

</body>
</html>
