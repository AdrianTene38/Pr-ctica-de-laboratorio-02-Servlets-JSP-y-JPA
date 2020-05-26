<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>REGISTRARSE	</title>
<link rel="stylesheet" href="/Practica_1/Estilos/EstiloRegistro.css" />
</head>
<body>
	<h1>Registra tu telefono</h1>
	<form action="/Practica02/ControlaTelefono" method="post">
		<table border="1" align="center">
		<tr>
			<td>Codigo:</a></td>		
			<td><input type="text" name="codigo"required /></td>	
			
		</tr>
		<tr>
			<td>Numero:</a></td>		
			<td><input type="text" name="numero"required/></td>	
		</tr>
		<tr>
			<td>Tipo:</a></td>		
			<td><input type="text" name="tipo"required/></td>	
		</tr>
		<tr>
			<td>Operadora:</a></td>		
			<td><input type="text" name="operadora"required/></td>	
		</tr>
		
	</table>
	<br>
	<table border="0" align="center">
		<tr>
		<td><input type="submit" value="Agregar" name="agregatelefono"></td>	
		
		</tr>
	
	</form>
</body>
</html>