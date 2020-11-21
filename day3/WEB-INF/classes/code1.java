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
			  double k=0,c=0;
			  String a=" ";
			  try {
                  a=request.getParameter("a");
                  c=Double.parseDouble(request.getParameter("c") );
                  if (a.equals("c")){
                    a="In Kilometers :";
                    c=c/100000;
                  }
                  if (a.equals("k")){
                    a="In Centimeters :";
                    c=c*100000;
                  }
				}catch (Exception e) {
				  out.println("enter in all the values ");
			  } 
			  out.println("<html><body>"+ a + c +"</body></html>");
	   }

	   public void destroy() {   
	   }
	}