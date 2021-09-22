package br.com.mariojp.app.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/*")
public class LogFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filter)
			throws IOException, ServletException {
		//System.out.println("Log: "+request.getRemoteAddr() +" : "+ ((HttpServletRequest) request).getPathInfo() );
		filter.doFilter(request, response);
	}
	
}
