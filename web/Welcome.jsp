<%-- 
    Document   : Welcome
    Created on : Aug 30, 2017, 7:28:30 PM
    Author     : iamsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        
        <h1>Hello <%=user.getFirstName()+" "+user.getLastName()%>!</h1>
        <%@include file="footer.jsp" %>
    </body>
</html>
