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
<title>捞财宝前置系统</title>
</head> 
<body>
  	<form action="${path}/ApiTest/transmitRequest" method="post" name="model_700001">
	<input type="hidden" name="method" value="710002">
		<table align="center">
			<tr>
				<td colspan="2"  align="center"><font color="red" size="5">判断用户渠道来源</font></td>
			</tr>
			<tr>
				<td align="right">手机号<font color="red">*</font>：</td>
				<td> <input name="cmCellphone" id='cmCellphone' type="text"
					 value=''>
				</td>
			</tr>
			<tr>
				<td align="right">渠道号<font color="red">*</font>：</td>
				<td> <input name="channelCode" id='channelCode' type="text"
					 value='zhizhuwang001'>
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