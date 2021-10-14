<%@page import="beans.Habitacion"%>
<%
    Habitacion[] habitaciones = new Habitacion[10] ;    
    Habitacion nh = new Habitacion();
    nh.setBooked(false);
    habitaciones[0] = nh;
    habitaciones[1] = nh;
    habitaciones[2] = nh;
    habitaciones[3] = nh;
    habitaciones[4] = nh;
    habitaciones[5] = nh;
    habitaciones[6] = nh;
    habitaciones[7] = nh;
    habitaciones[8] = nh;
    habitaciones[9] = nh;
    
%>
<script>
    function isBook(){
        
    }
    
    function isNotBook(){
        
    }
</script>
<!DOCTYPE html>
<html>    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>RESERVACIÓN</title>
    </head>
    <body>        
        <jsp:useBean id="h1" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h2" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h3" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h4" class="beans.Habitacion" scope="session" />
            <div class="container">
                <h1>***BIENVENIDO AL HOTEL PANAS***</h1>
                <h1>Selecciona las habitaciones que deseas reservar </h1>
                <br>
                <br>
            </div>    
            <div class="container">
                <table class="table">
                <tbody>
                  <tr>   
                    <td><%if(habitaciones[0].getBooked() == false){%>
                        <input class="form-check-input" type="radio" name="booked" id="isBooked">
                        <button id="0" class="btn btn-success" onclick="isBook()">Habitación 1</button>
                        <%}else{%>
                        <button id="0" class="btn btn-danger" onclick="isNotBook()">Habitación 1</button>
                        <%}%>
                    </td>  
                    <td>
                        <%if(habitaciones[1].getBooked() == false){%>
                        <button id="1" class="btn btn-success" onclick="book()">Habitación 2</button>
                        <%}else{%>
                        <button id="1" class="btn btn-danger" onclick="book()">Habitación 2</button>
                        <%}%>
                    </td>     
                  </tr>
                  <tr>
                    <td>
                        <%if(habitaciones[2].getBooked() == false){%>
                        <button id="2" class="btn btn-success" onclick="book()">Habitación 3</button>
                        <%}else{%>
                        <button id="2" class="btn btn-danger" onclick="book()">Habitación 3</button>
                        <%}%>
                    </td>     
                    <td><%if(habitaciones[3].getBooked() == false){%>
                        <button id="3" class="btn btn-success" onclick="book()">Habitación 4</button>
                        <%}else{%>
                        <button id="3" class="btn btn-danger" onclick="book()">Habitación 4</button>
                        <%}%>
                    </td>      
                  </tr>
                </tbody>
             </table>
            </div>
    </body>
</html>
