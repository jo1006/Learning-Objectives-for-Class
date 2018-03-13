package edu.dmacc.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MadlibServlet
 */
@WebServlet("/madlibServlet")
public class MadlibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MadlibServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String adjective = request.getParameter("adjective");
		adjective.substring(0).toLowerCase();
		String name1 = request.getParameter("name1");
		name1 = name1.substring(0,1).toUpperCase() +
		name1.substring(1).toLowerCase();
		String name2 = request.getParameter("name2");
		name2 = name2.substring(0,1).toUpperCase() +
		name2.substring(1).toLowerCase();
		String place = request.getParameter("place");
		place.substring(0).toLowerCase();
		String animal = request.getParameter("animal");
		animal.substring(0).toLowerCase();
		String name3 = request.getParameter("name3");
		name3 = name3.substring(0,1).toUpperCase() +
		name3.substring(1).toLowerCase();
		String verb = request.getParameter("verb");
		verb.substring(0).toLowerCase();
		String object = request.getParameter("object");
		object.substring(0).toLowerCase();
		String command = request.getParameter("command");
		command = command.substring(0,1).toUpperCase() +
		command.substring(1).toLowerCase();
		String time = request.getParameter("time");
		time.substring(0).toLowerCase();
		String place2 = request.getParameter("place2");
		place2.substring(0).toLowerCase();
		String emotion = request.getParameter("emotion");
		emotion.substring(0).toLowerCase();
		
		PrintWriter writer = response.getWriter();
		writer.println("On a " + adjective + " day, " + name1 + " and " + name2 +" went to " + place + ".");
		writer.println("They brought their " + animal + " named " + name3 + ".");
		writer.println("They " + verb + " and played a game with a " + object + ".");
		writer.println(command + "! demanded " + name1 + ". Oh No! yelled " + name2 + ".");
		writer.println("It's " + time + " and we need to go to " + place2 + ".");
		writer.println("They were so " + emotion + " to have to leave.");
		writer.close();
	}

}
