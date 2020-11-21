<html>
    <body>
        <%
        Integer a = 10;
        a=a+10;
        %>
        hello man how are you
        <a href="./hello.jsp">hello <%= a%></a>
        <p>
        <%= request.getParameter("first_name")%>
        </p>
        <a href="./day2/a.jsp">day2.js</a>
    </body>
</html>