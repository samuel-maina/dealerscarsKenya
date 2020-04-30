<%-- 
    Document   : search
    Created on : Apr 28, 2020, 6:16:18 PM
    Author     : samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <form class="form  float-xl-lefkt sectionk form-inline"  action="search">
         
               
    <select  name="make" class=" form form-control font-07 width-100 bg-input margin-20" id="make">
        <option value="all">All Makes</option>
         <option value="ford">Ford</option>
          <option value="Toyota">All</option>
    </select>
            
               
    <select name="model" class=" form form-control font-07 bg-input margin-20" id="model">
        <option value="all">All Models</option>
    </select>
             
             <select name="price" class=" form form-control font-07 bg-input margin-20" id="price">
        <option value="any">Any price</option>
    </select>
             <input class="btn btn-outline-info font-07 width-10j0 margin-20" value="GO" type="submit"/>
            </form> 
              <script>
           $(document).ready(function () {
    $("#make").change(function () {
        var val = $(this).val();
        if (val == "ford") {
            $("#model").html("<option value='raptor'>Raptor</option><option value='focus'>Focus</option>");
        } else if (val == "Toyota") {
            $("#model").html("<option value='focus'>focus</option><option value='test2'>item2: test 2</option>");
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
