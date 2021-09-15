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

<%=request.getParameter("erro") %>

<%=request.getAttribute("erro") %>

<BR>
<BR>
<BR>
ATRIBUTOS E ESCOPOS
<BR>
<%
	//declarei e inicializei a varievel com 0
	Integer countPage = 0 ;
	if(pageContext.getAttribute("aCountPage") != null ){
		countPage = (Integer) pageContext.getAttribute("aCountPage");
	}
	countPage = countPage + 1;
	pageContext.setAttribute("aCountPage", countPage);
	out.write("Page scope: "+countPage);

	Integer countRequest = 0 ;
	if(request.getAttribute("aCountRequest") != null ){
		countRequest = (Integer) request.getAttribute("aCountRequest");
	}
	countRequest = countRequest + 1;
	request.setAttribute("aCountRequest", countRequest);
	out.write("Request scope: "+countRequest);

	
	Integer countSession = 0 ;
	if(session.getAttribute("aCountSession") != null ){
		countSession = (Integer) session.getAttribute("aCountSession");
	}
	countSession = countSession + 1;
	session.setAttribute("aCountSession", countSession);
	out.write("Session scope: "+countSession);
	
	
	Integer countApplication = 0 ;
	if(application.getAttribute("aCountApplication") != null ){
		countApplication = (Integer) application.getAttribute("aCountApplication");
	}
	countApplication = countApplication + 1;
	application.setAttribute("aCountApplication", countApplication);
	out.write("Application scope: "+countApplication);
	
	
%>




</form>
</body>
</html>