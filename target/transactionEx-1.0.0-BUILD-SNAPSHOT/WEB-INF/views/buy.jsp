<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div align="center">
	<hr width="400" color="green">
	<h2>경기 티켓 구매</h2>
	<hr width="400" color="green">
		<table cellpadding="2" cellspacing="0" border="1">
		</table>
		<form action="buyOk">
			<tr>
				<td>유저 아이디</td>
				<td><input type="text" name="userId" /></td>
			</tr>
			<tr>
				<td>티켓 매수:</td>
				<td><input type="text" name="amout" size="2" />매</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="카드결제" /></td>
			</tr>
	</div>
	</form>
</body>
</html>