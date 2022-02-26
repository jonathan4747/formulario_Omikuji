<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Omikuji</title>
		<link rel="stylesheet" href="/css/login.css" />
	</head>
	<body>
			<h1>
				Send a Omikuji
			</h1>
			<div class="formulario">
				<form method="POST" action="/login">
					<div>
						  <label for="numero">
						  		Pick any number from 5 to 25
						  </label>
						  <input type="number" id="numero" name="numero" min="5" max="10" />
					</div>
					<div>
						  <label for="ciudad">
						  		Enter the name of any city
						  </label>
						  <input type="text" id="ciudad" name="ciudad" />
					</div>
					<div>
						  <label for="persona">
						  		Enter the name of any real person
						  </label>
						  <input type="text" id="persona" name="persona" />
					</div>
					<div>
						  <label for="hobby">
						  		Enter professional endeavor or hobby
						  </label>
						  <input type="text" id="hobby" name="hobby" />
					</div>
					<div>
						  <label for="servivo">
						  		Enter any type of living thing
						  </label>
						  <input type="text" id="servivo" name="servivo" />
					</div>
					<div>
						  <label for="descripcion">
						  		Say something  nice to someone  
						  </label>
						  <textarea id="descripcion" name="descripcion" ></textarea>
					</div>
					<div>
						Send and Show a friend
					</div>
					<div class="boton">
						<button type="submit">
								<strong>send</strong> 
						</button>
					</div>			
				</form>
			</div>
	</body>
</html>