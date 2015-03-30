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
				<div class="col-md-12">
					&nbsp;
				</div>
			</div>
			<div class="row">
				<div class="col-md-3">&nbsp;</div>
				<div class="col-md-6">
					<h2 class="form-singin-heading text-center">Bienvenido a HolaMundo</h2>
					<input type="text" name="email" class="form-control" placeholder="Email here"/>
					<input type="text" name="nombre" class="form-control" placeholder="Name here"/>
					<input type="password" name="pass" class="form-control" placeholder="Password here"/>
					<input type="password" name="pass2" class="form-control" placeholder="Repeat Password Please"/>
					<br>
					<%
						if(request.getParameter("error") != null)
						{
							%>
								<div class="alert alert-danger">
									<p><span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span> El Email ingresado ya se encuentra en uso.</p>
								</div>
							<%
						}
					%>
					<div class="row">
						<div class="col-md-6">
							<input type="submit" value="Finalizar Registro" class="btn btn-lg btn-primary btn-block">
						</div>
						<div class="col-md-6">
							<a href="index.jsp" class="btn btn-lg btn-danger btn-block">Volver</a>
						</div>				
					</div>
				</div>
				<div class="col-md-3">&nbsp;</div>
			</div>
		</form>
	</div>
</body>
</html>