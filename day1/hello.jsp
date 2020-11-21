<%@ page import = "java.io.*,java.util.*" %>
<html>
   <head>
      <title>Application object in JSP</title>
   </head>
   
   <body>
      <a href="./a.jsp">hello go to a</a>
      <%
         Integer hitsCount = (Integer)application.getAttribute("hitCounter");
         if( hitsCount ==null || hitsCount == 0 ) {
            /* First visit */
            out.println("Welcome to my website!");
            hitsCount = 1;
         } else {
            /* return visit */
            out.println("Welcome back to my website!");
            hitsCount += 1;
         }
         application.setAttribute("hitCounter", hitsCount);
      %>
      <center>
         <p>Total number of visits: <%= hitsCount%></p>
       
      </center>
   
   </body>
</html>