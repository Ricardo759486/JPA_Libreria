package edu.unbosque.JPATutorial.servlets;

import edu.unbosque.JPATutorial.jpa.entities.Customer;
import edu.unbosque.JPATutorial.services.AuthorService;
import edu.unbosque.JPATutorial.services.CustomerService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "updateCustomerServlet", value = "/update-customer")
public class UpdateCustomerServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        Integer age = Integer.parseInt(request.getParameter(("age")));

        Customer customer = new Customer(email, firstName, lastName, gender, age);

        CustomerService customerService = new CustomerService();
        customerService.updateCustomer(email, customer);

        response.sendRedirect("./index.jsp");
    }

}