import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class code2 extends HttpServlet {
	 
	   public void init() throws ServletException {
	   }

	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
                double a=0,b=0,hcf=0;
				out.println("<html><body><h2>");
			  	try {

					a = Double.parseDouble(request.getParameter("a") );
					b = Double.parseDouble(request.getParameter("b") );

                    for(double i = 1; i <= a || i <= b; i++) {
                       if( a%i == 0 && b%i == 0 )
                       hcf = i;
                    }

                    out.println("HCF of given two numbers is : "+hcf);
                  
                }

				catch (Exception e) {
                    out.println(" Error: <br>" + e );
				//   out.println("hello"+ e );

			  } 
				out.println("</h2></body></html>");

			//   out.println("<html><body>"+ a + i +"</body></html>");
	   }

	   public void destroy() {   
	   }
	}