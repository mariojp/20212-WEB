<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Projeto 1</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<link href="./css/app.css" rel="stylesheet">


</head>
<body class="text-center">

<div class="container">
	<!-- url navegador http://localhost:8080/login/ => ./-->
	<!-- url navegador http://localhost:8080/ => /-->
	<div class="form-login">
		<form action="./auth" method="post">
		
		<h1 class="h3 mb-3 fw-normal"> Acesso</h1>
		
		<div class="form-floating">
			<input id="u" class="form-control" name="usuario" type="text" placeholder="login">
			<label for="u" >Usuario:</label>
		</div>
		<div class="form-floating">
			<input id="s" class="form-control" name="senha" type="password" placeholder="Password">
			<label for="s" >Senha:</label>
		</div>
		<button class="w-100 btn btn-lg btn-primary"  type="submit">Entrar</button>
		<br>
		${erro}
	</div>
</div>



</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
</body>
</html>