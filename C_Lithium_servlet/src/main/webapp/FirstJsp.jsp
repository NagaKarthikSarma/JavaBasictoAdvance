<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorpage.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">   

<title>Insert title here</title>
</head>
<body>   

<h1>Naga Karthik Sarma Baruri</h1>

<h4> we can use jsp to get that </h4>

<h5>Expression tag  --> boolean operations</h5>
<%=35/4 %>
<br>
<%="karthik" %>
<br>

<%= 4%2 ==0 %>

<h5> Declaration tag-> declare public, private methods</h5>

int a=5 in declaration tags
<%!int a=5; %>

<h5> servlet tag-> declare public, private methods</h5>
<%out.println(a); %>

<h5>Comment tags -> html comment and servlet comment</h5>
c
<%----%>

<h5>requstdispatcher, sendredirectr, httpsession, cookies, can be create using the servlet tags</h5>

</body>
</html>