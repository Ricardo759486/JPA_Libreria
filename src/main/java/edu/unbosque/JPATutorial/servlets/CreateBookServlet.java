package edu.unbosque.JPATutorial.servlets;

import edu.unbosque.JPATutorial.services.BookService;
import edu.unbosque.JPATutorial.services.EditionService;
import edu.unbosque.JPATutorial.servlets.pojos.BookPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "cretateBookServlet", value = "/create-book")
public class CreateBookServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String title = request.getParameter("title");
        Integer isbn = Integer.parseInt(request.getParameter("isbn"));
        String genere = request.getParameter("genere");
        String description = request.getParameter("description");
        Integer releaseyear = Integer.parseInt(request.getParameter("releaseyear"));
        Integer authorId = Integer.parseInt(request.getParameter("authorId"));

        BookService bookService = new BookService();


        EditionService editionService = new EditionService();
        bookService.saveBook(title, isbn, authorId, genere);

        List<BookPOJO> books = bookService.listBooks();

        BookPOJO book = books.get(books.size() - 1);

        Integer bookId = book.getBookId();
        editionService.saveEdition(description, releaseyear, bookId);

        response.sendRedirect("./index.jsp");

    }

}
