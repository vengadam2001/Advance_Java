<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Day 2</title>
</head>
<body>
    <table>
    <tr>
        <th>
        Num1
        </th>
        <th>
        Num2
        </th>
    </tr>
    <%
    for(int i =0;i<20;i++){
        out.println("<tr>");
        out.println("<td style='color:blue'>"+i+"</td> <td style='color:red'>"+i*i+"</td> </tr>");
    }
    %>
    </table>
</body>
</html>