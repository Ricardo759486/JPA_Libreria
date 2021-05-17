package edu.unbosque.JPATutorial.servlets;

import edu.unbosque.JPATutorial.services.BookService;
import edu.unbosque.JPATutorial.services.EditionService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "cretateEditionServlet", value = "/create-edition")
public class CreateEditionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String description = request.getParameter("description");
        Integer releaseyear = Integer.parseInt(request.getParameter("releaseyear"));
        Integer bookId = Integer.parseInt(request.getParameter("bookId"));


        EditionService editionService = new EditionService();
        editionService.saveEdition(description, releaseyear, bookId);

        response.sendRedirect("./index.jsp");

    }

}