<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <p>
        Students should upload a single PDF file containing the source code for the following.
<br>
write the jsp code for the following <br><br>
1. Find the smallest of three numbers <br>
<%
int num1, num2, num3, result, temp;
num1 = 5;
num2 = 4;
num3 = 3;
out.println("num1:"  + num1); %><br>
<% out.println("num2: " + num2); %><br>
<% out.println("num3: " + num3); %><br>
<% temp = num1 < num2 ? num1:num2;
result = num3 < temp ? num3:temp;
out.println("Smallest Number is: "+result);
%> <br><br>
2. Calculate the speed when time and distance are given <br>
<% 
float speed , time , dist;
dist=20;
time=30;
speed=dist/time;
out.println("speed is "+speed );
%> <br> <br>
3. Find the area of square <br>
<%    
int side=20;
out.println("Square's area is : " + side*side); 
%> <br> <br>
4. Find the factorial of a number <br>
<%
    int number = 8;
        long fact = 1;
        for(int i = 1; i <= number; i++)
        {
            fact = fact * i;
        }
        out.println("Factorial of "+number+" is: "+fact);
    %> <br> <br>
5. Find the square root of a number <br>
<%
int a = 100;
out.println("Square root of a is: " + Math.sqrt(a));
%>
    </p>
</body>
</html>