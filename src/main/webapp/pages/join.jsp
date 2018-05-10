<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Our
  Date: 10.05.2018
  Time: 21:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <sf:form action="/save/car/user" method="post" modelAttribute="carModel">
        <sf:input path="model"/>
        <sf:select path="user">
            <c:forEach items="${users}" var="user">
                <sf:option value="${user.id}">
                    ${user.name}
                </sf:option>
            </c:forEach>
        </sf:select>

        <input type="submit">
    </sf:form>

</body>
</html>
