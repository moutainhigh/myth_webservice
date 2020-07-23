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
<title>排行榜接口</title>
</head>
<body >
<form action="${path}/ApiTest/transmitRequest" method="post">
	<input type="hidden" name="method" value="820015">
		<table align="center">
			<tr>
				<td align="center"><font color="red" size="5">排行榜接口</font></td>
			</tr>
			<tr>
				<td>搜索字符串：<input type="text" name="searchStr"></td>
			</tr>
			<tr>
				<td>页号：<input type="text" name="pageNo"></td>
			</tr>
			<tr>
				<td>每页大小：<input type="text" name="pageSize"></td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value=" 提交  "/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>