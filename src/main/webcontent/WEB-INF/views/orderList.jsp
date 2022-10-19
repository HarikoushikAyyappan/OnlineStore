<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Order List</title>
</head>
<body>
<div align="center">
    <h2>Order List</h2>
    <table border="1" cellpadding="5">
                  <tr>
                      <th>OrderId</th>
                      <th>Status</th>
                      <th>ProductId</th>
                      <th>ProductName</th>
                      <th>Cost</th>
                  </tr>
                  <c:forEach items="${orderList}" var="order">
                  <tr>
                      <td>${order.orderId}</td>
                      <td>${order.status}</td>
                      <td>${order.productId}</td>
                      <td>${order.name}</td>
                      <td>${order.cost}</td>
                  </tr>
                  </c:forEach>
              </table>
              <a href="http://localhost:8080/Store">Home</a>
    </div>
    </body>
    </html>