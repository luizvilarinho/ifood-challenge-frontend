package br.fiap.challenge.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

import br.fiap.challenge.DAO.EnderecoDAO;
import br.fiap.challenge.DAO.LojaDAO;
import br.fiap.challenge.model.EnderecoModel;
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
	private LojaDAO lojaDAO;
	private EnderecoDAO enderecoDAO;
    /**
     * Default constructor. 
     */
    public LojaController() {
        lojaDAO = new LojaDAO();
        enderecoDAO = new EnderecoDAO();
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
		
		
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("cadastroLoja"))
		{
			
			/*
			 * LojaModel model = new LojaModel();
			 * 
			 * model.setId(1);
			 * model.setRaioEntrega(Integer.parseInt(request.getParameter("raioentrega")));
			 * model.setStatus(1); model.setOrganizacaoId(1);
			 * 
			 * 
			 * Date date = new Date();
			 * 
			 * model.setDataCadastro(date);
			 * 
			 * if(request.getParameter("pratovegano") == "sim") { model.setAtendeVegano(1);
			 * } else { model.setAtendeVegano(0); }
			 * 
			 * model.setNome(request.getParameter("nome"));
			 * 
			 * lojaDAO.IncluirLoja(model);
			 */
			
			EnderecoModel e = new EnderecoModel();
			e.setBairro(request.getParameter("bairro"));
			e.setCEP(request.getParameter("cep"));
			e.setCidade(request.getParameter("cidade"));
			e.setComplemento(request.getParameter("complemento"));
			e.setLogradouro(request.getParameter("logradouro"));
			e.setLojaId(1);
			e.setNumero(request.getParameter("numero"));
			e.setPais(request.getParameter("pais"));
			e.setUf(request.getParameter("estados"));
			
			enderecoDAO.IncluirEndereco(e);
			
		}
		
		response.sendRedirect("buscar_lojas.jsp");
		
		
	}
			
		

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
