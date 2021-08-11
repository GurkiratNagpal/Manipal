package Tels;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpRequest;

import jakarta.servlet.http.*;
public class Basic extends HttpServlet {
	String msg;
	
	
	
	//url:http://localhost:8080/Welcoming/hello
	
	public void init() {
		msg = "This is my first program and I am here to welcome you!";
	}
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>"+ msg + "</h1>");
		
		
	}
	public void destroy() {
		
	}
}
