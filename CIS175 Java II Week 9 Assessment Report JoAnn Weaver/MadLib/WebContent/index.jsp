<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Try out our MadLib!</title>
</head>
<body>
	<h1>This is our JSP page to begin MadLib</h1>
	<form action="madlibServlet" method="post">
	  <div>
		Enter the following words:<br><br>
		adjective <input id="adjective" type="text" name="adjective" size="20"><br>
	    name <input id="name1" type="text" name="name1" size="20"><br>
		name <input type="text" name="name2" size="20"><br>
		place <input type="text" name="place" size="20"><br>
		animal <input type="text" name="animal" size="20"><br>
		name <input type="text" name="name3" size="20"><br>
		past tense action verb <input type="text" name="verb" size="20"><br>
		object <input type="text" name="object" size="20"><br>
		command <input type="text" name="command" size="20"><br>
		time <input type="text" name="time" size="8"><br>
		place <input type="text" name="place2" size="20"><br>
		emotion ends in -ed <input type="text" name="emotion" size="20"><br><br>
		<input type="submit" value="Submit">
	  </div>	
	</form> 

</body>
</html>