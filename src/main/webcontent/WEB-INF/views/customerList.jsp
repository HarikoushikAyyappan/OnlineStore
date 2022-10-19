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
<title>Person List</title>
</head>
<body>
<div align="center">
    <h2>Customer List</h2>
    <table border="1" cellpadding="5">
                  <tr>
                      <th>CustomerId</th>
                      <th>CustomerName</th>
                      <th>password</th>
                      <th>AddressId</th>
                  </tr>
                  <c:forEach items="${customerList}" var="customer">
                  <tr>
                      <td>${customer.customerId}</td>
                      <td>${customer.customerName}</td>
                      <td>${customer.password}</td>
                      <td>${customer.addressId}</td>
                  </tr>
                  </c:forEach>
              </table>
              <a href="http://localhost:8080/Shop">Home</a>
    </div>
    </body>
    </html>
