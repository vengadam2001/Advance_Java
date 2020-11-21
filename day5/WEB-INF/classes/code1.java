import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class code extends HttpServlet {
	 
	   public void init() throws ServletException {
	   }
	   public static String adduser(String username, String password) {
    	
    	try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {
        		java.sql.Statement stmt=con.createStatement();  
				int a=stmt.executeUpdate("insert into userdb values('"+username+"','"+password+"');");
				return("success");
			} catch (Exception e) {
				return("Username already exists please try another username");
				// TODO: handle exception
			}
    		finally {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
		return("finished");
	}
	public static String check(String username, String password)
    {
    	try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {
        		java.sql.Statement stmt=con.createStatement();  
				ResultSet rs=stmt.executeQuery("select * from userdb where username like '"+username+"';");  
        		while(rs.next())
        		{
				if (username.equals(rs.getString(1))){
					if (rs.getString(2).equals(password)){
						return("Success you have logged in through my self made service");
					}
					else{
						return("password wrong");
					}
				}
        		}	
			} catch (Exception e) {
				return("username does not exists"+username+" -- " + password + " error : " +e);
				// TODO: handle exception
			}
    		finally {
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
	
		}
		return("Finished");
    }   
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				String username="",password="",options="",a="";
				out.println("<html><body><h2>");
			  	try {
					username=request.getParameter("username");
					password=request.getParameter("password");
                    options=request.getParameter("option");
                        
				  }
				catch (Exception e) {
				  out.println("Error<br>" + e );
				//   out.println("hello"+ e );

			  } 
				out.println("</h2></body></html>");

			//   out.println("<html><body>"+ a + i +"</body></html>");
	   }

	   public void destroy() {   
	   }
	}