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
<title>Admin Page</title>
</head>
<body>
<div align="center">
    <h2>Admin</h2>
    <h2>Search Result</h2>
        <table border="1" cellpadding="5">
            <tr>
                <th>AdminID</th>
                <th>AdminName</th>
            </tr>
            <c:forEach items="${result}" var="admin">
            <tr>
                <td>${admin.adminId}</td>
                <td>${admin.adminName}</td>

            </tr>
            </c:forEach>
        </table>
     <form method="get"  action="/Store/adminListOfProducts">
            </br>List    <input type="submit"  value="List Of Products"/></form>
     <form method="get"  action="/Store/listOfCustomers">
        </br>Add    <input type="submit"  value="List of Customers"/></form>
</div>
</body>
</html>