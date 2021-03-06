package edu.unbosque.JPATutorial.servlets;

import edu.unbosque.JPATutorial.services.EditionService;
import edu.unbosque.JPATutorial.services.RentService;
import edu.unbosque.JPATutorial.servlets.pojos.EditionPOJO;
import edu.unbosque.JPATutorial.servlets.pojos.RentPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "deleteEditionServlet", value = "/delete-edition")
public class DeleteEditionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        EditionService editionService = new EditionService();

        Integer editionId = Integer.parseInt(request.getParameter("editionId"));

        editionService.deleteEdition(editionId);

        response.sendRedirect("./index.jsp");
    }

}
