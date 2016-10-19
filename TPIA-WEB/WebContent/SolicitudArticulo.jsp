<!-- SOLICITUD DE ARTICULO - ESTO LO HACE: DARO -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge"> -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="shortcut icon" href="assets/ico/favicon.ico">

    <title>IA - Grupo 12</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/font-awesome.min.css" rel="stylesheet">
    <script src="assets/js/modernizr.js"></script>
    
    
	<style>
	table {
	    font-family: arial, sans-serif;
	    border-collapse: collapse;
	    width: 100%;
	}
	
	td, th {
	    border: 1px solid #dddddd;
	    text-align: left;
	    padding: 8px;
	}
	
	tr:nth-child(even) {
	    background-color: #dddddd;
	}
	</style>
    
</head>



<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	$(document).on("change", "#estadoSol", function() {
		var estado = document.getElementById('estadoSol').value;
		$.get("Ventana2Servlet", {opcion: estado}, function(responseText) {
			var obtenido = responseText;
			//Trabajar obtenido hasta conseguir poner todo en la tabla
			
		});
	});
</script>



<body>
	<!-- Fixed navbar -->
    <div class="navbar navbar-default navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="index.jsp">Grupo 12 - Deposito</a>
        </div>
        <div class="navbar-collapse collapse navbar-right">
          <ul class="nav navbar-nav">
          	<li><a href="SolicitudArticulo.jsp">SOLICITUD DE ARTICULO </a></li>
            <li class="active"><a href="index.jsp">MENU PRINCIPAL</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    
    <div id="headerwrap">
	    <div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
			    	<!--<h1>SOLICITUD DE ARTICULO - ESTO LO HACE: DARO</h1>-->
			    	<!--<h5>ACA HACE TU MAGIA </h5>-->
			    	
			    	<table>
				 		<tr>
					 		<td>
					 			Seleccione estado Solicitud de Articulo:   
						 		<select id="estadoSol" name="estadoSol">
									<option value="seleccione">Seleccione...</option>
									<option value="cumplidas">Cumplidas</option>
									<option value="pendientes">Pendientes</option>
								</select>
							</td>
						</tr>
					</table>
					<table>
				 		<tr>
				 			<td>Codigo</td>
				 			<td>Nombre</td>
				 			<td>Tipo</td>
				 			<td>Cantidad</td>
				 			<td>Fecha</td>
				 		</tr>
				 	</table>
				 	
				 	
				 	
				 </div><!-- col -lg-8 -->
    		</div><!-- /row -->
	    </div> <!-- /container -->
	</div><!-- /headerwrap -->
</body>
</html>