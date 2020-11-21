import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class code3 extends HttpServlet {
	 
	   public void init() throws ServletException {
	   }

	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				int a=0,b=0,c=0,d=0;
				out.println("<html><body><h2>");
			  	try {
					a=Integer.parseInt(request.getParameter("a") );
					b=Integer.parseInt(request.getParameter("b") );
                    c=a<b?a:b;
                    d=a>b?a:b;
                    a=0;
                    for (int i = c;i<d;i++){
                        a=a+i;
                    }
                    out.println("the sum of the interval from "+ c +" to "+ d +" is: "+ a );
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