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
              double Fahrenheit=0, Celsius=0;
              String a =" ";
              try {
                a=request.getParameter("a");
                if (a.equals("c")){
                Celsius=Double.parseDouble( request.getParameter("c") );
                Fahrenheit =((Celsius*9)/5)+32;  
                out.println("Temperature in Fahrenheit is: "+Fahrenheit);  
                }
                if (a.equals("k")){
                Fahrenheit=Double.parseDouble( request.getParameter("c") );
                Celsius  = ((Fahrenheit-32)*5)/9;  
                out.println("Temperature in celsius is: "+Celsius); 
                }
              }catch (Exception e) {
                out.println("enter in all the values ");
            }  
            }

	   public void destroy() {   
	   }
	}