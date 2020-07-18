<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="welcome.do" method="post">
<pre>
Place : <input type="text" name="place">
Date : <input type="date" name="date">
Captured By : <input type="text" name="capturedBy">
Calamity Type : <select name="calamityType">
					<option value="selected">selected</option>
					<option value="Flood">Flood</option>
					<option value="Rain">Rain</option>
					<option value="Cyclone">Cyclone</option>
					<option value="Earth quake">Earth quake</option>
                </select>
                
Area : <input type="number" name="area">
Average Loss : <input type="text" name="averageLoss">
No Of Deaths : <input type="number" name="noOfDeaths">
No Of Injured : <input type="number" name="noOfInjured">

<button type="submit">Register</button>
</pre>
</form>
</body>
</html>