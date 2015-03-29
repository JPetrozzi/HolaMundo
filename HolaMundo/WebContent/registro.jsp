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
		<form action="RegistrarUsuario" method="post" class="form-singin">
			<div class="row">
				<div class="col-md-4">&nbsp;</div>
				<div class="col-md-4">
					<h2 class="form-singin-heading">Bienvenido a HolaMundo</h2>
					<input type="email" name="email" class="form-control" placeholder="Email here"/>
					<input type="text" name="nombre" class="form-control" placeholder="Name here"/>
					<input type="password" name="pass1" class="form-control" placeholder="Password here"/>
					<input type="password" name="pass2" class="form-control" placeholder="Repeat Password Please"/>
					<br>
					<input type="submit" value="Finalizar Registro" class="btn btn-lg btn-primary btn-block">
				</div>
				<div class="col-md-4">&nbsp;</div>
			</div>
		</form>
	</div>
</body>
</html>