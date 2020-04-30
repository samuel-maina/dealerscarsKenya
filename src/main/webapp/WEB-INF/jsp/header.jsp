      <%@page contentType="text/html" pageEncoding="UTF-8" session="false"%>
         <nav class="navbar navbar-expand-lg navbar-light bg-light">
             <ul class="ml-auto">
        <li> <a href="/dealerscarsKenya/home">Home</a></li>
   <li> <a href="/dealerscarsKenya/used">Used Cars</a></li>
   <li><a href="/dealerscarsKenya/sell">Sell Your Car</a></li>
   <li> <a href="/dealerscarsKenya/listing">listings</a></li>
   <li> <a href="/dealerscarsKenya/favorites">Favorite <span class="badge badge-primary">${favs}</span></a></li>
    </ul>
     
                 <button class="navbar-toggler" type="button" data-toggle="modal" data-target="#menu" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
          </button>  
      </nav>
      
   <!-- Button trigger modal -->

  

<!-- Modal -->
<div class="modal fade" id="menu" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
  aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
       <a href="home">Home</a>
       <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
        <div class="modal-body">
       <a href="new">New cars</a>
      </div>
        <div class="modal-body">
       <a href="used">Used cars</a>
      </div>
        <div class="modal-body">
       <a href="contacts">Contacts</a>
      </div>
      <div class="modal-footer">
          
</div>
    </div>
  </div>
</div>