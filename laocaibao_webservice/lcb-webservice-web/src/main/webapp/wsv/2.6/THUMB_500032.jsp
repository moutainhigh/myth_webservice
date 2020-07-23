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
<title>查询转让利率</title>
</head>
<body >
<form action="${path}/ApiTest/transmitRequest" method="post">
	<input type="hidden" name="method" value="500032">
		<table align="center">
			<tr>
				<td align="center">转让日期：<input type="text"  name="transferDate" id="transferDate" />
				</td>
			</tr>
			<tr>
				<td align="center">转让价格：<input type="text"  name="transferPrice" id="transferPrice" />
				</td>
			</tr>
			<tr>
				<td align="center">订单号：<input type="text"  name="orderId" id="orderId" />
				</td>
			</tr>
			<tr>
				<td align="center">产品估值：<input type="text"  name="estimatePrice" id="estimatePrice" />
				</td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value=" 提交  "/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>