package edu.unbosque.JPATutorial.servlets;

import edu.unbosque.JPATutorial.services.BookService;
import edu.unbosque.JPATutorial.services.EditionService;
import edu.unbosque.JPATutorial.services.RentService;
import edu.unbosque.JPATutorial.servlets.pojos.BookPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "cretateRentServlet", value = "/create-rent")
public class CreateRentServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String email = request.getParameter("email");
        Integer editionId = Integer.parseInt(request.getParameter("editionId"));
        String date = request.getParameter("date");



                String mensaje = "entro";

//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + email + "</h1>");
//        out.println("<h1>" + editionId + "</h1>");
//        out.println("<h1>" + fechaDate.toString() + "</h1>");
//        out.println("</body></html>");

        RentService rentService = new RentService();
        rentService.saveRent(date,email,editionId);

        response.sendRedirect("./index.jsp");

    }

}
