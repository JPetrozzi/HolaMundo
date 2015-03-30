<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="media/bootstrap/css/bootstrap.css"/>
<title>Hola Mundo</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-7">
				<div class="jumbotron">
					<h1>Hola Mundo!</h1>
					<p class="lead">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Possimus veniam libero autem ab totam animi eos? Quisquam ullam consectetur temporibus. Odio nam quasi dicta eum quibusdam porro expedita hic voluptate!</p>
					<p><a class="btn btn-lg btn-success" href="registro.jsp">Crear Cuenta</a></p>
				</div>
			</div>
			<div class="col-md-5">
				<div class="jumbotron">
					<form action="RegistrarUsuario" method="post" class="form-singin">
						<h2 class="form-singin-heading">Si ya tenes cuenta...</h2>
						<input type="text" name="email" class="form-control" placeholder="Email here"/>
						<input type="password" name="pass" class="form-control" placeholder="Password here"/>				
						<br>
						<input type="submit" value="Ingresar" class="btn btn-lg btn-primary btn-block">
					</form>
					<%
						//alert here
					%>
				</div>
			</div>
		</div>
	</div>
</body>
</html>