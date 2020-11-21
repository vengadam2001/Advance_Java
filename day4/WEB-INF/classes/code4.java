import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class code4 extends HttpServlet {
	 
	   public void init() throws ServletException {
	   }

	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				int a=0,b=0,c=0,d=0;
				out.println("<html><body><h1> Power Seris </h1><br><h2>");
			  	try {
					a=Integer.parseInt(request.getParameter("a") );
					b=Integer.parseInt(request.getParameter("b") );

                    for (int i=0; i<b;i++){
                        out.println( Math.pow(a,i)+",");
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