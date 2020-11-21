import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class code extends HttpServlet {
	 
	   public void init() throws ServletException {
	   }

	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				double a=0,b=0,c=0;
				out.println("<html><body><h2>");
			  	try {
					a=Double.parseDouble(request.getParameter("a") );
					b=Double.parseDouble(request.getParameter("b") );
					c=Double.parseDouble(request.getParameter("c") );

					double result = b * b - 4.0 * a * c;

					if (result > 0.0) {
						double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
						double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
						out.println("The roots are " + r1 + " and " + r2);
					} else if (result == 0.0) {
						double r1 = -b / (2.0 * a);
						out.println("The root is " + r1);
					} else {
						out.println("The equation has no real roots.");
					}

				  }
				catch (Exception e) {
				  out.println("enter in all the values with integers (i.e  2,-3,2.34,-55.32) <br>" + e );
				//   out.println("hello"+ e );

			  } 
				out.println("</h2></body></html>");

			//   out.println("<html><body>"+ a + i +"</body></html>");
	   }

	   public void destroy() {   
	   }
	}