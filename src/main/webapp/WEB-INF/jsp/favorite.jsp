<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>CarsKenya</title>
    <link href="resources/css/bootstrap1.css" rel="stylesheet" type="text/css" errorPage="error.jsp"/>
     <meta name="viewport" content="width=device-width,initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@300&display=swap" rel="stylesheet"> 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet"/>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script> 
 <link href="/dealerscarsKenya/resources/css/fontawesome/css/all.css" rel="stylesheet" type="text/css"/>
<link href="/dealerscarsKenya/resources/css/site.css" rel="stylesheet" type="text/css"/>
<style>
   
    </style>
  </head>
  <body>
 <!-- Button trigger modal -->

                   
       <jsp:include page="header.jsp"/>   
        <jsp:include page="search.jsp"/> 
    
  
  <div class="main">
    
 <p><b><span class="text2">POPULAR</span><b></p>
<c:forEach items="${likes}" var="product">
   
                <div class="mini_main">
                    <img src="resources/images/${product.image1}" height="130px" width="230px">
                    <div class="inifo">
                    <p><b><span class="text2"> ${product.brand} ${product.model}</span></b><span class="text">Ksh: ${product.price}</span></p>
                           <p>Stock Number:${product.code}|Mileage:${product.mileage}|</p><p>Int.Color:${product.interiorColor}|Ext.Color:${product.exteriorColor}|${product.yom}</p>
                           <p><i class="fa fa-map-marker-alt"aria-hidden="true">nyeri</i></p>
                    <a href="p/${product.code}"><span class="link">More</span></a>
                    <a href="favorite?code=${product.code}"><span class="text">like this?</span></a>
                    </div>
                 </div>
            </c:forEach>
</div>
       
</div>
       <div class="load">
      
    <a href="#loadMore"><span class="btn badge-success">load more</span></a>
       </div>    
      <jsp:include page="footer.jsp"/>
      
      
          
  </body>
</html>
