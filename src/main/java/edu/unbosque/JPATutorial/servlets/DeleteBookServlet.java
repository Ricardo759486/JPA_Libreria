package edu.unbosque.JPATutorial.servlets;
import edu.unbosque.JPATutorial.services.BookService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "deleteBookServlet", value = "/delete-book")
public class DeleteBookServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

//        String mensaje = "entro";
//
//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>" + mensaje + "</h1>");
//        out.println("</body></html>");

        Integer bookId = Integer.parseInt(request.getParameter("bookId"));

        BookService bookService = new BookService();
        bookService.deleteBook(bookId);

        response.sendRedirect("./index.jsp");
    }

}