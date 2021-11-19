<div class="modal fade" id="agregarTicketModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Crear Nuevo Ticket</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
            
            <form action="${pageContext.request.contextPath}/tickets?accion=insertar"
                  method="POST" class="was-validated">
                
                <div class="modal-body">
                    <div class="form-group">
                        <label for="topic">Titulo del Ticket:</label>
                        <input type="text" class="form-control" name="topic" required>
                    </div>
                    <div class="form-group">
                        <label for="area">Área al que va dirigido:</label>
                        <select class="form-control" aria-label="Default select example" required>
                            <option value="" selected disabled>-Selecciona-</option>
                            <option value="2">Operativa</option>
                            <option value="1">Administrativa</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="username">Descripción:</label>
                        <textarea class="form-control" name="description" maxlength="200" placeholder="Ingresa motivo del levantamiento del ticket" required ></textarea>
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">Levantar Ticket</button>
                </div>    
            </form>
        </div>
    </div>
</div>
    
