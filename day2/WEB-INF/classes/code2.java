import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class code extends HttpServlet {
	 
	   public void init() throws ServletException {
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
              response.setContentType("text/html");
              PrintWriter out = response.getWriter();
              out.println("<html> <body>"+response.getParameter("age")+"</body></html>");
	   }

	   public void destroy() {   
	   }
	}