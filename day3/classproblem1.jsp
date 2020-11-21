<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Class Problem 1 </title>
</head>
<body>
    <h2>1. Create a button by getting 3 values from user - width, height and text</h2>
<%
int w=5,h=5;
String t="default";
%>
    <form action="./classproblem1.jsp" method="POST">
    <input type="number" name="aw" placeholder="enter width">
    <input type="number" name="ah" placeholder="enter height">
    <input type="text" name="at" placeholder="enter button content">
    <input type="submit" >
    </form> 

    <%
    if (request.getParameter("aw") != null)
    { 
        w = Integer.valueOf(request.getParameter("aw"));    
    }
    else{
        w = 5;    
    }
    if (request.getParameter("ah") != null)
    { 
        h = Integer.valueOf(request.getParameter("ah")); 
    }
    else{
        h=5;
    }
    if (request.getParameter("at") != null)
    {
         t = request.getParameter("at"); 
    }
    else{
        t="hello";
    }
    %>
    
    <button style= <%out.println("'height:"+h+"px;" + "width:"+w+"px'");%> >  
        <%=t%> 
    </button>
    <br>
    <h2>2. Calculate the total salary of an employee by the following details
        <ul>
           <li>1. Basic</li>
           <li>2. HRA</li>
           <li>3. Bonus</li>
           <li>Total salary= Basic+15% of HRA + 50% of Bonus</li> 
        </ul>
    </h2>
    <form action="./classproblem1.jsp" method="post">
    <input type="number" name="basic" >
    <input type="number" name="hra" >
    <input type="number" name="bonus" >
    <input type="submit">
    </form>
    <p>Total Salary :
    <%
        try {
            out.println(Integer.valueOf(request.getParameter("basic")) + Integer.valueOf(request.getParameter("hra"))*0.15 +Integer.valueOf(request.getParameter("bonus"))*0.5 );    
    } catch (Exception e) {
      out.println("enter the above values");
    }
    
     %></p>
</body>
</html>