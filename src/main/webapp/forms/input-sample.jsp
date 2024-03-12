<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Input Sample</title>
</head>
<body>
    <h1>Input Sample</h1>
    <form action="/websample/InputSampleServlet" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        
        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required><br><br>
        
        <label for="contact">Contact:</label>
        <input type="text" id="contact" name="contact"><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>