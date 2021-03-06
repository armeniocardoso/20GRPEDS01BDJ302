package br.edu.infnet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SimpleFormServlet", urlPatterns = {"/SimpleFormServlet"})
public class SimpleFormServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SimpleFormServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Simple Form</h1>");
            out.println("<hr />");
            //------------------------------------------------------------------
            out.println("<h3>Nome ----> " + request.getParameter("nome") + "</h3>");
            out.println("<h3>Senha ---> " + request.getParameter("senha") + "</h3>");
            out.println("<h3>Cor -----> " + request.getParameter("cor") + "</h3>");
            out.println("<h3>Planetas:</h3>");
            String [] planetas = request.getParameterValues("planetas");
            for (String planeta : planetas) {
                
                out.println("<h3>&nbsp;&nbsp;&nbsp;" + planeta + "</h3>");
            }
            //------------------------------------------------------------------
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
