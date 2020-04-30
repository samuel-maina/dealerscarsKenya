<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="/dealerscarsKenya/resources/css/bootstrap1.css" rel="stylesheet" type="text/css"/>
    <link href="/dealerscarsKenya/resources/css/site.css" rel="stylesheet" type="text/css"/>
   

    <title>login</title>
  </head>
  <body>
  

    <div class="login-form">
    <caption><center>Login</center></caption>
<form action="login" method="POST">
<label for="username">Username</label>
<input type="text" name="username" id="username" class="form form-control"/>
<label for="password">Password</label>
<input type="text" name="password" id="password" class="form form-control"/>
 <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>   
<input type="submit" value="submit" class="btn btn-danger" name="submit"/>
</form>
</div>
  
  </body>
</html>