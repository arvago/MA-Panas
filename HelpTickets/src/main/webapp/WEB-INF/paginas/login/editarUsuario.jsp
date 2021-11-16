<div class="modal fade" id="editarUserModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Mi Perfil</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
            
            <form action="${pageContext.request.contextPath}/login?accion=insertar"
                  method="POST" class="was-validated">
                
                <div class="modal-body">
                    <div class="form-group">
                        <label for="name">Nombre:</label>
                        <input type="text" class="form-control" name="name" value="${name}" required>
                    </div>
                    <div class="form-group"> 
                        <label for="lastName">Apellido:</label>
                        <input type="text" class="form-control" name="lastName" value="${lastName}" required>
                    </div>
                    <div class="form-group">
                        <label for="username">Usuario:</label>
                        <input type="text" class="form-control" name="username" value="${username}" required>
                    </div>
                    <div class="form-group">
                        <label for="username">Contraseña:</label>
                        <input type="password" class="form-control" name="password">
                    </div>
                    <input type="hidden" class="form-control" name="id" value="${idUserLogged}">
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">Guardar Cambios</button>
                </div>    
            </form>
        </div>
    </div>
</div>