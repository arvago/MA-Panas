<div class="login-form">
    <form action="${pageContext.request.contextPath}/login?accion=validar" method="post">
        <h2 class="text-center">LOG IN</h2>       
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Username" name="username" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" placeholder="Password" name="password" required="required">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Iniciar Sesión</button>
        </div>       
    </form>
    <p class="text-center"><a href="#" data-toggle="modal" data-target="#agregarUserModal">Crear Cuenta</a></p>
</div>

