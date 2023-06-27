package etu2069.framework.servlet;

import jakarta.servlet.http.*;
import etu2069.framework.Mapping;
import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.HashMap;

import jakarta.servlet.*;

public class FrontServlet extends HttpServlet {

    HashMap<String, Mapping> mappingUrls = new HashMap<String, Mapping>();

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
    public HashMap<String, Mapping> getMappingUrls() {
        return mappingUrls;
    }
    public void setMappingUrls(HashMap<String, Mapping> mappingUrls) {
        this.mappingUrls = mappingUrls;
    }
}