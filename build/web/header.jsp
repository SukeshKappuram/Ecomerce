<%-- 
    Document   : header
    Created on : Aug 1, 2017, 7:11:25 PM
    Author     : iamsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .header{
                width:100%;
                height: 130px;
                background-color: black;             
            }
            .header h1{
                font-size: 50px;
                text-align: center;
                color:white;
            }
            .header nav{
                width: 100%;
                height: 30px;
                background-color: white;
            }
            .header nav a{
                text-decoration: none;
                color: black;
                font-size: 20px;
                padding: 20px 90px 20px 90px;
            }
            .footer{
                width: 100%;
                height: 50px;
                background-color: black;
                color: white;
                text-align: center;
                bottom: 0px;
                position: fixed;
            }
        </style>
    </head>
    <body>
        <div class="header">
            <h1>E-commerce Online</h1>
            <nav>
                <a href="#">Home</a> |
                <a href="#">Home</a> |
                <a href="#">Home</a> |
                <a href="#">Home</a> |
                <a href="#">Home</a> |
                <a href="#">Home</a>
            </nav>
        </div>
    </body>
</html>
