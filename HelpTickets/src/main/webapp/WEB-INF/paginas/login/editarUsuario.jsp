<div class="modal bg-dark" id="editarUserModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header text-white">
                <h5 class="modal-title">Mi Perfil</h5> 
                <button class="btn-close" data-dismiss="modal"></button>
            </div>
            
            <form action="${pageContext.request.contextPath}/tickets?accion=editarUser"
                  method="POST" class="was-validated">
                
                <div class="modal-body">
                    <div class="form-group">
                        <label for="name">Nombre:</label>
                        <input type="text" class="form-control bg-dark text-white" name="name" value="${name}" required>
                    </div>
                    <div class="form-group"> 
                        <label for="lastName">Apellido:</label>
                        <input type="text" class="form-control bg-dark text-white" name="lastName" value="${lastName}" required>
                    </div>
                    <div class="form-group">
                        <label for="username">Usuario:</label>
                        <input type="text" class="form-control bg-dark text-white" name="username" value="${username}" required>
                    </div>
                    <div class="form-group">
                        <label for="username">Contraseña:</label>
                        <input type="password" class="form-control bg-dark text-white" name="password" placeholder="Edita este campo en caso de querer cambiar tu contraseña">
                    </div>
                    <input type="hidden" class="form-control" name="id" value="${idUserLogged}">
                </div>
                <div class="modal-footer">
                    <button class="btn btn-light" type="submit">Guardar Cambios</button>
                </div>    
            </form>
        </div>
    </div>
</div>