package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Objects;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html; charset=utf-8");
        PrintWriter out = res.getWriter();
       // out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html;charset=UTF-8");

        PrintWriter out = res.getWriter();
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String phone = req.getParameter("phone");
        String address = req.getParameter("address");
        String zip = req.getParameter("zip");
        String birthplace = req.getParameter("birthplace");
        String experience = req.getParameter("experience");
        String technology = req.getParameter("technology");
        String design = req.getParameter("design");
        String marital = req.getParameter("marital");
        
        if(technology.equals("MERN Stack Dev")){
            technology="Mongo, Express, React, NodeJS";
        }
        if(technology.equals("MEAN Stack Dev")){
            technology="Mongo, Express, Angular, NodeJS";
        }
        if(technology.equals("LAMP Stack Dev")){
            technology="Linux, Apache, MySQL, PHP";
        }
        if(technology.equals("dotNET")){
            technology="ASP net, C#, ADO.NET, SQL Server, Azure, MAUI";
        }
        if(technology.equals("Mobile Applications")){
            technology="Flutter, React Native, Kotlin, Swift, MAUI";
        }
        if(technology.equals("Data Science")){
            technology="Python, R, SQL, Scala, Julia, C++";
        }
        if(technology.equals("Embedded Systems")){
            technology="C, Rust, C++, Lua, Ada, Assembly";
        }
        if(technology.equals("DevOps Architect")){
            technology="AWS, Azure, Jenkins, Kubernates, Docker, Google Cloud";
        }
        if(technology.equals("Videogames & Modeling")){
            technology="Java, Lua, C#, C++, Unity, Autodesk Maya, Blender";
        }
        if(technology.equals("QA Engineer")){
            technology="Selenium, Postman, Katalon Studio, Apache JMeter, IBM Raional";
        }

        out.print("<!DOCTYPE html>");
        out.print("<html lang=\"en\">");
        out.print("<head>");
        out.print("<title>Info User JEE</title>");
        out.print("<meta charset=\"UTF-8\">");
        out.print("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\">");
        out.print("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">");
        out.print("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\n" + " integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>");
        out.print("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js\"></script>");
        out.print("</head>");
        out.print("<body style=\"background-color:#04001E;\">");
        out.print("<div style=\"display: grid; place-content: initial\">");
        out.print("<div class=\"card-panel\" style=\"width: 40rem; display: flexbox; align-content: flex-start; background-color:#1F1F3A;\">");
        out.print("<h5 style=\"color:#FFFFFF;\">Hello <b>" + firstName + "</b>!!!</h5>");
        out.print("<table class=\"highlight\">");
        out.print("<tbody>");
        out.print("<tr>");
        out.print("<th style=\"color:#FFFFFF; font-size:1.17em; font-weight: 700;\">First name:</th>");
        out.print("<td style=\"color:#FFFFFF; font-size:1.17em; \">" + firstName + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<th style=\"color:#FFFFFF; font-size:1.17em; font-weight: 700;\">Last name:</th>");
        out.print("<td style=\"color:#FFFFFF; font-size:1.17em; \">" + lastName + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<th style=\"color:#FFFFFF; font-size:1.17em; font-weight: 700;\">Phone:</th>");
        out.print("<td style=\"color:#FFFFFF; font-size:1.17em; \">" + "+" + phone + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<th style=\"color:#FFFFFF; font-size:1.17em; font-weight: 700;\">Address line:</th>");
        out.print("<td style=\"color:#FFFFFF; font-size:1.17em; \">" + address + " <b>Zip:</b> " + zip + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<th style=\"color:#FFFFFF; font-size:1.17em; font-weight: 700;\">Birthplace:</th>");
        out.print("<td style=\"color:#FFFFFF; font-size:1.17em; \">" + birthplace + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<th style=\"color:#FFFFFF; font-size:1.17em; font-weight: 700;\">Experience:</th>");
        out.print("<td style=\"color:#FFFFFF; font-size:1.17em; \">" + experience + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<th style=\"color:#FFFFFF; font-size:1.17em; font-weight: 700;\">Technology stack:</th>");
        out.println("<td style=\"color:#FFFFFF; font-size:1.17em; \">" + technology + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<th style=\"color:#FFFFFF; font-size:1.17em; font-weight: 700;\">Design Tool:</th>");
        out.println("<td style=\"color:#FFFFFF; font-size:1.17em; \">" + design + "</td>");
        out.print("</tr>");

        out.print("<tr>");
        out.print("<th style=\"color:#FFFFFF; font-size:1.17em; font-weight: 700;\">Marital Status:</th>");
        out.print("<td style=\"color:#FFFFFF; font-size:1.17em; \">" + marital + "</td>");
        out.print("</tr>");
        out.print("</tbody>");
        out.print("</table>");
        out.print("</div>");
        out.print("</div>");
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
