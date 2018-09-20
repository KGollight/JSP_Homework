<%@page import="game.bean.*, java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	GameDAO gdao = new GameDAO();
	List<GameDTO> list = gdao.list();
%>  
  
<html>
<head>
<title>캐릭터 목록</title>
</head>
<body>
	<div align="center">
		<h1>캐릭터 목록</h1>
		<hr>
		<table border="1" width="600">
			<thead>
				<tr>
					<th>번호</th>
					<th>아이디</th>
					<th>직업</th>
					<th>레벨</th>
					<th>경험치</th>
					<th>사냥</th>
				</tr>
			</thead>
			<tbody>
				<!-- 반복 -->
				<%for(GameDTO gdto : list){ %>
				<tr align="center">
					<td><%=gdto.getNo()%></td>
					<td><%=gdto.getId()%></td>
					<td><%=gdto.getJob()%></td>
					<td><%=gdto.getChLevel()%></td>
					<td><%=gdto.getExp()%></td>
					<td>
						<a href="hunt.it?no=<%=gdto.getNo()%>">사냥하기</a>
					</td>
				</tr>
				<%} %>
				<!-- 반복 -->
			</tbody>
		</table>
		
		<h3><a href="register.jsp">캐릭터 만들기</a></h3>
	</div>
</body>
</html>