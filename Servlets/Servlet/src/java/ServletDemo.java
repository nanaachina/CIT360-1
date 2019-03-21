/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author seth
 */


@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {

    String givenName;
    String sirName;
    long age;
    String color;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        		PrintWriter pw = response.getWriter();
		
		givenName = request.getParameter("givenName");
		sirName = request.getParameter("sirName");
		age = Long.parseLong(request.getParameter("age"));
		color = request.getParameter("color");

		UserData newUser = new UserData();
		newUser.setUserData(givenName, sirName, age, color);
		
		pw.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset='ISO-8859-1'>"
				+ "<title>Servlet Demo</title>"
				+ "<link rel='stylesheet' type='text/css' href='/newServlet/style.css'>"
				+ "</head>"
				+ "<body>"
				+ "<h2>Well done!</h2>"
				+ "<p>Information below from given data.</p>"
				+ "<h2>Your Information:</h2>");
		pw.println("<p>Given Name: " + newUser.getGivenName() + "</p><p>Sir Name: " + newUser.getSirName() + "</p><p>Your Age: " + newUser.getAge() + "</p><p>Your Favorite Color: " + newUser.getColor());
		pw.println("</body>"
				+ "</html>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
