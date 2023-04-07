<%@page import="dto.studentdto"%>
<%@page import="dao.EmpDao"%>
<%@page import="dto.EmpDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1px" >
<tr>
<th>stdid</th>
<th>name</th>
<th>email</th>
<th>pno</th>
</tr>

<%
List<studentdto> data =  (List<studentdto>) request.getAttribute("fetchbyall");
for(studentdto empDto :data){%>

<tr>
<td><%=empDto.getId() %></td>
<td><%=empDto.getName() %></td>
<td><%=empDto.getEmail()%></td>
<td><%=empDto.getPhno() %></td>
</tr>	
<% 
}
%>
</table>
</body>
</html>