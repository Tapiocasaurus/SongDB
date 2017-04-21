<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body> <h2>Song Registration Result</h2>
    <table>
        <tr>
            <td>Song Name</td>
            <td>${u.songName}</td>
        </tr>
        <tr>
            <td>Band Name</td>
            <td>${u.bandName}</td>
        </tr>
        <tr>
            <td>Genre</td>
            <td>${u.genre}</td>
        </tr>
        <tr>
            <td>Year Released</td>
            <td>${u.year}</td>
        </tr>
        
        </table>
<a href = "viewAll.mvc">View all Users</a>
</body>
</html>