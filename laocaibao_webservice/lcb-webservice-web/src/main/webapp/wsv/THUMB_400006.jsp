<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/common/privi.jsp"%>
<html>
<%
String path = request.getContextPath();
session.setAttribute("path", path);
%>
<head>
<link href="${sessionScope.path}/js/img/zdico.png" rel="icon" type="image/x-icon" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>捞财宝实名认证接口</title>
</head>
<body >
<form action="${path}/wsv/thumb400006" method="post">
	<input type="hidden" name="method" value="400006">
		<table align="center">
			<tr>
				<td colspan="2"  align="center"><font color="red" size="5">实名认证接口</font></td>
			</tr>
			<tr>
				<td align="right">客户ID<font color="red">*</font>：</td>
				<td> <input name="cmCustomerId" id='cmNumber' type="text" size="100">
				</td>
			</tr>
			<tr>
				<td align="right">身份证<font color="red">*</font>：</td>
				<td> <input name="cmIdnum" id='cmIdnum' type="text" size="100"
					maxlength="50" >
				</td>
			</tr>
			
			<tr>
				<td align="right">真是姓名<font color="red">*</font>：</td>
				<td> <input name="cmRealName" id='cmRealName' type="text" size="100" value=''>
				</td>
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