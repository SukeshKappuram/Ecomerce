<%-- 
    Document   : index
    Created on : Aug 1, 2017, 7:09:57 PM
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
        <div class="content">
            <div class="section1" style="float:left">
                <img src="images/heroillustration.jpg" width="100%" height="630" alt="heroillustration"/>
            </div>
            <div class="section2"  style="float:right">
                <%@include file="SignUp.jsp" %>
            </div>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
