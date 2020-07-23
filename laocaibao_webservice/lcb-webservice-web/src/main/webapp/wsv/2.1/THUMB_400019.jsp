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
<title>新获取验证码接口</title>
</head>
<body >
<form action="${path}/ApiTest/transmitRequest" method="post">
	<input type="hidden" name="method" value="400019">
		<table align="center">
			<tr>
				<td align="center"><font color="red" size="5">新获取验证码接口</font></td>
			</tr>
			<tr>
				<td>手机号：<input type="text" name="cellPhone"></td>
			</tr>
			<tr>
				<td>验证码类型：<input type="text" name="type">3--微信注册 4--微信绑定 5--设置交易密码 6--重置交易密码，原注册，请用400001接口 7--商户用户注册，8--欧洲杯英雄榜投票，10：充值 11.绑卡，13:访问白名单校验</td>
			</tr>
			<tr>
				<td>发送方式：<input type="text" name="codeType">0:短信，1：语音，默认短信</td>
			</tr>
			<tr>
				<td align="center"><input type="submit" value=" 提交  "/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>