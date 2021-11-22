<div class="container bg-dark" id="container-login">
    <div class="login-form ">
        <form action="${pageContext.request.contextPath}/login?accion=validar" method="post">
            <h2 class="text-center">LOG IN</h2>
            <div class="form-floating sm-3">
                <input type="text" class="form-control" id="floatingInput" placeholder="Username" name="username"
                    required="required">
                <label for="floatingInput">Username</label>
            </div>
            <div class="form-floating sm-3">
                <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="password"
                    required="">
                <label for="floatingPassword">Password</label>
            </div>
            <div class="form-group text-center">
                <button type="submit" class="btn btn-light btn-lg" id="btn-login">Iniciar Sesion</button>
            </div>
        </form>
        <p class="text-center"><a href="#" data-toggle="modal" data-target="#agregarUserModal">Crear Cuenta</a></p>
    
    </div>
</div>
    
     <div class="container lateral-side dark">
         <image alt="logo de panas :3" class="logo-panas " src="${pageContext.request.contextPath}/res/logo-font.png" id="img-form"/>
         <p id="frase-login" class="text-center">GESTION DE TICKETS</p>
</div>
    

