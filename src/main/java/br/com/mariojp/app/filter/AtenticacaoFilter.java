package br.com.mariojp.app.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter("/user/*")
public class AtenticacaoFilter implements Filter{

	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		
		System.out.println("Passei pelo Filtro request = "+httpServletRequest.getServletPath());

		
		if ( httpServletRequest.getSession().getAttribute("usuario") != null) {
			chain.doFilter(request, response);
		}else { 
			httpServletResponse.sendRedirect("../index.jsp");
		} 
		
		
		
	}
	

}
