<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>


<div class="row d-flex justify-content-center container ">
    <div class="col-md-12">
        <div class="card-hover-shadow-2x mb-3 card">
            <div class="card-header-tab card-header">
                <div class="card-header-title font-size-lg text-capitalize font-weight-normal"><i class="fa fa-tasks"></i>&nbsp;Tickets</div>
            </div>
            <div class="scroll-area-sm">
                <perfect-scrollbar class="ps-show-limits">
                    <div style="position: static;" class="ps ps--active-y">
                        <div class="ps-content">
                            <ul class=" list-group list-group-flush">
                                <c:forEach var="ticket" items="${tickets}" varStatus="status" >
                                    <li class="list-group-item">
                                        <div class="todo-indicator bg-focus"></div>
                                        <div class="widget-content p-0">
                                            <div class="widget-content-wrapper">                                              
                                                <div class="widget-content-left">
                                                    <div class="widget-heading">${ticket.topic}</div>
                                                    <div class="widget-subheading">
                                                        <c:if test="${ticket.status == 0}">
                                                            <div>${ticket.description} 
                                                                <div class="badge badge-danger badge-info ml-2">Rechazado</div>
                                                            </div>
                                                        </c:if>
                                                        <c:if test="${ticket.status == 1}">
                                                            <div>${ticket.description}
                                                                <div class="badge badge-pill badge-success ml-2">Terminado</div>
                                                            </div>
                                                        </c:if>
                                                        <c:if test="${ticket.status == 2}">
                                                            <div>${ticket.description}
                                                                <div class="badge badge-pill badge-info ml-2">New</div>
                                                            </div>
                                                        </c:if>
                                                    </div>
                                                    <div class="widget-subheading">
                                                        By ${ticket.nombreUsuario}
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </li>
                                </c:forEach>
                            </ul>
                        </div>
                    </div>
                </perfect-scrollbar>
            </div>
            <button class="btn btn-primary" data-toggle="modal" data-target="#agregarTicketModal">Nuevo Ticket</button></div>
    </div>
</div>
</div>