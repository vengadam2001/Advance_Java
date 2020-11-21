import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class code1 extends HttpServlet {
	   public void init() throws ServletException {
	   }
	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {      
	      response.setContentType("text/html");
              PrintWriter out = response.getWriter();
		  out.println("Welcome");
		  out.println(request.getParameter("first_name"));
	   }
	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {      
	      response.setContentType("text/html");
              PrintWriter out = response.getWriter();
		  out.println("Welcome");
		  out.println(request.getParameter("first_name"));
	   }
	   public void destroy() {  
	   }
	}