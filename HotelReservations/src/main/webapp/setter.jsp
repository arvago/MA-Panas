<!DOCTYPE html>
<html>    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>RESERVACI�N</title>
    </head>
    <body class="text-white bg-dark">        
        <jsp:useBean id="h1" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h2" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h3" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h4" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h5" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h6" class="beans.Habitacion" scope="session" />
        <div class="container">
            <div class="card text-white bg-dark">
                <h1 class="text-center">BIENVENIDO AL HOTEL PANAS</h1>
                <br>
                <br>
                <h2 class="text-center">Selecciona la habitaci�n que deseas reservar </h2>
                <br>
                <form action="getter.jsp">
                    <select class="form-select text-white bg-dark" aria-label="Default select example" name="habitacion">
                        <option disabled selected>Selecciona una habitaci�n...</option>
                        <% if(!h1.getBooked()){ %>
                        <option value="1" disabled="disabled">Habitaci�n 1</option>
                        <% }else{%>
                        <option value="1">Habitaci�n 1</option>
                        <% }
                           if(!h2.getBooked()){ %>
                        <option value="2" disabled="disabled">Habitaci�n 2</option>
                        <% }else{%>
                        <option value="2">Habitaci�n 2</option>
                        <% }
                           if(!h3.getBooked()){ %>
                        <option value="3" disabled="disabled">Habitaci�n 3</option>
                        <% }else{%>
                        <option value="3">Habitaci�n 3</option>
                        <% }
                           if(!h4.getBooked()){ %>
                        <option value="4" disabled="disabled">Habitaci�n 4</option>
                        <% }else{%>
                        <option value="4">Habitaci�n 4</option>
                        <% }
                           if(!h5.getBooked()){ %>
                        <option value="5" disabled="disabled">Habitaci�n 5</option>
                        <% }else{%>
                        <option value="5">Habitaci�n 5</option>
                        <% }
                           if(!h6.getBooked()){ %>
                        <option value="6" disabled="disabled">Habitaci�n 6</option>
                        <% }else{%>
                        <option value="6">Habitaci�n 6</option>
                        <% }%>
                    </select>
                    <br>
                    <button  type="submit" value="Reservar" class="btn btn-success"><i class="fas fa-check"></i> Reservar</button >
                </form>
                <br>
                <br>
                <br>
                <br>
                <br>
                <td>
                    <a type="button" class="btn btn-primary" href="getter.jsp"><i class="fas fa-bed"></i> Consultar habitaciones</a>
                    <br>
                    <a type="button" class="btn btn-primary" href="index.jsp"><i class="fa fa-home"></i> Inicio</a>
                </td>
            </div>
        </div>
    </body>
</html>