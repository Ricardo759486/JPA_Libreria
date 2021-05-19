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

@WebServlet(name = "deleteRentServlet", value = "/delete-rent")
public class DeleteRentServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        RentService rentService = new RentService();

        Integer rentId = Integer.parseInt(request.getParameter("rentId"));

        rentService.deleteRent(rentId);

        response.sendRedirect("./index.jsp");
    }

}
