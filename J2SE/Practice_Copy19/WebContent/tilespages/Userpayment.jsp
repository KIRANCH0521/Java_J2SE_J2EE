<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>Fill Up Your  Payment Details</b>
<form action="Userpaymentdetails.action">

<table align="center">
<tr><td>Full Name<td>${users.firstname } ${users.lastname }</td>
<tr><td>No oF Adults<td>${users.adult }
<tr><td>No oF Children<td>${users.children }
<tr><td>No oF Infants<td>${users.infants }
<tr><td>Total Fare<td>${totalfare }


</table>


<table>
<tr><td><input type="radio" name="r1" value="d">Debit Card
<tr><td><input type="radio" name="r1" value="c">Credit Card
<tr><td><input type="radio" name="r1" value="n">Net Banking


</table>
<input type="submit" value="pay" name="cmd">

</form>
<c:if test="${param.cmd=='pay' }">
<c:if test="${param.r1=='d' }">
the debit card details

</c:if>

<c:if test="${param.r1=='c' }">
the credit card details

</c:if>

<c:if test="${param.r1=='n' }">
the net banking card details

</c:if>


</c:if>

</body>
</html>