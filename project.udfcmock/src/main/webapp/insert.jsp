<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="insert" modelAttribute="savedata">
id:<form:input path="id"/>
name:<form:input path="name"/>
email:<form:input path="email"/>
phno:<form:input path="phno"/>
<form:button>submit</form:button>
</form:form>




</body>
</html>