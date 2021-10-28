<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>

<section id="clientes">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Listado de Compras</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>IdCliente</th>
                                <th>Producto</th>
                                <th>Total</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>                            
                            <!-- Iteramos cada elemento de la lista de clientes -->
                            <c:forEach var="compra" items="${compras}" varStatus="status" >
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${compra.idCliente}</td>
                                    <td>${compra.Producto}</td>
                                    
                                    <%--Agregamos conversión de numero a moneda--%>
                                    <td> <fmt:formatNumber value="${compra.saldo}" type="currency"/> </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletControladorCompras?accion=editar&idCompra=${compra.idCompra}"
                                           class="btn btn-secondary">
                                            <i class="fas fa-angle-double-right"></i> Editar
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Agregar cliente MODAL -->
<jsp:include page="/WEB-INF/paginas/compra/agregarCompra.jsp"/>
                        