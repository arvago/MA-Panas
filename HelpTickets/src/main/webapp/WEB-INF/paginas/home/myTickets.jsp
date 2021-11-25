<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>


<div class="row d-flex justify-content-center container">
    <div class="col-md-12 ">
        <div class="card-hover-shadow-2x mb-3 card bg-dark">
            <div class="card-header-tab card-header bg-dark">
                <div class="card-header-title font-size-lg text-capitalize font-weight-normal"><i class="fa fa-tasks"></i>&nbsp;Tickets</div>
            </div>
            <div class="scroll-area-sm">
                <perfect-scrollbar class="ps-show-limits">
                    <div style="position: static;" class="ps ps--active-y">
                        <div class="ps-content">
                            <ul class=" list-group list-group-flush">
                                <c:forEach var="ticket" items="${tickets}" varStatus="status" >
                                    <li class="list-group-item bg-dark">
                                        <div class="todo-indicator bg-focus"></div>
                                        <div class="widget-content p-0">
                                            <div class="widget-content-wrapper">  
                                                <c:if test="${ticket.prioridad == 'ALTA'}">
                                                    <div class="widget-content-left margin-mini">
                                                        <input class="form-check-input rd-red" type="radio" disabled>                                                    
                                                    </div>  
                                                </c:if>     
                                                <c:if test="${ticket.prioridad == 'BAJA'}">
                                                    <div class="widget-content-left margin-mini">
                                                        <input class="form-check-input rd-green" type="radio" disabled>                                                    
                                                    </div>  
                                                </c:if>   
                                                <c:if test="${ticket.prioridad == 'MEDIA'}">
                                                    <div class="widget-content-left margin-mini">
                                                        <input class="form-check-input rd-yellow" type="radio" disabled>                                                    
                                                    </div>  
                                                </c:if>   
                                                <div class="widget-content-left">
                                                    <div class="widget-heading" id="ticketName">${ticket.topic}</div>
                                                    <div class="widget-subheading">
                                                        <div>${ticket.description}
                                                        </div>
                                                    </div>
                                                    <div class="widget-subheading">
                                                        By ${ticket.nombreUsuario}
                                                    </div>
                                                    <input type="hidden" value="${ticket.idTicket}" name="id${ticket.idTicket}">
                                                    <c:if test="${ticket.status == 0}">
                                                        <div class="widget-subheading">
                                                            <div class="badge fnt-blue ml-2">Nuevo</div>
                                                        </div>
                                                    </c:if>
                                                    <c:if test="${ticket.status == 1}">
                                                        <div class="widget-subheading">
                                                            <div class="badge fnt-green ml-2">Terminado</div>
                                                        </div>
                                                    </c:if>
                                                    <c:if test="${ticket.status == 2}">
                                                        <div class="widget-subheading">
                                                            <div class="badge fnt-red ml-2">Rechazado</div>
                                                        </div>
                                                    </c:if>
                                                </div>

                                                <div class="widget-content-right"> 
                                                    <c:if test="${role == 'Admin'}">
                                                        <button class="border-0 btn-transition btn btn-outline-success"> 
                                                            <i class="fa fa-arrow-up"></i>
                                                        </button> 
                                                        <button class="border-0 btn-transition btn btn-outline-success"> 
                                                            <i class="fa fa-arrow-down"></i>
                                                        </button> 
                                                        <button class="border-0 btn-transition btn btn-outline-success"> <i class="fa fa-check"></i>
                                                        </button>
                                                        <button class="border-0 btn-transition btn btn-outline-danger"> <i class="fa fa-trash"></i> 
                                                        </button> 
                                                    </c:if>
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