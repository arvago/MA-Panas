<%-- 1--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://kit.fontawesome.com/bc1817dbc5.js" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

        <title>Control de Tickets</title>
        
        <style>
            .navbar{
                backgrouend-color: #00a7dc;
            }
            .title-page{
                background-color: #0bb8e1;
                color: white;
            }
            body {
                margin: 0;
                font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, "Noto Sans", sans-serif, "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji";
                font-size: 0.88rem;
                font-weight: 400;
                line-height: 1.5;
                color: #495057;
                text-align: left;
                background-color: #eaeaea;
                height: 100%
            }

            i {
                font-style: italic
            }

            .container {
                margin: 50px auto;
                display: block;
            }

            .card {
                box-shadow: 0 0.46875rem 2.1875rem rgba(4, 9, 20, 0.03), 0 0.9375rem 1.40625rem rgba(4, 9, 20, 0.03), 0 0.25rem 0.53125rem rgba(4, 9, 20, 0.05), 0 0.125rem 0.1875rem rgba(4, 9, 20, 0.03);
                border-width: 0;
                transition: all .2s
            }

            .card-header:first-child {
                border-radius: calc(0.25rem - 1px) calc(0.25rem - 1px) 0 0
            }

            .card-header {
                display: flex;
                align-items: center;
                border-bottom-width: 1px;
                padding-top: 0;
                padding-bottom: 0;
                padding-right: 0.625rem;
                height: 3.5rem;
                background-color: #fff
            }

            .widget-subheading {
                color: #858a8e;
                font-size: 10px
            }

            .card-header.card-header-tab .card-header-title {
                display: flex;
                align-items: center;
                white-space: nowrap
            }

            .card-header .header-icon {
                font-size: 1.65rem;
                margin-right: 0.625rem
            }

            .card-header.card-header-tab .card-header-title {
                display: flex;
                align-items: center;
                white-space: nowrap
            }

            .btn-actions-pane-right {
                margin-left: auto;
                white-space: nowrap
            }

            .text-capitalize {
                text-transform: capitalize !important
            }

            .scroll-area-sm {
                height: 288px;
                overflow-x: hidden
            }

            .list-group-item {
                position: relative;
                display: block;
                padding: 0.75rem 1.25rem;
                margin-bottom: -1px;
                background-color: #fff;
                border: 1px solid rgba(0, 0, 0, 0.125)
            }

            .list-group {
                display: flex;
                flex-direction: column;
                padding-left: 0;
                margin-bottom: 0
            }

            .todo-indicator {
                position: absolute;
                width: 4px;
                height: 60%;
                border-radius: 0.3rem;
                left: 0.625rem;
                top: 20%;
                opacity: .6;
                transition: opacity .2s
            }

            .bg-warning {
                background-color: #f7b924 !important
            }

            .widget-content {
                padding: 1rem;
                flex-direction: row;
                align-items: center
            }

            .widget-content .widget-content-wrapper {
                display: flex;
                flex: 1;
                position: relative;
                align-items: center
            }

            .widget-content .widget-content-right.widget-content-actions {
                visibility: hidden;
                opacity: 0;
                transition: opacity .2s
            }

            .widget-content .widget-content-right {
                margin-left: auto
            }

            .btn:not(:disabled):not(.disabled) {
                cursor: pointer
            }

            .row{
                display: flex !important;
                align-items: center;
                height: 100%
            }
            .btn {
                position: relative;
                transition: color 0.15s, background-color 0.15s, border-color 0.15s, box-shadow 0.15s
            }

            .btn-outline-success {
                color: #3ac47d;
                border-color: #3ac47d
            }

            .btn-outline-success:hover {
                color: #fff;
                background-color: #3ac47d;
                border-color: #3ac47d
            }

            .btn-outline-success:hover {
                color: #fff;
                background-color: #3ac47d;
                border-color: #3ac47d
            }

            .btn-primary {
                color: #fff;
                background-color: #3f6ad8;
                border-color: #3f6ad8
            }

            .btn {
                position: relative;
                transition: color 0.15s, background-color 0.15s, border-color 0.15s, box-shadow 0.15s;
                outline: none !important
            }

            .card-footer {
                background-color: #fff
            }
            .user-icon{
                color: black !important;
            }
        </style>
    </head>
    <body>
        <jsp:include page="/WEB-INF/paginas/global/navbar.jsp"/>
        <!--Cabecero-->
        <nav class="title-page navbar-expand-lg ">
            <div class="container-fluid">
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <h1>Control de Tickets</h1>
                </div>
            </div>
        </nav>
        
        <!--Datos-->
        <jsp:include page="/WEB-INF/paginas/home/myTickets.jsp"/>
        <!-- Agregar USER MODAL -->
        <jsp:include page="/WEB-INF/paginas/login/editarUsuario.jsp"/>
        <!--Pie de Pagina-->
        <jsp:include page="/WEB-INF/paginas/global/footer.jsp"/>
        <!-- Agregar TICKET MODAL -->
        <jsp:include page="/WEB-INF/paginas/home/agregarTicket.jsp"/>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>        

    </body>
</html>
