<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // Get the number from request
    int num = Integer.parseInt(request.getParameter("number"));
    int sum = 0;

    // Calculate the sum of divisors
    for (int i = 1; i <= num / 2; i++) {
        if (num % i == 0) {
            sum += i;
        }
    }

    // Check if it is a perfect number
    boolean isPerfect = (sum == num);
%>
