<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Marital Information</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script type="text/javascript" >
            $(document).ready(function () {
                $('.select').formSelect();
            });

            $(document).ready(function () {
                $('input#input_text, textarea#textarea2').characterCounter();
            });

        </script> 
    </head>
    <body>
        <div class="container ">
            <h2>Marital Information</h2>
            <div class="row card-panel grey lighten-5" style="height: 1200px">
                <form class="col s12 grey lighten-5" action="${pageContext.request.contextPath}/Servlet" method="POST" >
                    <div class="row">
                        <h5>Marital Status</h5>
                        <p>
                            <label>
                                <input  type="radio" name="marital" value="Single"  />
                                <span>Single</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="marital" value="Married" />
                                <span>Married</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="marital" value="Separated" />
                                <span>Separated</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="marital" value="Widowed" />
                                <span>Widowed</span>
                            </label>
                        </p>
                    </div>
                    <input name="firstName" type="hidden" value="<%=request.getParameter("firstName")%>"/>
                    <input name="lastName" type="hidden" value="<%=request.getParameter("lastName")%>"/>
                    <input name="phone" type="hidden" value="<%=request.getParameter("phone")%>"/>
                    <input name="address" type="hidden" value="<%=request.getParameter("address")%>"/>
                    <input name="zip" type="hidden" value="<%=request.getParameter("zip")%>"/>
                    <input name="birthplace" type="hidden" value="<%=request.getParameter("birthplace")%>"/>
                    <input name="experience" type="hidden" value="<%=request.getParameter("experience")%>"/>
                    <input name="technology" type="hidden" value="<%=request.getParameter("technology")%>"/>
                    <input name="design" type="hidden" value="<%=request.getParameter("design")%>"/>
                    <div class="row">
                        <button class="btn waves-effect waves-light btn-large blue accent-4" type="submit" style="margin-right: 4rem" value="Send">Submit
                            <i class="material-icons right">send</i>
                        </button>
                    </div>
                </form>
                    
            </div>     
    </body>
</html>
