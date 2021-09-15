<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="br.com.mariojp.app.model.Usuario"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:useBean id="usuario" class="br.com.mariojp.app.model.Usuario" scope="session" />

<%
if(usuario.getNome() == null) {
	response.sendRedirect("./index.jsp");
}
%>

</head>
<body>

SISTEMA
<br>
Usuario: <%=usuario.getNome() %>


</body>
</html>