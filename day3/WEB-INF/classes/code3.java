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
              
                int number = 0, originalNumber, remainder, result = 0;
                try {
                    number = Integer.parseInt(request.getParameter("a"));
                } catch (Exception e) {
                    out.println("Techinal Error");
                }
                originalNumber = number;
                while (originalNumber != 0)
                {
                remainder = originalNumber % 10;
                result += Math.pow(remainder, 3);
                originalNumber /= 10;
                }
                if(result == number)
                    out.println(number + " is an Armstrong number.");
                else
                    out.println(number + " is not an Armstrong number.");
                


            }

	   public void destroy() {   
	   }
	}