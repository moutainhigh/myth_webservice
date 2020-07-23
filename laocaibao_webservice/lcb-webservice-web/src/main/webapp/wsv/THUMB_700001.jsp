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
  	<form action="${path}/wsv/thumb700001" method="post" name="model_700001">
	<input type="hidden" name="method" value="700001">
		<table align="center">
			<tr>
				<td colspan="2"  align="center"><font color="red" size="5">我的积分</font></td>
			</tr>
			<tr>
				<td align="right">客户ID<font color="red">*</font>：</td>
				<td> <input name="accountNo" id='accountNo' type="text" 
					 value=''>
				</td>
			</tr>
			<tr>
				<td align="right">第几页<font color="red">*</font>：</td>
				<td> <input name="pageNo" id='pageNo' type="text" 
					 value=''>
				</td>
			</tr>
			<tr>
				<td align="right">每页大小<font color="red">*</font>：</td>
				<td> <input name="pageSize" id='pageSize' type="text" 
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