<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
</head>
<body>
    <div align="center">
        <h2>New Customer</h2>
        <form:form action="/Store/store" method="post" modelAttribute="customer">
            <table border="0" cellpadding="5">
                <tr>
                    <td>CustomerId: </td>
                    <td><form:input path="customerId" /></td>
                </tr>

                <tr>
                    <td>Name: </td>
                    <td><form:input path="customerName" /></td>
                </tr>
                <tr>
                    <td>Password: </td>
                    <td><form:input path="password" /></td>
                </tr>

                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>
            </table>
        </form:form>
        <a href="http://localhost:8080/Store">Home</a>
    </div>
</body>
</html>