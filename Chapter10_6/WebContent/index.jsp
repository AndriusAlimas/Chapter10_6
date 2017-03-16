<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="formTags" uri="myFormTagLib"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

	<jsp:useBean id="colorList" scope="application" type="java.util.List" class="java.util.ArrayList">
		<% colorList.add("light"); 
		colorList.add("amber"); 
		colorList.add("brown"); 
		colorList.add("dark"); 
		%>
	</jsp:useBean>
	
	<form action="result.jsp" method="post">
		<p>Select beer characteristic</p>
		Color:
		<%-- Mimic HTML select tag with custom created tag: --%>
		<formTags:select name="color" size="1" 
		optionList="${applicationScope.colorList}"/>
		<br><br><br><input type="submit">
		
	</form>
</body>
</html>