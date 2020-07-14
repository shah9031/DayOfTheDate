<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
<link rel="stylesheet" href="style.css">
</head>
<body class="box" style="font-size: 30px; align-content: center;">

<h1><%
out.print(request.getAttribute("result"));
%></h1>
<a href="home.jsp"><button>look for other date</button></a>
</body>
</html>