<div class="modal bg-dark" id="agregarTicketModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header text-white">
                <h5 class="modal-title">Crear Nuevo Ticket</h5> 
                <button class="btn-close" data-dismiss="modal"></button>
            </div>
            
            <form action="${pageContext.request.contextPath}/tickets?accion=insertar"
                  method="POST" class="was-validated">
                
                <div class="modal-body">
                    <div class="form-group">
                        <label for="topic">Titulo del Ticket:</label>
                        <input type="text" class="form-control bg-dark text-white" name="topic" required>
                    </div>
                    <div class="form-group">
                        <label for="area">Área al que va dirigido:</label>
                        <select class="form-control bg-dark text-white" aria-label="Default select example" name="area" required>
                            <option class="bg-dark" value="" selected disabled>-Selecciona-</option>
                            <option class="bg-dark" value="2">Operativa</option>
                            <option class="bg-dark" value="1">Administrativa</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label  for="username">Descripción:</label>
                        <textarea class="form-control bg-dark text-white" name="description" maxlength="200" placeholder="Ingresa motivo del levantamiento del ticket" required ></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-light" type="submit">Levantar Ticket</button>
                </div>    
            </form>
        </div>
    </div>
</div>