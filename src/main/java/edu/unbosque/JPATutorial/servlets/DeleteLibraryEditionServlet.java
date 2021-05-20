package edu.unbosque.JPATutorial.servlets;

import edu.unbosque.JPATutorial.jpa.entities.Library;
import edu.unbosque.JPATutorial.services.EditionService;
import edu.unbosque.JPATutorial.services.LibraryService;
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

@WebServlet(name = "deleteLibraryEditionServlet", value = "/delete-libraryEdition")
public class DeleteLibraryEditionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        LibraryService libraryService = new LibraryService();

        Integer editionId = Integer.parseInt(request.getParameter("editionId"));

//        Integer editionId = 16;

        libraryService.deleteLibraryMany(editionId);

        response.sendRedirect("./index.jsp");
    }

}
