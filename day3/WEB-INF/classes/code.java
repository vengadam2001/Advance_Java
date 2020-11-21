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
			  double i=0,p=0,r=0,t=0,n=0;
			  String a="";
			  try {
				  p=Double.parseDouble(request.getParameter("p") );
				  r=Double.parseDouble(request.getParameter("r") );
				  t=Double.parseDouble(request.getParameter("t") );
				  a=request.getParameter("a");
				  if (a.equals("s")){
					a="Simple Intrest : ";
					i=(p*t*r)/100;
				  }
				  if (a.equals("c")){
					  a="Compound Intrest : ";
					  n=Double.parseDouble(request.getParameter("n"));
					  i=(p * Math.pow(1 + (r / n), (n * t))) - p ;
				  }
				}catch (Exception e) {
				  out.println("enter in all the values ");
			  } 
			  out.println("<html><body>"+ a + i +"</body></html>");
	   }

	   public void destroy() {   
	   }
	}