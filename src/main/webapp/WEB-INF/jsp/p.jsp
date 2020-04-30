<%-- 
    Document   : p
    Created on : Mar 27, 2020, 8:29:12 AM
    Author     : samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product</title>
        <link href="/dealerscarsKenya/resources/css/bootstrap1.css" rel="stylesheet" type="text/css"/>
    <link href="/dealerscarsKenya/resources/css/site.css" rel="stylesheet" type="text/css"/>
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
 
    </head>
    
    <body>
        <jsp:include page="header.jsp"/>
        <div class="images_slider">
        <div id="image" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#image" data-slide-to="0" class="active"></li>
                <li data-target="#image" data-slide-to="1"></li>
                <li data-target="#image" data-slide-to="2"></li>
                <li data-target="#image" data-slide-to="3"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img class="d-block w-100" src="/dealerscarsKenya/resources/images/${product.image1}" alt="${product.brand} ${product.model}">
                </div>
                <div class="carousel-item ">
                    <img class="d-block w-100" src="/dealerscarsKenya/resources/images/${product.image2}" alt="${product.brand} ${product.model}" >
                </div>
                <div class="carousel-item ">
                    <img class="d-block w-100" src="/dealerscarsKenya/resources/images/${product.image3}" alt="${product.brand} ${product.model}" >
                </div>
                <div class="carousel-item ">
                    <img class="d-block w-100" src="/dealerscarsKenya/resources/images/${product.image4}" alt="${product.brand} ${product.model}">
                </div>
            </div>
                <a class="carousel-control-prev" href="#image" role="button" data-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#image" role="button" data-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                </div>
                    <b><span class="text2">${product.brand} ${product.model}</span><span class="text">Ksh: ${product.price}</span></p></b></p>
            <div class="product-details">
                <table class="">
                    
                    <tr>
                    <td><span class="product-description">MODEL YEAR</span></td>
                    <td><span class="product-description-att">${product.yom}</span></td>
                    
                    </tr>
                    <tr>
                    <td><span class="product-description">INT.COLOR</span></td>
                    <td><span class="product-description-att">${product.interiorColor}</span></td>
                     </tr>
                    <tr>
                    <td><span class="product-description">Transmission</span></td>
                    <td><span class="product-description-att">${product.transmission}</span></td>
                  </tr>
                    <tr>
                    <td><span class="product-description">EXT.COLOR</span></td>
                    <td><span class="product-description-att">${product.exteriorColor}</span></td>
                     </tr>
                    <tr>
                    <td><span class="product-description">FINANCING</span></td>
                    <td><span class="product-description-att">${product.price}</span></td>
                    </tr>
                    <tr>
                    <td><span class="product-description">MILEAGE</span></td>
                    <td><span class="product-description-att"> ${product.mileage}</span></td>
                     </tr>
                    <tr>
                    <td><span class="product-description">Engine Size</span></td>
                    <td><span class="product-description-att">${product.engineSize}</span></td>
                    </tr>
                    
                </table>
            </div>
                    
        </div>
                    <jsp:include page="footer.jsp"/>
    </body>
</html>
