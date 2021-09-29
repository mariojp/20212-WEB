package br.com.mariojp.app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.mariojp.app.model.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/user/sistema")
public class SistemaServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Pedro", "123"));
		usuarios.add(new Usuario("Maria", "123"));
		usuarios.add(new Usuario("BRUNO", "123"));

		//TODO ERRO:
		//TODO DUVIDA: 
		request.setAttribute("lista", usuarios);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("sistema.jsp");			
		dispatcher.forward(request, response);
	}
}
