package edu.unbosque.JPATutorial.servlets;

import edu.unbosque.JPATutorial.jpa.entities.Library;
import edu.unbosque.JPATutorial.services.BookService;
import edu.unbosque.JPATutorial.services.EditionService;
import edu.unbosque.JPATutorial.services.LibraryService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cretateLibraryEditionServlet", value = "/create-libraryEdition")
public class CreateLibraryEditionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        Integer editionId = Integer.parseInt(request.getParameter("editionId"));
        Integer libraryId = Integer.parseInt(request.getParameter("libraryId"));

//                String mensaje = "entro";
//
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + editionId + "</h1>");
//        out.println("<h1>" + libraryId + "</h1>");
//        out.println("</body></html>");

        LibraryService libraryService = new LibraryService();
        libraryService.addLibraryEdition(editionId,libraryId);

        response.sendRedirect("./index.jsp");

    }

}