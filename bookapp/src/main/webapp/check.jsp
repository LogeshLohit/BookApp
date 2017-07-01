<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>Hello
<%@include file="logsample.jsp" %>

<%
request.setAttribute("name", name);
%>



<%-- <%if(name !=null)
{
	out.println("This is what you selected" + name);
	out.println("hello "+ name);
}
%>
 --%>

</body>
</html>