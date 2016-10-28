<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/bootstrap.min.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/sb-admin.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/jquery.dataTables_themeroller.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/dataTables.tableTools.min.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/css/jquery.dataTables.min.css"/>" />
<link rel="stylesheet" type="text/css"
	href="<c:url value="/static/resources/font-awesome/css/font-awesome.css"/>" />

<script type="text/javascript"
	src="<c:url value="/static/resources/js/jquery-1.11.1.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/static/resources/js/jquery.dataTables.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/static/resources/js/dataTables.tableTools.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/static/resources/js/dataTables.bootstrap.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/static/resources/js/bootstrap.min.js" />"></script>
<script type="text/javascript"
	src="<c:url value="/static/resources/js/sb-admin.js" />"></script>

<script type="text/javascript">
	$(document).ready(
			function() {
				$("#articulos").DataTable();

				$("#newArticuloSaveBtn").on(
						"click",
						function() {
							$.post("register-new-articulo", $(
									"#newArticuloForm").serialize(),
									function() {
										$("#newArticulo").modal('hide').on(
												'hidden.bs.modal',
												function(e) {
													$("#newArticuloForm")
															.trigger("reset");
													location.reload();
												});
									});

						});
			});
</script>
</head>

<body>
	<!-- Modal -->
	<div class="modal fade" id="newArticulo" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Cerrar</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Nuevo articulo</h4>
				</div>
				<div class="modal-body" id="newArticuloBody">
					<form class="form-horizontal" role="form" id="newArticuloForm">
						<div class="form-group">
							<label for="newArticuloCodigo" class="col-sm-2 control-label">Codigo</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloCodigo"
									name="newArticuloCodigo" placeholder="Codigo de articulo" />
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloNombre" class="col-sm-2 control-label">Nombre</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloNombre"
									name="newArticuloNombre" placeholder="Nombre del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloDescripcion"
								class="col-sm-2 control-label">Descripción</label>
							<div class="col-sm-10">
								<input type="text" class="form-control"
									id="newArticuloDescripcion" name="newArticuloDescripcion"
									placeholder="Descripcion del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloMarca" class="col-sm-2 control-label">Marca</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloMarca"
									name="newArticuloMarca" placeholder="Marca del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloOrigen" class="col-sm-2 control-label">Origen</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloOrigen"
									name="newArticuloOrigen" placeholder="Origen del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloPrecio" class="col-sm-2 control-label">Precio</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloPrecio"
									name="newArticuloPrecio" placeholder="Precio del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloTipo" class="col-sm-2 control-label">Tipo</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloTipo"
									name="newArticuloTipo" placeholder="Tipo del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloFecha" class="col-sm-2 control-label">Fecha</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloFecha"
									name="newArticuloFecha" placeholder="Fecha del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloFotoURL" class="col-sm-2 control-label">URL
								Foto</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloFotoURL"
									name="newArticuloFotoURL" placeholder="URL de la Foto">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloEdadRecomendada"
								class="col-sm-2 control-label">Edad recomendada</label>
							<div class="col-sm-10">
								<input type="text" class="form-control"
									id="newArticuloEdadRecomendada"
									name="newArticuloEdadRecomendada"
									placeholder="Edad recomendada del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloFichaTecnica"
								class="col-sm-2 control-label">Ficha Técnica</label>
							<div class="col-sm-10">
								<input type="text" class="form-control"
									id="newArticuloFichaTecnica" name="newArticuloFichaTecnica"
									placeholder="Ficha Técnica del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloTalle" class="col-sm-2 control-label">Talle</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloTalle"
									name="newArticuloTalle" placeholder="Talle del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloMaterial" class="col-sm-2 control-label">Material</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" id="newArticuloMaterial"
									name="newArticuloMaterial" placeholder="Material del articulo">
							</div>
						</div>
						<div class="form-group">
							<label for="newArticuloCantidadDisponible"
								class="col-sm-2 control-label">Cantidad</label>
							<div class="col-sm-10">
								<input type="text" class="form-control"
									id="newArticuloCantidadDisponible"
									name="newArticuloCantidadDisponible"
									placeholder="Cantidad del articulo">
							</div>
						</div>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
					<button type="button" class="btn btn-primary"
						id="newArticuloSaveBtn">Guardar</button>
				</div>
			</div>
		</div>
	</div>

	<div id="wrapper">

		<nav class="navbar navbar-default navbar-fixed-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".sidebar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="deposito-web/">Deposito</a>
			</div>
			<!-- /.navbar-header -->


			<div class="navbar-default navbar-static-side" role="navigation">
				<div class="sidebar-collapse">
					<ul class="nav" id="side-menu">
						<li><a href="/deposito-web"><i class="fa fa-dashboard fa-fw"></i>
								Home</a></li>
						<li><a href="/deposito-web/articulo/list"><i
								class="fa fa-table fa-fw"></i> Articulos</a></li>
						<li><a href="/deposito-web/solicitud-articulos/list"><i
								class="fa fa-edit fa-fw"></i> Solicitudes de articulos</a></li>
						<li><a href="/deposito-web/solicitud-compra/list"><i
								class="fa fa-edit fa-fw"></i> Solicitudes de compra</a></li>
						<li><a href="/deposito-web/fabrica/list"><i
								class="fa fa-edit fa-fw"></i> Interfaz Fabrica</a></li>
						<li><a href="/deposito-web/configuration/list"><i
								class="fa fa-edit fa-fw"></i> Configuraciones</a></li>					</ul>
					<!-- /#side-menu -->
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">Articulos</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<div class="row">
				<div class="col-lg-12">
					<button class="btn btn-primary" type="button" data-toggle="modal"
						data-target="#newArticulo">Crear articulo</button>
				</div>
				<hr />
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<!-- CONTENIDO -->
			<div class="row">
				<table id="articulos" class="display	">
					<thead>
						<tr>
							<th>Codigo</th>
							<th>Nombre</th>
							<th>Marca</th>
							<th>Precio</th>
							<th>Tipo</th>
							<th>Disponible</th>
							<th>Acciones</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${articulos}" var="element">
							<tr>
								<td>${element.codigo}</td>
								<td>${element.nombre}</td>
								<td>${element.marca}</td>
								<td>$${element.precio}</td>
								<td>${element.tipo}</td>
								<td>${element.cantidadDisponible}</td>
								<td>
									<button type="button" class="btn btn-primary">Editar</button>
								</td>

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<!-- /.row -->
			<!-- /CONTENIDO -->

		</div>
		<!-- /#page-wrapper -->
	</div>
	<!-- /#wrapper -->

</body>
</html>
