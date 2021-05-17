package edu.unbosque.JPATutorial.servlets;

import edu.unbosque.JPATutorial.jpa.entities.Author;
import edu.unbosque.JPATutorial.jpa.entities.Edition;
import edu.unbosque.JPATutorial.services.AuthorService;
import edu.unbosque.JPATutorial.services.EditionService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updateEditionServlet", value = "/update-edition")
public class UpdateEditionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        Integer editionId = Integer.parseInt(request.getParameter("editionId"));
        String descripcion = request.getParameter("description");
        Integer releaseyear = Integer.parseInt(request.getParameter("releaseyear"));
        Edition edition = new Edition(editionId,descripcion,releaseyear);

        EditionService editionService = new EditionService();
        editionService.updateEdition(editionId,edition);

        response.sendRedirect("./index.jsp");
    }

}