package etu2069.framework.servlet;

import jakarta.servlet.http.*;

import java.io.IOException;
import java.net.http.HttpResponse;

import jakarta.servlet.*;

public class FrontServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
    {
        processRequest(request, response);
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String a = "Hello";
       request.setAttribute("valeur",a);
       RequestDispatcher dispacth = request.getRequestDispatcher("Index.jsp");

       dispacth.forward(request,response);
    }
}