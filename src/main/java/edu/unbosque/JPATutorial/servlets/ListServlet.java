package edu.unbosque.JPATutorial.servlets;

import com.google.gson.Gson;
import edu.unbosque.JPATutorial.services.LibraryService;
import edu.unbosque.JPATutorial.servlets.pojos.LibraryManyPOJO;
import edu.unbosque.JPATutorial.servlets.pojos.LibraryPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "listServlet", value = "/list-librariesMulti")
public class ListServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        LibraryService libraryService = new LibraryService();
        List<LibraryManyPOJO> liv =  libraryService.listLibrariesEdition();

        String librariesMultiJsonString = new Gson().toJson(liv);

        PrintWriter out = response.getWriter();
        out.print(librariesMultiJsonString);
        out.flush();

    }

}
