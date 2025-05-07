package com.jonnath.holamundo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//necesitamos implementar una llave
@WebServlet ("/HolaServlet") //si no tenemos esto, no tendremos acceso

public class HolaServlet extends HttpServlet { //Genero la clase con herencia a HttpServlet

    @Override
    protected void doGet(HttpServletRequest req,  HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html"); //Tipo de información que me va a devolver el servidor: de tipo text a html
        //Creo un objeto de tipo PrintWriter();
        PrintWriter out = resp.getWriter(); //El servidor va a tener el método Writer, esto permite escribir en el navegador
        //Generamos el contenido de la respuesta
        out.println("<!DOCTYPE html>"); //Genera el Doctype
        out.println("<html>"); //Genera etiqueta html
        out.println("<head>"); //Genera el head
        out.println("<title>Hola, Servlet</title>"); //Genera el título
        out.println("</head>"); //Cerramos head
        out.println("<body>"); //Abrimos Body
        out.println("<h1>Hola, Servlet. Te saluda Jastin</h1>"); //Mensaje
        out.println("</body>"); //Cerramos Body
        out.println("</html>"); //Cerramos el html
        out.close();
    }
}
