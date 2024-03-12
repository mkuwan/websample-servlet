<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%
    Date date = new Date();
    SimpleDateFormat simpleDateFormt = new SimpleDateFormat("yyyy年M月d日(E)");
    String today = simpleDateFormt.format(date);
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>テスト</title>
</head>
<body>
    <h1>JSPテスト</h1>
    <p>今日は<%= today %>です</p>
    <a href='/websample/'>to home</a>

</body>
</html>