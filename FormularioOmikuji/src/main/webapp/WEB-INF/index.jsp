<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Omikuji</title>
		<link rel="stylesheet" href="/css/index.css" />
	</head>
	<body>
		<h1>
			Here's Your Omikuji!
		</h1>
		<div class="texto">
			<div class="parrafo">
			In <c:out value="${numero}"/> years, will live in <c:out value="${ciudad}"/> with <c:out value="${persona}"/>
			as your roommate, <c:out value="${hobby}"/>.The next time you see a <c:out value="${servivo}"/>,you will have
			good luck. Also, <c:out value="${descripcion}"/>.  
			</div> 
		</div>
		<div class="botton">
			<form action="/logout" method="GET">
				<button type="submit">
					<strong>Go back</strong>
				</button>
				
			</form>
		</div>
	
	</body>
</html>