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
<title>重置交易密码接口</title>
</head>
<body >
<form action="${path}/ApiTest/transmitRequest" method="post">
	<input type="hidden" name="method" value="410003">
		<table align="center">
			<tr>
				<td align="center"><font color="red" size="5">重置交易密码接口</font></td>
			</tr>
			<tr>
				<td>手机号：<input type="text" name="cmCellphone"></td>
			</tr>
			<tr>
				<td>交易密码：<input type="text" name="tradePassword"></td>
			</tr>
			<tr>
				<td>身份证号：<input type="text" name="idCard"></td>
			</tr>
			<tr>
				<td>验证码：<input type="text" name="validateCode"></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value=" 提交  "/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>