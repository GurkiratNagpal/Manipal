package Tels;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Simple extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String msg;



	public void init() throws ServletException {
		msg = "Welcome";
	}

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws  ServletException,IOException{
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>"+ msg + "</h1>");
	}
	public void destroy() {
		
	}






}