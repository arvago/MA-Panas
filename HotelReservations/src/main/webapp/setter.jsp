<%@page import="beans.Habitacion"%>
<%!
    int j = 0;
    Habitacion[] habitaciones = new Habitacion[10] ;      
%>
<%
    for(int i = 0; i < habitaciones.length; i++){
        Habitacion hN = new Habitacion();
        hN.setName("Habitacion " + i + 1);
        hN.setBooked(false);
        habitaciones[i] = hN;
    }       
%>
<script>
    function booked(int index){
        if(habitaciones[index].getBooked() == false){
            habitaciones[index].setBooked(true);
        }else{
            console.log("HABITACION YA RESERVADA")
        }
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
        <div class="container">
            <div class="container">
                <h1>***BIENVENIDO AL HOTEL PANAS***</h1>
                <h1>Selecciona las habitaciones que deseas reservar</h1>
                <br>
                <br>
            </div>            
            <table class="table">
                <tbody>
                  <tr>
                    <%
                      for(j = 0; j < 5; j++){
                          if(habitaciones[j].getBooked() == false){
                    %>
                        <td><button class="btn btn-success" onclick="booked(<%=j%>)>">Habitación <%=j+1%></button></td>
                    <%
                      }else{
                    %>
                      <td><button class="btn btn-danger" onclick="booked(<%=j%>)">Habitación <%=j+1%></button></td>
                    <%
                            }
                        }           
                    %>
                  </tr>
                  <tr>
                    <%
                      for(j = 5; j < 10; j++){
                          if(habitaciones[j].getBooked() == false){
                    %>
                        <td><button class="btn btn-success" onclick="booked(<%=j%>)>">Habitación <%=j+1%></button></td>
                    <%
                      }else{
                    %>
                      <td><button class="btn btn-danger" onclick="booked(<%=j%>)">Habitación <%=j+1%></button></td>
                    <%
                            }
                        }           
                    %>
                  </tr>
                </tbody>
             </table>
                  <a href="getter.jsp">RESERVAR</a>
        </div>        
    </body>
</html>
