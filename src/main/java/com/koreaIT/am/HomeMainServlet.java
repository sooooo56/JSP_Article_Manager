package com.koreaIT.am;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/printdan")
public class HomeMainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8;");
		
		
		String inputDan = request.getParameter("dan");
		int dan = Integer.parseInt(inputDan);
		String inputColor = request.getParameter("color");
		
		response.getWriter().append("<div style = 'color:" + inputColor + "'>== " + inputDan + " ==</div>");
		for(int i = 1; i <= 9; i++) {
			response.getWriter().append("<div>" + inputDan + "*" + i + (dan * i) + "</div>");
		}
		
		response.getWriter().append("파라미터 출력 예시 : " + request.getParameter("dan"));
		
	}


}
