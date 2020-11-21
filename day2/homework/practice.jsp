<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Day 2 Home Work</title>
</head>
<body>
Students should upload a single PDF file containing all the following code.<br> <br>
Write the JSP code for the following: <br> <br>
1. Get a number from user and print whether the number is even or odd <br>
    <form action="./practice.jsp" method="get">
    <label for="Number">enter Number</label>
    <input type="number" name="number" value="0">
    <input type="submit">
    </form>
    <% 
    int a;
    if (request.getParameter("number") ==  null){
        a=0;
    }
    else{
        a=Integer.parseInt(request.getParameter("number"));
    }
        if (a%2==0){
            out.println("even");
        }
        else{
            out.println("odd");
        }
    
    %>
<br>
<br>
2. Get a number 'a' from user and print the sum of all numbers from 1 to 'a' <br>
<form action="./practice.jsp" method="get">
    <label for="a">enter a Number</label>
    <input type="number" name="a">
    <input type="submit">
</form>
<%
int sum=0;
if (request.getParameter("a")== null){
    a=0;
}
else{
    a=Integer.parseInt(request.getParameter("a"));
}
for (int i=0; i <= a;i++){
sum+=i;
}
out.println("Sum :"+sum);
%>
<br>
<br>
3. Get a string from the user and display the count of vowels present in it. <br> 
<form action="./practice.jsp" method="post">
<label>enter a sentence</label><input type="text" name="c">
<input type="submit">
</form>
<%
int count=0;
String c = "z"; 
if(request.getParameter("c") != null){
    c=request.getParameter("c");
    c=c.toLowerCase();
}
for (int i=0 ; i < c.length(); i++){
         char ch = c.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
            count =count  + 1;
         }
      }
out.println("No of vowels is: "+count);
%>
<br> <br>
4. Get a number from user and print the first 10 multiples of it.
<form  action="./practice.jsp" method="POST">
<input type="number" value="10" name="d" >
<input type="submit">
</form>


<%
if (request.getParameter("d")==null){
    a=0;
}
else{
    %><p>Ten Multiples of <%= request.getParameter("d")%> are:</p><%
    a=Integer.parseInt(request.getParameter("d"));
    out.println("<table>");
    for(int i=1; i <= 10;i++)
{
out.println(" <tr> <td>"+ a +"*"+ i +"= "+ i*a +" </td> </tr>");
}
out.println("</table>");
}
%>

<br>
<br>
5. Write a jsp code to find whether a year is a leap year or not. <br>
<form action="./practice.jsp" method="get">
<label>enter a year</label><input type="number" name="year">
</form>

<%
int year =0;
if (request.getParameter("year") != null){
    year=Integer.parseInt(request.getParameter("year"));
    out.println(year);
    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            out.println(" is a leap year.");
        }
      else{
            out.println(" is not a leap year.");
        }
}
%>
</body>
</html>