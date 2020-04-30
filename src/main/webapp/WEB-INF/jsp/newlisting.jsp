<%-- 
    Document   : listing
    Created on : Mar 24, 2020, 4:11:14 PM
    Author     : samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New listings</title>
         <link href="/dealerscarsKenya/resources/css/bootstrap1.css" rel="stylesheet" type="text/css"/>
         <link href="/dealerscarsKenya/resources/css/site.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        
        <nav class="navbar navbar-dark bg">
    <button class="navbar-toggler" type="button" data-toggle="collapse" 
data-target="//#navbarToggleExternalContent" 
aria-controls="navbarToggleExternalContent" aria-expanded="false" 
aria-label="Toggle navigation">
	<span 
class="navbar-toggler-icon"></span>

    </button>
    <ul>
   <li> <a href="new">New listing</a></li>
   <li> <a href="remove">Remove listing</a></li>
   <li> <a href="all">All listings</a></li>
   <li><a href="logout">log out</a></li>
   </ul>
   <form class="form-inline" action="/" method="GET">
   <input type="text" class="form form-control" placeholder="honda civic" 
name="car">
   <input type="submit" class="btn btn-success" name="Search"></input>
   </form>
  </nav>
        <h3>ADD CAR DETAILS</h3>
        <div class="listing">
        <form action="new/detailshandler"  method="POST" class="inline-b" enctype="multipart/form-data">
            <h3><u>Upload Images</u></h3>
            <label for="image_1">Image 1</label>
            <input type="file" name="image_1" id="image_1"><br>
            <label for="image_2">Image 2</label>
            <input type="file" name="image_2" id="image_2"><br>
            <label for="image_3">Image 3</label>
            <input type="file" name="image_3" id="image_3"><br>
            <label for="image_4">Image 4</label>
            <input type="file" name="image_4" id="image_4"><br>
            <hr>
            <h3><u>Other Details</u></h3>
            <label for="brand">Brand</label>
            <input type="text" class="form-control" id="name" name="brand">
            <label for="model">Model</label>
            <input type="text" class="form-control" id="model" name="model">
            <label for="price">Ask Price</label>
            <input type="text" class="form-control" id="price" name="price">
            <label for="year">YOM</label>
            <input type="text" class="form-control" id="year" name="yearofManufacture">
           <label for="intcolor">Interior Colour</label>
            <input type="text" class="form-control" id=intcolor name="interiorcolor">
            <label for="extcolor">Exterior Colour</label>
            <input type="text" class="form-control" id=extcolor name="exteriorcolor">
            <label for="mileage">Mileage</label>
            <input type="text" class="form-control" id="mileage" name="mileage">
            <label for="fuel">Fuel</label>
            <input type="text" class="form-control" id="fuel" name="fueltype">
            <label for="engine">Engine-size</label>
            <input type="text" class="form-control" id="engine" name="enginesize">
             <label for="info">Additional Information</label>
            <input type="text" class="form-control" id="info" name="additionalinfo">
           
            <select id="transmission" name="transmission">
                <option value="Automatic">Automatic</option>
                <option value="Manual">Manual</option>
            </select>
            <label for="new">New</label>
            <input type="radio" class="" id="new" name="state">
            <label for="used">Used</label>
            <input type="radio" class="" id="used" name="state">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/> 
            <input type="submit" class="btn btn-success" value="Upload Details">
        </form>
        </div>
    </body>
</html>
