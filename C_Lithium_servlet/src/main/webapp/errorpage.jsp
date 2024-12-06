<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"   
 isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page</title>
</head>
<body>   

<h1>Error Occurred</h1>
<%
    Exception except = (Exception) request.getAttribute("javax.servlet.error.exception");
    if (except != null) {
        out.println("Exception Message: " + exception.getMessage());
    } else {
        out.println("An error occurred.");
    }
%>
</body>
</html>