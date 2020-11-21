<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>search products</title>
</head>
<body>
    <%@ page import="java.sql.*" %>
    <form action="./problem2.jsp" method="post">
    <input type="search" name="a" id="">
    <input type="submit" value="search">
    </form>
    <%
    String name="";
    if (request.getParameter("a") != null){
        name=request.getParameter("a");
    }
    try {
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {
    			out.println("<table> <tr>  <th>Id</th> <th>Name</th>  <th>Price</th> </tr>");
        		java.sql.Statement stmt=con.createStatement();  
        		ResultSet rs=stmt.executeQuery("select * from  products where name like '"+name+"';");  
        		while(rs.next())
        		{
        		out.println("<tr> <td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td></tr>");  
        		}	

    		} catch (Exception e) {
				// TODO: handle exception
			}
    		finally {
                out.println("</table>");
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    %>
</body>
</html>