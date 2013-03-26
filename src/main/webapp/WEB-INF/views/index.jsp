<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <title>Internationalization Example</title>
</head>
<body>
<table>
    <tr>
        <td colspan="2">
            <spring:message code="title.name"/>
        </td>
    </tr>
    <tr>
        <td>
            ${firstName}
        </td>
        <td>
            <spring:message code="last.name"/>
        </td>
    </tr>
</table>
</body>
</html>