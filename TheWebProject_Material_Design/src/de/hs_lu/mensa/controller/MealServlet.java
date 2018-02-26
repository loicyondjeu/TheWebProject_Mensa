package de.hs_lu.mensa.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.hs_lu.mensa.model.Meal;

/**
 * Servlet implementation class MealServlet
 */
@WebServlet("/createMeal")
public class MealServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String type = request.getParameter("type");
		
		Meal meal = new Meal();
		
		meal.setName(name);
		meal.setType(type);
		
		response.setContentType("text/html;charset=UTF-8");
		
		final PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<body>");
		out.println("Daten der Speise: <br>");
		out.println(meal.toString());
		out.println("</body>");
		out.println("</html>");
	}

}