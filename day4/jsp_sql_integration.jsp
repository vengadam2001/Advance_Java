<html>
<body>
<%@ page import="java.sql.*" %>
<table>
<tr>
<th>Product id</th><th>Name</th><th>Price</th>
</tr>

<%

try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {

        		java.sql.Statement stmt=con.createStatement();  
        		
        		ResultSet rs=stmt.executeQuery("select * from products");  
        		while(rs.next())
        		{

out.println("<tr>");
out.println("<td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td></tr>");

        		}
out.println("</table>");

        			
			} catch (Exception e) {
                // TODO: handle exception
                out.println("error 1"+e);
			}
    		finally {
				con.close();
			}
		} catch (Exception e) {
            // TODO: handle exception
            out.println("error 2 "+e);
		}

%>
</body>
</html>