package com.apress.pss.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@WebServlet(urlPatterns = { "/hello" })
public class HelloWorldServlet extends HttpServlet {

	private static final long serialVersionUID = 2218168052197231866L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			System.out.println("Saying HEllo !!");
			
			
			Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			
			response.getWriter().write("Hello "+auth.getName());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
