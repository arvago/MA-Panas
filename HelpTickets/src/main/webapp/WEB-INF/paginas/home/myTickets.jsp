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
                                                <div class="widget-content-left mr-2">
                                                    <div class="custom-checkbox custom-control"><input class="custom-control-input" id="exampleCustomCheckbox1" type="checkbox"><label class="custom-control-label" for="exampleCustomCheckbox1">&nbsp;</label></div>
                                                </div>
                                                <div class="widget-content-left">
                                                    <div class="widget-heading">${ticket.topic}</div>
                                                    <div class="widget-subheading">
                                                        <div>By ${ticket.nombreUsuario} <div class="badge badge-pill badge-info ml-2">NEW</div>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="widget-content-right"> 
                                                    <button class="border-0 btn-transition btn btn-outline-success"> 
                                                        <i class="fa fa-arrow-up"></i>
                                                    </button> 
                                                    <button class="border-0 btn-transition btn btn-outline-success"> 
                                                        <i class="fa fa-arrow-down"></i>
                                                    </button> <button class="border-0 btn-transition btn btn-outline-success"> <i class="fa fa-check"></i></button> <button class="border-0 btn-transition btn btn-outline-danger"> <i class="fa fa-trash"></i> </button> </div>
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