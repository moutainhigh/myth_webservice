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
<title>拇指贷前置系统-busiBanner</title>
</head> 
<body>
  	<form action="${path}/ApiTest/transmitRequest" method="post" name="model_600014">
	<input type="hidden" name="method" value="600014">
		<table align="center">
			<tr>
				<td colspan="2"  align="center"><font color="red" size="5">债权信息接口</font></td>
			</tr>
			<tr>
				<td align="right">订单ID<font color="red">*</font>：</td>
				<td> <input name="orderId" id='orderId' type="text"
					 value=''>
				</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit" value=" 提交  "/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>