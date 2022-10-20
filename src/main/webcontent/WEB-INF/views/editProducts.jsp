<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Products</title>
</head>
<body>
    <div align="center">
        <h2>Edit Products</h2>
        <form:form action="/Store/save" method="post" modelAttribute="products">
            <table border="0" cellpadding="5">
                <tr>
                    <td>ProductId: </td>
                    <td>${products.productId}
                        <form:hidden path="productId"/>
                    </td>
                </tr>
                <tr>
                    <td>ProductName: </td>
                    <td><form:input path="name" /></td>
                </tr>
                <tr>
                    <td>Count: </td>
                    <td><form:input path="count" /></td>
                </tr>
                <tr>
                    <td>Cost: </td>
                    <td><form:input path="cost" /></td>
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