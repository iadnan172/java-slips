<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="perfectNumber.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>Perfect Number Result</title>
</head>
<body>
    <h2>Result</h2>
    <p>The number <%= num %> is 
    <% if (isPerfect) { %>
        <strong>Perfect</strong>.
    <% } else { %>
        <strong>Not Perfect</strong>.
    <% } %>
    </p>
    <a href="index.jsp">Check another number</a>
</body>
</html>
