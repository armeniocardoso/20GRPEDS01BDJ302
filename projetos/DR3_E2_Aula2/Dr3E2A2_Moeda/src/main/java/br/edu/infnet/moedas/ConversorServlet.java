package br.edu.infnet.moedas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;

@WebServlet(name = "ConversorServlet", urlPatterns = {"/ConversorServlet"})
public class ConversorServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //----------------------------------------------------------------------
        //1-Obter os dados
        String tipo = request.getParameter("tipo");
        String sValor = request.getParameter("valor");

        //----------------------------------------------------------------------
        //2-Validar os dados
        if (StringUtils.isNotBlank(tipo) && StringUtils.isNumeric(sValor)) {

            //------------------------------------------------------------------
            //3-Processar a requisição
            Moeda moeda = new Moeda();
            double valor = Double.parseDouble(sValor);
            switch (tipo) {

                case "Dolar":
                    moeda.setDolar(valor);
                    break;
                case "Euro":
                    moeda.setEuro(valor);
                    break;
                case "Real":
                    moeda.setReal(valor);
            }
            //------------------------------------------------------------------
            //4-Colocar os POJOs na requisição
            request.setAttribute("moeda", moeda);
        } else {

            //------------------------------------------------------------------
            //4-Colocar os POJOs na requisição
            request.setAttribute("erro", "Dados Inválidos");
        }
        //----------------------------------------------------------------------
        //5-Redirecionar o fluxo para o JSP
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
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
