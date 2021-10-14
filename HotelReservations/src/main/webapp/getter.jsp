<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <title>RESERVADAS</title>
    </head>
    <body class="text-white bg-dark">
        <div class="container">
             <div class="card text-white bg-dark">
                <h1 class="text-center">BIENVENIDO AL HOTEL PANAS</h1>
                <h1 class="text-center">Habitaciones Reservadas</h1>
                <jsp:useBean id="h1" class="beans.Habitacion" scope="session" />
                <jsp:useBean id="h2" class="beans.Habitacion" scope="session" />
                <jsp:useBean id="h3" class="beans.Habitacion" scope="session" />
                <jsp:useBean id="h4" class="beans.Habitacion" scope="session" />
                <jsp:useBean id="h5" class="beans.Habitacion" scope="session" />
                <jsp:useBean id="h6" class="beans.Habitacion" scope="session" />



                <%
                        int habitacion = 0;
                        //Se obtiene el valor del form en setter.jsp con atributo name="habitacion"
                        try {
                        
                            //Se "parsea" a Integer el valor seleccionado en el formulario de la habitacion
                            habitacion =  Integer.valueOf(request.getParameter("habitacion"));
                        } catch (NumberFormatException ex) {
                            habitacion=20;
                        }
                    

                 //El valor del select es true, dado que fue enviado por el form y asignado a h1, h2 etc y con la clase en los beans
                 switch (habitacion) {
                        case 1:
                        if (h1.getBooked()){  %>
                <jsp:setProperty name="h1" property="booked" value="<%=false%>"/>
                <% } else { %>
                <jsp:setProperty name="h1" property="booked" value="<%=true%>"/>
                <%}
                        break;
                    case 2:
                        if (h2.getBooked()){ %>
                <jsp:setProperty name="h2" property="booked" value="<%=false%>"/>
                <% } else { %>
                <jsp:setProperty name="h2" property="booked" value="<%=true%>"/>
                <% }
                        break;
                    case 3:
                        if (h3.getBooked()){%>
                <jsp:setProperty name="h3" property="booked" value="<%=false%>"/>
                <%} else {%>
                <jsp:setProperty name="h3" property="booked" value="<%=true%>"/>
                <%}
                        break;
                    case 4:
                        if (h4.getBooked()){ %>
                <jsp:setProperty name="h4" property="booked" value="<%=false%>"/>
                <%} else {%>
                <jsp:setProperty name="h4" property="booked" value="<%=true%>"/>
                <%}
                        break;
                    case 5:
                        if (h5.getBooked()){ %>
                <jsp:setProperty name="h5" property="booked" value="<%=false%>"/>
                <%} else {%>
                <jsp:setProperty name="h5" property="booked" value="<%=true%>"/>
                <%}
                       break;
                    case 6:
                        if (h6.getBooked()){ %>
                <jsp:setProperty name="h6" property="booked" value="<%=false%>"/>
                <%} else {%>
                <jsp:setProperty name="h6" property="booked" value="<%=true%>"/>
                <%}
                        break;
                    default:
                        break;
                }
                %>

                
                <%
                    //El valor de classbackground asignara el color a la celda de la tabla segun esté disponible o no la habitacon, aplicando las clases  de bootstrap
                    String classBackground1  = "";
                    if (h1.getBooked() == true) {
                     classBackground1 = "table-success";
                    }
                    else {
                     classBackground1 = "table-danger";
                    }

                    
                    String classBackground2  = "";
                    if (h2.getBooked() == true) {
                     classBackground2 = "table-success";
                    }
                    else {
                     classBackground2 = "table-danger";
                    }

                    
                    String classBackground3  = "";
                    if (h3.getBooked() == true) {
                     classBackground3 = "table-success";
                    }
                    else {
                     classBackground3 = "table-danger";
                    }

                    
                    String classBackground4  = "";
                    if (h4.getBooked() == true) {
                     classBackground4 = "table-success";
                    }
                    else {
                     classBackground4 = "table-danger";
                    }

                    
                    String classBackground5  = "";
                    if (h5.getBooked() == true) {
                     classBackground5 = "table-success";
                    }
                    else {
                     classBackground5 = "table-danger";
                    }
                    
                    String classBackground6  = "";
                    if (h6.getBooked() == true) {
                     classBackground6 = "table-success";
                    }
                    else {
                     classBackground6 = "table-danger";
                    }
                %>

                <%--Aqui se asignan las clases a la tabla con respecto a al valor de getBooked--%>
                <table id="habitacion" style="width: 100%" class="table">
            <tr>
                <td class="<%=classBackground1%>">Habitacion 1-<jsp:getProperty name="h1" property="id"/></td>
                <td class="<%=classBackground2%>">Habitacion 2-<jsp:getProperty name="h2" property="id"/></td>
            </tr>
            <tr>
                <td class="<%=classBackground3%>">Habitacion 3-<jsp:getProperty name="h3" property="id"/></td>
                <td class="<%=classBackground4%>">Habitacion 4-<jsp:getProperty name="h4" property="id"/></td>
            </tr>
            <tr>
                <td class="<%=classBackground5%>">Habitacion 5-<jsp:getProperty name="h5" property="id"/></td>
                <td class="<%=classBackground6%>">Habitacion 6-<jsp:getProperty name="h6" property="id"/></td>
            </tr>
                </table>
            
            
                <br>
                <br>
                <br>
                <br>
                <td>
                    <a type="button" class="btn btn-primary" href="setter.jsp"><i class="fas fa-bed"></i> Reservar otra habitacion</a>
                    <br>
                    <a type="button" class="btn btn-primary" href="index.jsp"><i class="fa fa-home"></i> Inicio</a>
                </td>
             </div>
        </div>
    </body>
</html>