<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Q1</title>
</head>

<body>
    <%@ page import = "java.io.*,java.util.*" %>
        <%@ page import="java.sql.*" %>
            cheap
            <%
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
        java.sql.Statement stmt = con.createStatement();
        
        ResultSet res = stmt.executeQuery("SELECT * FROM `products` where price = (select min(price) from products)");
        while (res.next()) {
            out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3)+"<br>");
        }
        out.println("\n");
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        out.println(e.getLocalizedMessage());
    }
    
    %><%
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
        java.sql.Statement stmt = con.createStatement();
        
        ResultSet res = stmt.executeQuery("SELECT * FROM `products` where price = (select max(price) from products)");
        while (res.next()) {
            out.println(res.getInt(1) + " " + res.getString(2) + " " + res.getInt(3)+"<br>");
        }
        out.println("\n");
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        out.println(e.getLocalizedMessage());
    }
    %>
</body>

</html>