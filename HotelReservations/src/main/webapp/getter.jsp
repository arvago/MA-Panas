<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        
        <title>RESERVADAS</title>
    </head>
    <body>
        <div class="container">
            <div class="container">
                <h1>***BIENVENIDO AL HOTEL PANAS***</h1>
                <h1>Habitaciones Reservadas</h1>
                <jsp:useBean id="h1" class="beans.Habitacion" scope="session" />
                <jsp:useBean id="h2" class="beans.Habitacion" scope="session" />
                <jsp:useBean id="h3" class="beans.Habitacion" scope="session" />
                <jsp:useBean id="h4" class="beans.Habitacion" scope="session" />
                <input type="hidden" name="h1" value="sese" />
                <jsp:getProperty name="h2" property="booked"/>
                <jsp:getProperty name="h3" property="booked"/>              
                <jsp:getProperty name="h4" property="booked"/>
                <br>
                <br>
            </div>            
            <table class="table">
                <tr>         
                    <% String text = getComponentByName("h1").getValueAsDatatype.toString();
}%>
                    
                    <td class="table-success">                        
                        Habitacion 1 
                    </td> 
                </tr>
                <tr >
                    <td class="table-danger">Habitacion 2</td> 
                </tr>
            </table>
        </div>
    </body>
</html>
