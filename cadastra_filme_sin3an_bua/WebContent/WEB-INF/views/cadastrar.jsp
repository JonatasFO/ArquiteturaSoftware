<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="br.usjt.cadastrofilmes.beans.Filmes"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>P�gina de Formul�rio</title>
</head>
<body>
	<form action="cadastrar" method="post">

		TITULO: <br />
		<input type="text" name="titulo"/> <br /> <br  />
		ANO LAN�AMENTO: <br />
		<input type="text" name="anoLancamento"/> <br  /> <br  />
		<input type="submit" value="Entrar">
	</form>
</body>
</html>