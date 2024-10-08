<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Map<String, Object> articleMap = (Map<String, Object>) request.getAttribute("articleMap");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기</title>
</head>
<body>
	<div>	
		<div><%= articleMap.get("id") %>번 게시물 상세보기</div>
		<div>작성일 : <%= articleMap.get("regDate") %></div>
		<div>수정일 : <%= articleMap.get("updateDate") %></div>
		<div>제목 : <%= articleMap.get("title") %></div>
		<div>내용 : <%= articleMap.get("body") %></div>
	</div>
	
	<div>
		<div><a href="list">목록</a></div>
		<div><a href="modify?id=<%= articleMap.get("id") %>">수정</a></div>
		<div><a href="delete?id=<%= articleMap.get("id") %>" onclick="if(confirm('정말 삭제하시겠습니까?') == false) return false;">삭제</a></div>
	</div>
</body>
</html>