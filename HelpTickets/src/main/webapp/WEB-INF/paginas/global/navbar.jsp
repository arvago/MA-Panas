<nav class="navbar navbar-expand-lg navbar-light ">
    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0 wd-100">
                <li class="nav-item">
                    <a class="nav-link active nav-area nav-area-ticket user-icon" aria-current="page" href="index2.jsp">Operativos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link nav-area-ticket user-icon"  href="${pageContext.request.contextPath}/tickets?accion=admin">Administrativos</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link nav-area-ticket" href="#" data-toggle="modal" data-target="#editarUserModal"><i class="fa fa-user user-icon" aria-hidden="true"></i></a>
                </li>                
            </ul>
        </div>
    </div>
</nav>
