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

              int i,m=0,flag=0;      
              int n=3;
              try {
                  n=Integer.parseInt(request.getParameter("a"));
              } catch (Exception e) {
                  out.println("Technical Error occored");
              }
              m=n/2;      
              if(n==0||n==1){  
               out.println(n+" is not prime number");      
              }else{  
               for(i=2;i<=m;i++){      
                if(n%i==0){      
                 out.println(n+" is not prime number");      
                 flag=1;      
                 break;      
                }      
               }      
               if(flag==0)  { out.println(n+" is prime number"); }  
              }  
            }

	   public void destroy() {   
	   }
	}