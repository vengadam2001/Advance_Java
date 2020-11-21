<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>All Afternoon Problems in jsp </title>
</head>

<body>
<%@ page import = "java.io.*,java.util.*" %>
<%@ page import="java.sql.*" %>
<%
try {
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = null;
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stv?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
java.sql.Statement stmt = con.createStatement();

ResultSet res1 = stmt.executeQuery("select pid, sum(qty) b from invoice group by pid order by b desc");
out.println("1.Product that is sold most");
while (res1.next()) {
out.println(res1.getInt(1) + " " + res1.getInt(2) +"<br>");
}
out.println("<br>");

ResultSet res2 = stmt.executeQuery("SELECT * from products where id not in (select pid from invoice)");
out.println("2. Products not sold<br>");
while(res2.next()){
out.println(res2.getInt(1)+" "+res2.getString(2)+" "+res2.getInt(3)+"<br>");
}
out.println("<br>");

ResultSet res3 = stmt.executeQuery("SELECT * from products where price= (select max(price) from products) or price= (select min(price) from products)");
out.println("3.Cheapest and expensive product<br>");
while(res3.next()){
out.println(res3.getInt(1)+" '"+res3.getString(2)+"' "+res3.getInt(3)+"<br>");
}
out.println("<br>");

ResultSet res4 = stmt.executeQuery("select * from customer where id in (SELECT cid FROM `invoice` where pid=1)");
out.println("4.Customers who purchased pen product<br>");
while(res4.next()){
out.println(res4.getInt(1)+" '"+res4.getString(2)+"' "+res4.getString(3)+" '"+res4.getString(4)+"'<br>");
}
out.println("<br>");

ResultSet res5 = stmt.executeQuery("select * from customer where id not in (SELECT cid FROM `invoice` where pid=1) and id in (SELECT cid FROM `invoice` where pid=2)");
out.println("5.Customers who purchased pen product<br>");
while(res5.next()){
out.println(res5.getInt(1)+" '"+res5.getString(2)+"' "+res5.getString(3)+" '"+res5.getString(4)+"'<br>");
}
out.println("<br>");





con.close();
} catch (Exception e) {
e.printStackTrace();
out.println(e.getLocalizedMessage());
}


%>
</body>
</html>