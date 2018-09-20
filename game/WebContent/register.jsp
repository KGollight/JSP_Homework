<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<title>캐릭터 생성</title>
</head>
<body>
	<div align="center">
		<h1>캐릭터 만들기</h1>
		<hr>
<!-- 		<form action="register.it" method="post> -->
		<form action="<%=request.getContextPath()%>/register.it" method="post">
			 <input name="id" type="text" placeholder="캐릭터 아이디" required>			
			 <br><br>
			 <select name="job">
			 	<option>전사</option>
			 	<option>마법사</option>
			 </select>
			 <br><br>
			 <input type="submit" value="생성하기">
		</form>
	</div>
</body>
</html>