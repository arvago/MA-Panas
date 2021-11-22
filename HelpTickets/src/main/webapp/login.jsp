<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        
        <!-- Bootstrap CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://kit.fontawesome.com/bc1817dbc5.js" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
            
        <title>LOG IN</title>
        <style>
            @font-face {
                font-family: "medFont";
                src: url(res/font-med.ttf);
            }
            #container-login{

                left: 0px;
            } 
            .login-form {
                
                font-size: 15px;

            }
            h2 {
                padding-top: 30px;
                color: whitesmoke;
            }
            
            .btn {        
                font-size: 15px;
                font-weight: bold;
            }
            button:active {
	transform: scale(0.95);
}
    .form-floating{
                margin-top: 100px;
                margin-left: 20px;
            }
            .form-group, .form-floating{
                margin-top: 100px;
                margin-left: 20px;
                margin-right: 20px;
            }
            .lateral-side{
                background-image: url(res/login-pattern.jpg);
                right: 0;
            }
            .container{
                height: 100%;
                width: 50%;
                position: fixed;
                z-index: 1;
                top: 0;
                overflow-x: hidden;
                padding-top: 20px; 
            }
            #frase-login{
                font-size: 50px;
                color: whitesmoke;
                font-family: 'medFont'
            }
            .logo-panas{
                width: 300px;
                  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;

            }
            #btn-login{
                margin-bottom: 50px
            }

        </style>
    </head>
    <body>
        <!-- LOGIN -->
        <jsp:include page="/WEB-INF/paginas/login/validarLogin.jsp"/>
        
        <!-- Agregar USER MODAL -->
        <jsp:include page="/WEB-INF/paginas/login/agregarUser.jsp"/>
        <!--Pie de Pagina-->
       <!-- <jsp:include page="/WEB-INF/paginas/global/footer.jsp"/>-->
        
     <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>        
    </body>    
</html>
