<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Song Registration Form</h2>
<mvc:form modelAttribute="song" action="result.mvc">
	<table>
	    <tr>
	        <td><mvc:label path="songName">Song Name</mvc:label></td>
	        <td><mvc:input path="songName" /></td>
	    </tr>
	    <tr>
	        <td><mvc:label path="bandName">Band Name</mvc:label></td>
	        <td><mvc:input path="bandName" /></td>
	    </tr>

        <tr>
            <td><mvc:label path="genre">Genre</mvc:label></td>
            <td><mvc:select path="genre" items="${genres}" /></td>
        </tr>
		<tr>
            <td><mvc:label path="year">Year</mvc:label></td>
            <td><mvc:input path="year" /></td>
        </tr>
        <tr>
	        <td colspan="2">
                <input type="submit" value="Submit" />
	        </td>
	    </tr>
	</table>  
</mvc:form>
<a href = "viewAll.mvc">View all Users</a>
</body>
</html>