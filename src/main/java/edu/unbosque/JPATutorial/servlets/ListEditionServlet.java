package edu.unbosque.JPATutorial.servlets;

import com.google.gson.Gson;
import edu.unbosque.JPATutorial.services.EditionService;
import edu.unbosque.JPATutorial.servlets.pojos.EditionPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "listEditionsServlet", value = "/list-editions")
public class ListEditionServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        EditionService editionService = new EditionService();
        List<EditionPOJO> editions =  editionService.listEdition();

        String editionsJsonString = new Gson().toJson(editions);

        PrintWriter out = response.getWriter();
        out.print(editionsJsonString);
        out.flush();

    }

}