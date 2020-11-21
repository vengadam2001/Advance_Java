import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class code1 extends HttpServlet {
	 
	   public void init() throws ServletException {
	   }

	   public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
			    double n1=0,n2=0,lcm=0;
				out.println("<html><body><h2>");
			  	try {
					n1  =Double.parseDouble(request.getParameter("a") );
					n2  =Double.parseDouble(request.getParameter("b") );
                    // maximum number between n1 and n2 is stored in lcm
                    lcm = (n1 > n2) ? n1 : n2;
                    while(true) {
                    if( lcm % n1 == 0 && lcm % n2 == 0 )
                    {
                        out.println("The LCM of " + n1 +"and " + n2 + "is"+ lcm );
                        break;
                    }
                    ++lcm;
                    }
				  }
				catch (Exception e) {
				  out.println("" + e );
				//   out.println("hello"+ e );
			  } 
				out.println("</h2></body></html>");
			//   out.println("<html><body>"+ a + i +"</body></html>");
	   }

	   public void destroy() {   
	   }
	}