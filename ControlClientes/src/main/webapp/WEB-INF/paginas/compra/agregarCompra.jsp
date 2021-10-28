<div class="modal fade" id="agregarCompraModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agregar Compra</h5> 
                <button class="close" data-dismiss="modal">
                    <span>&times;</span>
                </button>
            </div>
            
            <form action="${pageContext.request.contextPath}/ServletControlador?accion=insertar"
                  method="POST" class="was-validated">
                
                <div class="modal-body">
                    <div class="form-group">
                        <label for="producto">Producto</label>
                        <input type="text" class="form-control" name="producto" required>
                    </div>
                    <div class="form-group">
                        <label for="cliente">Cliente</label>
                        <input type="number" class="form-control" name="cliente" required>
                    </div>
                    <div class="form-group">
                        <label for="total">Total</label>
                        <input type="number" class="form-control" name="total" required>
                    </div>
                    
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">Realizar Compra</button>
                </div>    
            </form>
        </div>
    </div>
</div>
    