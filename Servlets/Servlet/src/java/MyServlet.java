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


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {

    String givenName;
    String sirName;
    long zip;
    
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
		zip = Long.parseLong(request.getParameter("zip"));
		
		UserInfo newUser = new UserInfo();
		newUser.setUserInfo(givenName, sirName, zip);
		
		pw.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset='ISO-8859-1'>"
				+ "<title>Servlet Demo</title>"
				+ "<link rel='stylesheet' type='text/css' href='/newServlet/style.css'>"
				+ "</head>"
				+ "<body>"
				+ "<h2>Well done!</h2>"
				+ "<p>Java Object \"newUser\" created from user data using this servlet."
				+ "<p>Data below referenced from Java Object.</p>"
				+ "<h2>Info Entered:</h2>");
		pw.println("<p>Given Name: " + newUser.getGivenName() + "</p><p>Sir Name: " + newUser.getSirName() + "</p><p>Zip Code: " + newUser.getZip());
		pw.println("</body>"
				+ "</html>");
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
