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
<title>捞财宝订单接口</title>
</head>
<body >
<form action="${path}/wsv/thumb500003" method="post">
	<input type="hidden" name="method" value="500003">
		<table align="center">
			<tr>
				<td colspan="2"  align="center"><font color="red" size="5">下订单接口</font></td>
			</tr>
			<tr>
				<td align="right">客户ID<font color="red">*</font>：</td>
				<td> <input name="customerId" id='customerId' type="text" size="100"
					 value=''>
				</td>
			</tr>
			<tr>
				<td align="right">订单金额<font color="red">*</font>：</td>
				<td> <input name="orderAmt" id='orderAmt' type="text" size="100"
					 value=''>
				</td>
			</tr>
			<tr>
				<td align="right">产品ID<font color="red">*</font>：</td>
				<td> <input name="productId" id='productId' type="text" size="100"
					 value=''>
				</td>
			</tr>
			
			<tr>
				<td align="right">邀请码：</td>
				<td> <input name="inviteCode" id='inviteCode' type="text" size="100"
					 value=''>
				</td>
			</tr>
			<tr>
				
			</tr>
			<tr>
				<td colspan="2" align="center">&nbsp;
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