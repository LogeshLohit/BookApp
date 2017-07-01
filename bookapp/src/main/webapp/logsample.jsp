<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="" >

<select name="item">
<option value="1">one</option>
<option value="2">two</option>
<option value="3">three</option>
</select>
<select name="s">
<option value="AAA">AAA</option>
<option value="BBB">bbb</option>
</select>




<input type="submit" value="Select Subject" />
</form>
Answer is:<%String name=(String)request.getParameter("item");%>
<%=name %>

<%String a=request.getParameter("s"); %>
<%=a %>
--

</body>

</html>