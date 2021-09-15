<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- url navegador http://localhost:8080/login/ => ./-->
<!-- url navegador http://localhost:8080/ => /-->
<form action="./auth" method="post">
Usuario: <input id="u" name="usuario" type="text"><br>
Senha: <input id="s" name="senha" type="password"><br>
<button type="submit">Entrar</button>
<br>
<%=request.getAttribute("erro")%>




</form>
</body>
</html>