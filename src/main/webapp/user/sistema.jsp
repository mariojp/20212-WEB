<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="br.com.mariojp.app.model.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<jsp:useBean id="usuario" class="br.com.mariojp.app.model.Usuario" scope="session" />

</head>
<body>

SISTEMA
<br>
Usuario: ${usuario.nome} <br> 
<c:out value="${usuario.nome}" /> <br>
<%=usuario.getNome() %>

</body>
</html>