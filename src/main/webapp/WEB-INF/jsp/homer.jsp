<%-- 
    Document   : home
    Created on : Mar 22, 2020, 12:30:53 PM
    Author     : samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <title>CarsKenya</title>
    <link href="resources/css/bootstrap1.css" rel="stylesheet" type="text/css"/>
    
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <link href="https://fonts.googleapis.com/css2?family=Roboto+Slab:wght@300&display=swap" rel="stylesheet"> 
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<link href="/dealerscarsKenya/resources/css/fontawesome/css/all.css" rel="stylesheet" type="text/css"/>

<link href="resources/css/site.css" rel="stylesheet" type="text/css"/>
<style>
   .navbari{
        text-align:center;
    }
</style>
    </head>
    <body>
        <div class=" navbari navbar-light bg-transparent">
            Search below|<a href="listing">Go to Listings</a>
        </div>
         
        <div class="login-form">
            <form class="form "  >
                <label for="make">Make</label>
               ${favs}
    <select name="make" class="selector form form-control bg-input " id="make">
        <option value="toyota">Toyota</option>
         <option value="nissan">Nissan</option>
         <option value="mazda">Mazda</option>
           <option value="mercedes">Mercedes</option>    
           <option value="all" selected="true">All</option>
            </select>
             <label for="model">Model</label>
               
    <select name="model" class="selector form form-control bg-input" id="model">
        <option value="all">All</option>
    </select>
             <label for="price">Price Range</label>
             <input type="text" class="selector form form-control bg-input" id="price" name="price"/>
             <button class="btn bg-input width-1 font-07" value="GO" type="submit"><i class="fa fa-search"aria-hidden="true"> search</i></button>
            </form>
        </div>

       
        <script>
           $(document).ready(function () {
    $("#make").change(function () {
        var val = $(this).val();
        if (val == "ford") {
            $("#model").html("<option value='raptor'>Raptor</option><option value='focus'>Focus</option>");
        } else if (val == "toyota") {
            $("#model").html("<option value='allion'>Allion</option><option value='corolla'>Corolla</option>");
        } else if (val == "item3") {
            $("#model").html("<option value='test'>item3: test 1</option><option value='test2'>item3: test 2</option>");
        } else if (val == "item0") {
            $("#size").html("<option value=''>--select one--</option>");
        }
    });
}); 
    
        
    </script>
    </body>
</html>