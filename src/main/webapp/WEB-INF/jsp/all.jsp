<%-- 
    Document   : listing
    Created on : Mar 24, 2020, 4:11:14 PM
    Author     : samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New listings</title>
         <link href="/dealerscarsKenya/resources/css/bootstrap1.css" rel="stylesheet" type="text/css"/>
         <link href="/dealerscarsKenya/resources/css/site.css" rel="stylesheet" type="text/css"/>
         
    </head>
    <body >
        <jsp:include page="adminheader.jsp"/>
     
        <div class="tablewrap">
        <table class="table table-striped">
            <tr>
                <td>Code</td>
                <td>Brand</td>
                <td>Model</td>
                <td>YOM</td>
                <td>Price</td>
            </tr>
            <c:forEach items="${allListings}" var="product">
                <tr>
                    <td>${product.code}</td>
                    <td>${product.brand}</td>
                    <td>${product.model}</td>
                    <td>${product.yom}</td>
                    <td>${product.price}</td>
                    <td><a href="delete?code=${product.code}">delete</a>
                </tr>
               
            </c:forEach>
        </table> 
        </div>
</html>
