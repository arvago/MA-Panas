<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Personal Information</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <script type="text/javascript" >
            $(document).ready(function () {
                $('.select').formSelect();
            });

            $(document).ready(function () {
                $('input#input_text, textarea#textarea2').characterCounter();
            });
        </script> 
    </head>
    <body>
        <div class="container ">
            <h2>Personal Information</h2>
            <div class="row card-panel grey lighten-5" style="height: 1200px">
                <form class="col s12 grey lighten-5" action="${pageContext.request.contextPath}/JobForm.jsp" method="POST" >
                    <div class="row">
                        <div class="input-field col s6">
                            <input  type="text" class="validate" name="firstName" ></input>
                            <label for="firstName">First Name</label>
                        </div>
                        <div class="input-field col s6">
                            <input type="text" class="validate" name="lastName">
                            <label for="lastName">Last Name</label>
                        </div>
                        <div class="row">    
                            <div style="margin-left: 6px" class="input-field col s2 ">
                                <input maxlength="10" type="tel" class="validate"  name="phone" >
                                <label for="phone">Phone</label>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <h5>Address</h5>
                        <div class="row">    
                            <div style="margin-left: 6px" class="input-field col s6 ">
                                <input type="text" class="validate"  name="address" >
                                <label for="address">Address Line*</label>
                            </div>
                            <div style="margin-left: 6px" class="input-field col s2 ">
                                <input maxlength="7" type="text" class="validate"  name="zip">
                                <label for="zip">Zip/Postal Code*</label>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <h5>Birthplace</h5>
                        <div class="input-field col s6">
                            <select name="birthplace" class="select">
                                <option value="" disabled selected>Choose your option</option>
                                <option default value="Mexico City, Mexico">Mexico City, Mexico</option>
                                <option value="Teheran, Iran">Teheran, Iran</option>
                                <option value="Tokyo, Japan">Tokyo, Japan</option>
                                <option value="Kolkata, India">Kolkata, India</option>
                                <option value="Los Angeles, EE.UU">Los Angeles, EE.UU</option>
                            </select>
                        </div>
                    </div>
                    <div class="row">
                        <button class="btn waves-effect waves-light btn-large blue accent-4" type="submit" style="margin-right: 4rem" value="Send">Submit
                            <i class="material-icons right">send</i>
                        </button>
                    </div>
                </form>
            </div>        
    </body>
</html>
