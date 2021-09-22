package br.com.mariojp.app.filter;

import java.io.IOException;
import java.util.Date;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/*")
public class PerformanceFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		Date inicio = new Date();
		chain.doFilter(request, response);
		Date fim = new Date();
		System.out.println("Tempo "+(fim.getTime() - inicio.getTime()) );
		
	}

}
