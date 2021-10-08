<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Job Form</title>
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
            <h2>Job Form</h2>
            <div class="row card-panel grey lighten-5" style="height: 1200px">
                <form class="col s12 grey lighten-5" id="idform" action="${pageContext.request.contextPath}/MaritalForm.jsp" method="POST" >
                    <div class="row">
                        <h5>Work roll</h5>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="MERN Stack Dev"  />
                                <span>MERN Stack Dev</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="MEAN Stack Dev" />
                                <span>MEAN Stack Dev</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="LAMP Stack Dev" />
                                <span>LAMP Stack Dev</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="dotNET Developer" />
                                <span>dotNET Developer</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="Mobile Applications" />
                                <span>Mobile Applications</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="Data Science" />
                                <span>Data Science</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="Embedded Systems" />
                                <span>Embedded Systems</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="DevOps Architect" />
                                <span>DevOps Architect</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="Videogames & Modeling" />
                                <span>Videogames & Modeling</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="technology" value="QA Engineer" />
                                <span>QA Engineer</span>
                            </label>
                        </p>
                    </div> 
                    <div class="row">
                        <h5>Design Tool</h5>
                        <p>
                            <label>
                                <input type="radio" name="design" value="Figma"  />
                                <span>Figma</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="design" value="Adobe Photoshop" />
                                <span>Adobe Photoshop</span>
                            </label>
                        </p>
                        <p>
                            <label>
                                <input type="radio" name="design" value="Adobe Illustrator" />
                                <span>Adobe Illustrator</span>
                            </label>
                        </p>
                    </div>  
                    <div class="row">
                        <h5>Experience</h5>
                        <div class="input-field col s6">
                            <select name="experience" class="select">
                                <option value="" disabled selected>Choose your option</option>
                                <option value="Less than year">Less than year</option>
                                <option default value="1 to 2 years">1 to 2 years</option>
                                <option value="3 to 4 years">3 to 4 years</option>
                                <option value="more than 4 years">More than 4 years</option>
                            </select>
                        </div>
                    </div>
                    <input name="firstName" type="hidden" value="<%=request.getParameter("firstName")%>"/>
                    <input name="lastName" type="hidden" value="<%=request.getParameter("lastName")%>"/>
                    <input name="phone" type="hidden" value="<%=request.getParameter("phone")%>"/>
                    <input name="address" type="hidden" value="<%=request.getParameter("address")%>"/>
                    <input name="zip" type="hidden" value="<%=request.getParameter("zip")%>"/>
                    <input name="birthplace" type="hidden" value="<%=request.getParameter("birthplace")%>"/>
                    <div class="row">
                        <button class="btn waves-effect waves-light btn-large blue accent-4" type="submit"  style="margin-right: 4rem" value="Send">Submit
                            <i class="material-icons right">send</i>
                        </button>
                    </div>
                </form>
            </div>         
    </body>
</html>
