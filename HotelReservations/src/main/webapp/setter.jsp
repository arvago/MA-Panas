<!DOCTYPE html>
<html>    
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <title>RESERVACIÓN</title>
    </head>
    <body class="text-white bg-dark">        
        <jsp:useBean id="h1" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h2" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h3" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h4" class="beans.Habitacion" scope="session" />
        <jsp:useBean id="h5" class="beans.Habitacion" scope="session" />
        <div class="container">
            <div class="card text-white bg-dark">
                <h1 class="text-center">BIENVENIDO AL HOTEL PANAS</h1>
                <br>
                <br>
                <h2 class="text-center">Selecciona la habitacion que deseas reservar </h2>
                <br>
                <form action="getter.jsp">
                    <select class="form-select text-white bg-dark" aria-label="Default select example" name="habitacion">
                        <option disabled selected>Selecciona una habitacion...</option>
                        <option value="1">Habitacion 1</option>
                        <option value="2">Habitacion 2</option>
                        <option value="3">Habitacion 3</option>
                        <option value="4">Habitacion 4</option>
                        <option value="5">Habitacion 5</option>
                        <option value="6">Habitacion 6</option>
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
