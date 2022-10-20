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
<title>Customer Page</title>
</head>
<body>
<div align="center">
    <h2>Customer</h2>
    <h2>Search Result</h2>
        <table border="1" cellpadding="5">
            <tr>
                <th>CustomerID</th>
                <th>AddressID</th>
            </tr>
            <c:forEach items="${customerResult}" var="customer">
            <tr>
                <td>${customer.customerId}</td>
                <td>${customer.addressId}</td>
                <td><a href="http://localhost:8080/Store/orderList/${customer.customerId}/">viewOrders</a>
                                                 &nbsp;&nbsp;&nbsp;
                </td>
              <td><a href="http://localhost:8080/Store/viewProfile/${customer.addressId}/">viewProfile</a>
                                                                 &nbsp;&nbsp;&nbsp;
              </td>
            </tr>
            </c:forEach>
        </table>
     <form method="get"  action="/Store/listOfProducts">
            </br>List    <input type="submit"  value="List Of Products"/></form>
</div>
</body>
</html>
