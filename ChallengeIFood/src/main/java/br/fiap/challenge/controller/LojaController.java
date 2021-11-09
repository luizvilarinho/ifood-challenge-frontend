package br.fiap.challenge.controller;

import java.io.IOException;

import br.fiap.challenge.DAO.LojaDAO;
import br.fiap.challenge.model.LojaModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LojaController
 */
@WebServlet("/LojaController")
public class LojaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LojaController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LojaDAO Loja = new LojaDAO();
		
		LojaModel model = new LojaModel();
		
		
		model.setId(1);
		model.setRaioEntrega(Integer.parseInt(request.getParameter("raioentrega")));
		model.setStatus(1);
		model.setOrganizacaoId(1);
		
		if(request.getParameter("pratovegano") == "sim")
		{
			model.setAtendeVegano(1);
		}
		else
		{
			model.setAtendeVegano(0);
		}
		
		model.setNome(request.getParameter("nome"));
		
		Loja.AlterarLoja(model);
		
		response.sendRedirect("buscar_lojas.jsp");
		
		
	}
			
		

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
