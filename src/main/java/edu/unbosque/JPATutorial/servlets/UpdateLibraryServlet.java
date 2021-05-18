package edu.unbosque.JPATutorial.servlets;

import edu.unbosque.JPATutorial.jpa.entities.Library;
import edu.unbosque.JPATutorial.services.LibraryService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "updateLibraryServlet", value = "/update-library")
public class UpdateLibraryServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        Integer libraryId = Integer.parseInt(request.getParameter("libraryId"));
        String name = request.getParameter("name");

               // String mensaje = "entro";

//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + libraryId + "</h1>");
//        out.println("<h1>" + name + "</h1>");
//        out.println("</body></html>");

        Library library = new Library(name);
        LibraryService libraryService = new LibraryService();
        libraryService.updateLibrary(libraryId, library);

        response.sendRedirect("./index.jsp");
    }

}
