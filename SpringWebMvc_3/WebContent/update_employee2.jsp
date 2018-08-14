<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="u" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<u:form action="updateemployee2" method="post" modelAttribute="emp">
<u:input path="id" readonly="true"/>
<u:errors path="id"></u:errors>
<u:input path="name"/>
<u:errors path="name"></u:errors>
<u:input path="salary"/>
<input type="submit" value="Update">
</u:form>
</body>
</html>