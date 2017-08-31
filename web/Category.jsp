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
            <form method="post">
                <table>
                    <tr>
                        <td>
                            <input type="text" name="name" value="${Category.name}" placeholder="Category Name" />
                            <input type="text" name="Id" value="${Category.id}" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <textarea name="description" rows="4" cols="20" placeholder="description">
                                ${Category.description}
                            </textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <c:if test="${empty Category}">
                                <input type="submit" value="Add Category" formaction="Category.do?m=c"/>
                            </c:if>
                            <c:if test="${not empty Category}">
                                <input type="submit" value="Update Category" formaction="Category.do?m=u"/>
                            </c:if>
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
                <c:forEach var="c" items="${categories}">
                <tr>
                    <td>${c.name}</td>
                    <td>${c.description}</td>
                    <td><a href="Category.do?m=e&&id=${c.id}">Edit</a></td>
                    <td><a href="Category.do?m=d&&id=${c.id}">Delete</a></td>
                </tr>
                </c:forEach>
            </table>
        </div>
        <%@include file="footer.jsp" %>
    </body>
</html>
