<%-- 
    Document   : login
    Created on : Feb 21, 2020, 7:53:29 AM
    Author     : samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


    <%
    session.invalidate();
    response.setHeader("Cache-Control","no-cache"); 
    response.setHeader("Cache-Control","no-store"); 
    response.setDateHeader("Expires", 0); 
    response.sendRedirect("/dealerscarsKenya/admin");
    %>



