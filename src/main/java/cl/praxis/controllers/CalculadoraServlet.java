package cl.praxis.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CalculadoraServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int num1 = Integer.parseInt(request.getParameter("numero1"));
			int num2 = Integer.parseInt(request.getParameter("numero2"));
			String operacion = request.getParameter("operacion");

			StringBuilder resultado = new StringBuilder();

			switch (operacion) {
			case "suma":
				resultado.append("Resultado: ").append(num1 + num2);
				break;
			case "resta":
				resultado.append("Resultado: ").append(num1 - num2);
				break;
			case "multiplicacion":
				resultado.append("Resultado: ").append(num1 * num2);
				break;
			case "division":
				if (num2 != 0) {
					resultado.append("Resultado: ").append(num1 / num2);
				} else {
					resultado.append("El divisor no puede ser 0.");
				}
				break;
			case "ordenar":
				if (num1 < num2) {
					resultado.append("Números ordenados de menor a mayor: ").append(num1).append(", ").append(num2);
				} else {
					resultado.append("Números ordenados de menor a mayor: ").append(num2).append(", ").append(num1);
				}
				break;
			case "parimpar":
				resultado.append(num1).append(" es ").append(num1 % 2 == 0 ? "par" : "impar").append(" y ").append(num2)
						.append(" es ").append(num2 % 2 == 0 ? "par" : "impar");
				break;
			}
			request.setAttribute("resultado", resultado.toString());
			request.getRequestDispatcher("resultado.jsp").forward(request, response);
		} catch (NumberFormatException e) {
			response.sendRedirect("error.jsp");
		}
	}

}
