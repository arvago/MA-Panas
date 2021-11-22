<div class="modal bg-dark" id="agregarUserModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header text-white">
                <h5 class="modal-title">Crear Usuario</h5> 
                <button class="btn-close" data-dismiss="modal"></button>
            </div>
            
            <form action="${pageContext.request.contextPath}/login?accion=insertar"
                  method="POST" class="was-validated">
                
                <div class="modal-body">
                    <div class="form-group">
                        <label for="name">Nombre:</label>
                        <input type="text" class="form-control bg-dark text-white"" name="name" required>
                    </div>
                    <div class="form-group">
                        <label for="lastName">Apellido:</label>
                        <input type="text" class="form-control bg-dark text-white"" name="lastName" required>
                    </div>
                    <div class="form-group">
                        <label for="username">Usuario:</label>
                        <input type="text" class="form-control bg-dark text-white"" name="username" required>
                    </div>
                    <div class="form-group">
                        <label for="password">Contraseña:</label>
                        <input type="text" class="form-control bg-dark text-white"" name="password" required>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-light" type="submit">Registrar Usuario</button>
                </div>    
            </form>
        </div>
    </div>
</div>
    