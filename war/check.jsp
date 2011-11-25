<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String name = (String)request.getAttribute("name");
	int height = (Integer)request.getAttribute("height");
	String jaw = (String)request.getAttribute("jaw");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="css/index.css">
<title>確認</title>
<style type="text/css">
table ,tr,td,th{
	border: 1px solid #a9a9a9;
	border-collapse: collapse;
}
body {
	width: 600px;
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
	<h1>確認します</h1>
	<div align="center">
	<table>
		<tr><th>名前</th><td><p><%= name%></p></td></tr>
		<tr><th>身長</th><td><p><%= height%></p></td></tr>
		<tr><th>アゴ</th><td><p><%= jaw%></p></td></tr>
	</table>
	</div>
</body>
</html>