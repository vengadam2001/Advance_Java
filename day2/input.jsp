<html>
   <body>      
         <form action = "./input.jsp" method = "post">
            First Name: <input type = "text" name = "first_name" placeholder="First Name">
            <br />
            Last Name: <input type = "text" name = "last_name" placeholder="Last Name"/>
            <br />
            age: <input type = "number" name = "age" placeholder="enter your age" value = "0" />
            <br />
            <input type = "submit" value = "Submit" />
         </form>
         <h1>Using GET Method to Read Form Data</h1>
         <ul>
            <li><p><b>First Name:</b>
               <%out.println(request.getParameter("first_name"));%>
            </p></li>
            <li><p><b>Last  Name:</b>
               <%out.println(request.getParameter("last_name"));%>
            </p></li>
            <li><p><b>Age:</b>
               <%
               int a=0;
               if (request.getParameter("age")!= null)
               {
                  a = Integer.parseInt(request.getParameter("age"));          
               }
               out.println(a);
               %>
            </p></li>
            <li><p><b>Eligible or not:</b>
               <%
               if (a>18){
                  %> 
                  Eligible
                  <%
               }
               else{
                  %>
                  Not Eligible
                  <%
               }
               %>
            </p></li>
         </ul>   
      </body>
</html>