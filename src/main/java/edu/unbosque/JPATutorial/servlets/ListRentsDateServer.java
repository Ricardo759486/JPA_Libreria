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
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@WebServlet(name = "listRentsDateServer", value = "/create-listDate")
public class ListRentsDateServer extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String email = request.getParameter("email");
        LocalDate dateInitial = LocalDate.parse(request.getParameter("dateInitial"));
        LocalDate dateFinal = LocalDate.parse(request.getParameter("dateFinal"));

        Integer yearInitial = dateInitial.getYear();
        Integer monthInitial = dateInitial.getMonthValue();
        Integer dayInitial = dateInitial.getDayOfMonth();

        Integer yearFinal = dateFinal.getYear();
        Integer monthFinal = dateFinal.getMonthValue();
        Integer dayFinal = dateFinal.getDayOfMonth();

//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + email + "</h1>");
//        out.println("</body></html>");

        RentService rentService = new RentService();
        rentService.saveDateList(yearInitial, monthInitial, dayInitial, yearFinal, monthFinal, dayFinal, email);

        response.sendRedirect("./index.jsp");

    }

}