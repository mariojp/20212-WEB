package br.com.mariojp.app;

import java.io.IOException;
import java.io.PrintWriter;

import com.sun.jdi.request.VMDeathRequest;

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

	private String usuario;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		usuario =  request.getParameter("usuario"); 
		String senha = request.getParameter("senha"); 
		
		PrintWriter out = response.getWriter();
		if(usuario != null && usuario.equals(senha)){
			response.sendRedirect("./sistema.jsp");
		}else if(usuario == null){
			response.sendRedirect("./index.jsp");
		} else{
			request.setAttribute("erro", "Erro de login");

			RequestDispatcher dispatcher = request.getRequestDispatcher("./index.jsp");			
			dispatcher.forward(request, response);
			//response.sendRedirect("./index.jsp?erro=erro");
		}
	
	}

}
