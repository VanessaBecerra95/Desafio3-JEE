<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/@picocss/pico@2/css/pico.min.css" />
<title>Calculadora</title>
</head>
<body>
	<main class="container">
		<h1>Calculadora</h1>
		<div class="grid">
			<form name="formulario" action="CalculadoraServlet" method="post">
				<div class="field">
					<input type="text" name="numero1" placeholder="Número 1"
						aria-label="numero1" required />
				</div>
				<div class="field">
					<input type="text" name="numero2" placeholder="Número 2"
						aria-label="numero2" required />
				</div>
				<div class="field">
					<select name="operacion"
						aria-label="Seleccione la opción a realizar." required>
						<option selected disabled value="">Seleccione la opción a
							realizar.</option>
						<option value="suma">Suma</option>
						<option value="resta">Resta</option>
						<option value="multiplicacion">Multiplicación</option>
						<option value="division">División</option>
						<option value="ordenar">Ordenar</option>
						<option value="parimpar">Par e Impar</option>
					</select>
				</div>
				<div class="actions">
					<input type="submit" value="Calcular">
				</div>
			</form>
		</div>
	</main>
</body>
</html>