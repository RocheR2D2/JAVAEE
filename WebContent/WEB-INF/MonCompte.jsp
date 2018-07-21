<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet hrefc="css/style.css">
	<title></title>
	<style>
		body, .panel-info {
			background-color: #0f80e2;
		}
		
		.panel-info:hover {
			background-color: #1f92f4;
		}
		
		.panel-default {
			background-color: #fff;
		}
		
		a, label {
			color: #fff;
		}
		
		a:hover {
			text-decoration: none;    
			color: #fff;
		}
		
		.footer {
			bottom: 0;
			position: fiexd;
		}
		
		.form-control {
		    border: 0;
		    box-shadow: none;
		    padding:10px;
		}
		
		button {
		    background: none;
		    color: #fff;
		    border: none;
		    padding: 0;
		    font: inherit;
		    cursor: pointer;
		    outline: inherit;
		}
				
		
		
	</style>
	</head>
	<body>
	<div class="Container-fluid" style="padding:20px;">
		<div class="row">
			<div class="col-xs-3">
				<div class="panel panel-info">
				    <div class="panel-body text-center"><a href="#"><b>Logo</b></a></div>
				  </div>
			</div>
			<div class="col-xs-9">
				<div class="panel panel-info">
				    <div class="panel-body text-center"><a href="#"><b>Publicité</b></a></div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-2 p1">
				<div class="panel panel-info">
				    <div class="panel-body text-center"><a href="homeServelet"><b>Acceuil</b></a></div>
				</div>
			</div>
			<div class="col-xs-2 p2">
				<div class="panel panel-info">
				    <div class="panel-body text-center"><a href="#"><b>Présentation</b></a></div>
				</div>
			</div>
			<div class="col-xs-2 p3">
				<div class="panel panel-info">
				    <div class="panel-body text-center"><a href="Inscription"><b>Inscription</b></a></div>
				</div>
			</div>
			<div class="col-xs-2 p4b">
				<div class="panel panel-info">
				    <div class="panel-body text-center"><a href="#"><b>Raccourcir</b></a></div>
				</div>
			</div>
			<div class="col-xs-2 p5">
				<div class="panel panel-info">
				    <div class="panel-body text-center"><a href="MonCompte"><b>Mon Compte</b></a></div>
				</div>
			</div>
			<div class="col-xs-2 p6">
				<div class="panel panel-info">
				    <div class="panel-body text-center"><a href="deconnexionServelet"><b>Déconnexion</b></a></div>
				</div>
			</div>
		</div>

	<div class="container text-center">
		
	</div>

	
<jsp:include page="footer.jsp" />
