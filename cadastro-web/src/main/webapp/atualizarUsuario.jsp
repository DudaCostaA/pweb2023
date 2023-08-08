<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Atualizar Usuario</title>
</head>
<body>
	
	<div class="container-fluid">
		<h1>Atualizar Usu�rio</h1>
		<form method="post" action="cadastrarUsuario">
			<label for="nome">Nome:</label>
			<input type="text" name="nome" value="${nome}">
			<label for="email">E-mail:</label>
			<input type="text" name="email" value="${email}"><br><br>
			<label for="senha1">Senha:</label>
			<input type="password" name="senha1" >
			<label for="senha2">Senha confirmada:</label>
			<input type="password" name="senha2"><br><br>
			<input type="submit" value="Salvar" class="btn btn-primary">
			<a class="btn btn-secondary" href="cadastrarUsuario" role="button">Listar Usu�rios</a>
			<a class="btn btn-secondary" href="index.html" role="button">Voltar</a>
		</form>
		<c:if test="${not empty param.nome}">
			<hr>
			<div class="alert alert-danger" role="alert">
				${param.nome}<span>, as senhas informadas n�o s�o iguais</span>
			</div>		
		</c:if>		
	</div>
	<a href="usuarioListagem.jsp" class="btn btn-success">Salvar</a>
</body>
</html>