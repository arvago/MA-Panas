<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div style="width: 100%; display: block;"  class="container-fluid">
        
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 wd-100">
                <a class="navbar-brand" href="#"><image id="logo-nav"  src="${pageContext.request.contextPath}/res/logo.png" ></a>
                <li class="nav-item">
                    <a class="nav-link active nav-area nav-area-ticket user-icon" aria-current="page" href="index2.jsp">Operativos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link nav-area-ticket user-icon"  href="${pageContext.request.contextPath}/tickets?accion=admin">Administrativos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link nav-area-ticket" href="#" data-toggle="modal" data-target="#editarUserModal"><i class="fa fa-user user-icon" aria-hidden="true"></i></a>                                  
                </li>     
                <li style="margin: auto 0 auto auto; display: block" class="justify-content-end nav-item">
                    <a  class="nav-link nav-area-ticket" href="index.jsp">Cerrar Sesion <i class="fa fa-power-off" aria-hidden="true"></i></a>
                </li>
            </ul>
       
    </div>
</nav>
