<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
String path = request.getContextPath();
session.setAttribute("path", path);
%>
<head>
<link href="${sessionScope.path}/js/img/zdico.png" rel="icon" type="image/x-icon" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>现金券领取</title>
</head>
<body >
<form action="${path}/ApiTest/transmitRequest" method="post">
	<input type="hidden" name="method" value="908002">
		<table align="center">
			<tr>
				<td align="center"><font color="red" size="5">现金券领取</font></td>
			</tr>
			</tr>
			<tr>
				<td align="center">
					customerId:<input type="text" name="customerId" value=""/>
				</td>
			</tr>
			<tr>
				<td align="center">
					现金券编号cashNo:<input type="text" name="cashNo" value=""/>
				</td>
			</tr>
			<tr>
				<td align="center">
					来源：publishSource:<input type="text" name="publishSource" value=""/>
				</td>
			</tr>
			<tr>
				<td align="center">
					<input type="submit" value=" 提交  "/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>