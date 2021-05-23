<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>scoreList</title>
</head>
<body>
學生成績：
<table border="1">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>课程</td>
        <td>分数</td>
    </tr>
<c:forEach items="${scoreList }" var="item">
    <tr>
        <td>${item.sid }</td>
        <td>${item.sname }</td>
        <td>${item.course}"</td>
        <td>${item.score }</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
