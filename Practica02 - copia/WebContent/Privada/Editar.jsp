<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Actualizar Telefono</title>

<style type="text/css">
.boton_personalizado {
	text-decoration: none;
	padding: 10px;
	font-weight: 600;
	font-size: 20px;
	color: #ffffff;
	background-color: #1883ba;
	border-radius: 6px;
	border: 2px solid #0016b0;
}
</style>
<link rel="stylesheet" href="/Practica_1/Estilos/EstiloRegistro.css" />
</head>
<body>
	<h1>Actualizar Telefono</h1>

	<form action="/Practica_1/ControlaTelefono?action=Editar" method="post">
		<table border="0" align="center">

			<div align="center">
				<img src="/Practica_1/Imagenes/call-center.png" width="80"
					height="80" />
			<tr>
				<td><label>Codigo</label></td>
				<td><input type="text" name="codigom" required
					value="<c:out value="${telefono.codigo}"></c:out>"></td>
			</tr>
			<tr>
				<td><label>Numero</label></td>
				<td><input type="text" name="numero" required
					value='<c:out value="${telefono.numero}"></c:out>'></td>
			</tr>
			<tr>
				<td><label>Tipo</label></td>
				<td><input type="text" name="tipo" required
					value='<c:out value="${telefono.tipo}"></c:out>'></td>
			</tr>
			<tr>
				<td><label>Operadora</label></td>
				<td><input type="text" name="operadora" required
					value='<c:out value="${telefono.operadora}"></c:out>'></td>
			</tr>
			</div>
		</table>

		<table border="0" align="center">
			<tr>
				<td>
					<button class="boton_personalizado" id="IngresoLog" type="submit">GuardarCambios</button>
				</td>
			</tr>
		</table>
		<table border="0" align="center">
			<tr>
				<td><a href='/Practica_1/Privada/Privada.html'>Volver al
						Inicio</a></td>
			</tr>


		</table>
	</form>


</body>
</html>