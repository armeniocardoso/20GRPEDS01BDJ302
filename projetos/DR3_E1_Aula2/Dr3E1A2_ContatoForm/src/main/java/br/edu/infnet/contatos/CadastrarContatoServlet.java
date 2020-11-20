package br.edu.infnet.contatos;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;

@WebServlet(name = "CadastrarContatoServlet", urlPatterns = {"/CadastrarContatoServlet"})
public class CadastrarContatoServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //1-Receber os parâmetros
        Contato contato = new Contato();
        contato.setNome(request.getParameter("nome"));
        contato.setEmail(request.getParameter("email"));
        contato.setFone(request.getParameter("fone"));
        //2-Validar os parâmetros
        ArrayList<String> erros = new ArrayList<>();
        if(StringUtils.isBlank(contato.getNome())) {
            
            erros.add("O campo Nome é obrigatório");
        }
        if(StringUtils.isBlank(contato.getEmail())) {
            
            erros.add("O campo Email é obrigatório");
        }
        if(StringUtils.isBlank(contato.getFone())) {
            
            erros.add("O campo Telefone é obrigatório");
        }
        if(!StringUtils.isNumeric(contato.getFone())) {
            
            erros.add("O campo Telefone precisa ser numérico");
        }
        if(erros.isEmpty()) {
            
            //3-Processar a requisição
            
            //4-Colocar os POJOs como objetos de requisição
            request.setAttribute("sucesso", "O contato " + contato.getNome() + " foi cadastrado com sucesso");
        } else {
            
            //4-Colocar os POJOs como objetos de requisição
            request.setAttribute("erros", erros);
        }
        //5-Redirecionar
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
