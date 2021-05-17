package edu.unbosque.JPATutorial.servlets;

import com.google.gson.Gson;
import edu.unbosque.JPATutorial.services.CustomerService;
import edu.unbosque.JPATutorial.servlets.pojos.CustomerPOJO;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ListCostumersServlet", value = "/list-costumers")
public class ListCostumersServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        CustomerService customerService = new CustomerService();
        List<CustomerPOJO> customerPOJOS =  customerService.listCustomers();

        String customerJsonString = new Gson().toJson(customerPOJOS);

        PrintWriter out = response.getWriter();
        out.print(customerJsonString);
        out.flush();

    }
}
