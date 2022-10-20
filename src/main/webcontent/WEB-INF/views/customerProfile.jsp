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
<title>profile</title>
</head>
<body>
<div align="center">
    <h2>Profile</h2>
    <table border="1" cellpadding="5">
                  <tr>
                      <th>AddressId</th>
                      <th>Street</th>
                      <th>City</th>
                      <th>District</th>
                      <th>PinCode</th>

                  </tr>
                  <c:forEach items="${profile}" var="profile">
                  <tr>
                      <td>${profile.addressId}</td>
                      <td>${profile.street}</td>
                      <td>${profile.city}</td>
                      <td>${profile.district}</td>
                      <td>${profile.pinCode}</td>
                  </tr>
                  </c:forEach>
              </table>
              <a href="http://localhost:8080/Store">Home</a>
    </div>
    </body>
    </html>