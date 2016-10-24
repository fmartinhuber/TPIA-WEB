<!-- SOLICITUD DE COMPRA - ESTO LO HACE: MARTIN -->

<%@page import="controler.DepositoControlador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="controler.DepositoControlador" %>
<%@ page import="bean.SolicitudArticuloBean" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
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
  </head>
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
          	<li><a href="SolicitudCompra.jsp">SOLICITUD DE COMPRA </a></li>
            <li class="active"><a href="index.jsp">MENU PRINCIPAL</a></li>
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    
    <form action="SolicitudCompraServlet" method="POST">
    <div id="headerwrap">
	    <div class="container">
			<div class="row">
				<div class="col-lg-8 col-lg-offset-2">
			    	<h1>SOLICITUD DE COMPRA</h1>
			    	
			    	<% List <SolicitudArticuloBean> listado = DepositoControlador.getInstancia().obtenerArticuloSolicitadoPendiente(); %>
			    	<table>
			    		<% for(int i = 0;i<listado.size();i++){
			    			SolicitudArticuloBean solicitud = listado.get(i);
						%>	
			    		<tr><td>Solicitud Nro: <%  solicitud.getIdSolArticulo(); %></td>
			    			<td>Nombre: <% solicitud.getDetalle(); %> <input type="checkbox" name="metodo" id="metodo" ></td>
			    		</tr>
			    		<% } %>
			    	</table>
			    	
    		</div><!-- /row -->
	    </div> <!-- /container -->
	</div><!-- /headerwrap -->
    </div>
    </form>
    
</body>
</html>