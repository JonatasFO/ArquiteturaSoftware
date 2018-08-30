<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="br.usjt.cadastrofilmes.beans.Filmes"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Filme cadastrado</title>
</head>
<body>
	Filme cadastrado com sucesso!!!
	
	<jsp:useBean id="Filmes" class="br.usjt.cadastrofilmes.beans.Filmes" type="br.usjt.cadastrofilmes.beans.Filmes" />
	
		<jsp:setProperty name="Filmes" property="titulo" value="${param.titulo}" />

		<p>
			O titulo é:
			<jsp:getProperty name="Filmes" property="titulo" />
		
	<jsp:setProperty name="Filmes" property="anoLancamento" value="${param.anoLancamento}" />

	<p>
		O Ano de Lançamento é:
		<jsp:getProperty name="Filmes" property="anoLancamento" />
		
</body>
</html>