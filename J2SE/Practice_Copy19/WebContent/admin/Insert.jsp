<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="/struts-tags" prefix="s" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AdminInserting</title>
</head>

<body>
 <form action="adminInsert.action"><br><br>
 <table border="1" bgcolor="cyan">
 <tr><td>Fare<td><input type="text" name="fare" size="5">
 <td>Depart Time<td><input type="text" name="departdate" size="14">
 <td>Arrival Time<td><input type="text" name="arrivaldate" size="14">
 <td>No of Adults<td><input type="text" name="adult" size="3">
 <td>No of Children<td><input type="text" name="children" size="3">
 <td>No oF Infants<td><input type="text" name="infants" size="3">
 
 <td>Destination<td>
<select name="to">
<c:forEach var="v" items="${CityList}">
<option value="${v.cityid }">${v.cityname }</option>
</c:forEach>
</select>
 <td>Source<td>
<select name="from">
<c:forEach var="v" items="${CityList }">
<option value="${v.cityid }">${v.cityname }</option>
</c:forEach>
</select>
<td><td><input type="submit" name="cmd" value="Insert">
 </table>
 </form>
 &nbsp;<br><br>
 <c:if test="${param.cmd=='Insert' }">
 <table border="1">
 <c:forEach var="v" items="${fd}">
 
 <tr>
 <td>${v.flight_id }<td>${v.fare }<td>${v.arrivaltime }<td>${v.departtime }
 </c:forEach>
 <!-- <tr><td><input type="submit" name="sub" value="delete"><td><input type="submit" name="sub" value="update"> -->
 </table>
 </c:if>
<!-- <a href="UpdateShow.action"> Update flight Details</a> -->
 </body>
</html>