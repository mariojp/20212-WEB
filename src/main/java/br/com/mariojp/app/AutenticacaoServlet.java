package br.com.mariojp.app;

import java.io.IOException;
import java.io.PrintWriter;


import br.com.mariojp.app.model.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AutenticacaoServlet
 */
@WebServlet("/auth")
public class AutenticacaoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String  usuario =  request.getParameter("usuario"); 
		String senha = request.getParameter("senha"); 
		
		Usuario user = new Usuario(usuario, senha);
		
		PrintWriter out = response.getWriter();
		if(autenticacao(user)){
			
			System.out.println("autenticado");
			request.getSession().setAttribute("usuario", user);
			response.sendRedirect("./user/sistema.jsp");
		} else{
			request.setAttribute("erro", "Erro de login");
			RequestDispatcher dispatcher = request.getRequestDispatcher("./index.jsp");			
			dispatcher.forward(request, response);
		}
	
	}
	
	private boolean autenticacao(Usuario usuario) {
		if(usuario != null &&
			usuario.getNome() != null &&
			usuario.getNome().equals(usuario.getSenha())) {
			return true;
		}
		return false;
	}

}
