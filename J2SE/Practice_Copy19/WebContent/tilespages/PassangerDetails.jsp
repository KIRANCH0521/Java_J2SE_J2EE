<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="Pojos.FlightPojos"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PassengerDetails</title>
</head>
<body bgcolor="Cyan" >
<b>Fill Up Your Details</b>
<form action="payment.action" >


<c:forEach var="v" items="${flightdetails }">
<c:if test="${param.r1==v.flight_id }">


<center>the flight id is   &nbsp;&nbsp;&nbsp;&nbsp;${v.flight_id }<br/>
<center>the flight fare is&nbsp;&nbsp;&nbsp;&nbsp;${v.fare }<br/>

<center>the flight departtime is&nbsp;&nbsp;&nbsp;&nbsp;${v.departtime.time }<br/>
<center>the flight arrivaltime  is&nbsp;&nbsp;&nbsp;&nbsp;${v.arrivaldate }<br/>


</c:if>


</c:forEach>
<table align="center">
<tr><td>ur flight id is<td><input type="text" name="flight_id" value="${param.r1 }" readonly="readonly"/>
<tr><td>enter first name*<td><input type="text" name="firstname">
<tr><td>enter last name*<td><input type="text" name="lastname">
<tr><td>enter email id*<td><input type="text" name="emailid">
<tr><td>enter password*<td><input type="password" name="password">
<tr><td>enter phone no*<td><input type="text" name="phoneno" maxlength="10" size="10">
<tr><td>enter secondary phone no<td><input type="text" name="secondaryphoneno" maxlength="10" size="10">
<tr><td>enter adults no*<td><input type="text" name="adult"/>
<tr><td>enter childrne no*<td><input type="text" name="children"/>
<tr><td>enter infants no*<td><input type="text" name="infants"/>


<tr><td><td><input type="submit" name="cmd" value="Payment">
</table>
</form>
</body>
</html>