<%-- 
    Document   : Category
    Created on : Aug 30, 2017, 7:42:27 PM
    Author     : iamsu
--%>

<%@page import="java.util.List"%>
<%@page import="com.ecomere.model.Category"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="header.jsp" %>
        <div>
            <form action="Category.do?m=c" method="post">
                <table>
                    <tr>
                        <td>
                            <input type="text" name="name" placeholder="Category Name" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <textarea name="description" rows="4" cols="20" placeholder="description">
                            </textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Add Category" />
                        </td>
                    </tr>
                </table>
            </form>
        </div>
        <div>
            <table border="1">
                <tr>
                    <th>Category Name</th>
                    <th>Category Description</th>
                    <th colspan="2">Manage</th>
                </tr>
                <%
                    List<Category> categories=(List<Category>)session.getAttribute("categories");
                    for(Category c:categories){
                %>
                <tr>
                    <td><%=c.getName()%></td>
                    <td><%=c.getDescription()%></td>
                    <td>Edit</td>
                    <td>Delete</td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
