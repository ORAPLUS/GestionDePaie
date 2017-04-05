<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="s" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Liste des banques</title>

<!-- Bootstrap Core CSS -->
<link
	href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="<%=request.getContextPath()%>/resources/css/sb-admin.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="<%=request.getContextPath()%>/resources/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-ex1-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.html">Adhesium Technologies</a>
			</div>
			<!-- Top Menu Items -->
			<ul class="nav navbar-right top-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-envelope"></i> <b
						class="caret"></b></a>
					<ul class="dropdown-menu message-dropdown">
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>YOUB AYOUB</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>YOUB AYOUB</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-preview"><a href="#">
								<div class="media">
									<span class="pull-left"> <img class="media-object"
										src="http://placehold.it/50x50" alt="">
									</span>
									<div class="media-body">
										<h5 class="media-heading">
											<strong>YOUB AYOUB</strong>
										</h5>
										<p class="small text-muted">
											<i class="fa fa-clock-o"></i> Yesterday at 4:32 PM
										</p>
										<p>Lorem ipsum dolor sit amet, consectetur...</p>
									</div>
								</div>
						</a></li>
						<li class="message-footer"><a href="#">Read All New
								Messages</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-bell"></i> <b
						class="caret"></b></a>
					<ul class="dropdown-menu alert-dropdown">
						<li><a href="#">Alert Name <span
								class="label label-default">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-primary">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-success">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span class="label label-info">Alert
									Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-warning">Alert Badge</span></a></li>
						<li><a href="#">Alert Name <span
								class="label label-danger">Alert Badge</span></a></li>
						<li class="divider"></li>
						<li><a href="#">View All</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown"><i class="fa fa-user"></i> <s:authorize access="isAuthenticated()">
					<s:authentication property="principal.username"/>
					</s:authorize> <b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
						</li>
						<li><a href="#"><i class="fa fa-fw fa-envelope"></i>
								Inbox</a></li>
						<li><a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="<c:url value="/logout" />"><i class="fa fa-fw fa-power-off"></i> Log
								Out</a></li>
					</ul></li>
			</ul>
			<!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
			<div class="collapse navbar-collapse navbar-ex1-collapse">
				<ul class="nav navbar-nav side-nav">
					<li><a href="index.html"><i class="fa fa-fw fa-dashboard"></i>
							Accueil</a></li>
					<li><a href="charts.html"><i
							class="fa fa-fw fa-bar-chart-o"></i>Gestion des Utilisateurs</a></li>
					<li class="active"><a href="tables.html"><i
							class="fa fa-fw fa-table"></i> Gestion des Banques</a></li>
					<li><a href="forms.html"><i class="fa fa-fw fa-edit"></i>Gestion
							des Conges</a></li>
					<li><a href="bootstrap-elements.html"><i
							class="fa fa-fw fa-desktop"></i> Gestion des Societes</a></li>
					<li><a href="bootstrap-grid.html"><i
							class="fa fa-fw fa-wrench"></i> Gestion des Contrats</a></li>
					<li><a href="javascript:;" data-toggle="collapse"
						data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i>
							Gestion des Papiers <i class="fa fa-fw fa-caret-down"></i></a>
						<ul id="demo" class="collapse">
							<li><a href="#">Bulletin de Paie</a></li>
							<li><a href="#">Cimr</a></li>
						</ul></li>
					<li><a href="blank-page.html"><i class="fa fa-fw fa-file"></i>
							Gestion des Roles</a></li>
					<li><a href="index-rtl.html"><i
							class="fa fa-fw fa-dashboard"></i> Gestion des Professions</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>

		<div id="page-wrapper">

			<div class="container-fluid">

				<div class="row">
					<div class="col-lg-6">
						<h2>Ajouter une Banque</h2>
						<f:form action="AjouterBanque" method="POST"
							modelAttribute="banque">
							<div class="form-group">
								<label>NOM : </label>
								<f:input path="nom" cssClass="form-control" type="text" />
								<span><f:errors path="nom" cssClass="errors" /></span>
							</div>
							<div class="form-group">
								<label>ADRESSE : </label>
								<f:textarea path="adresse" cssClass="form-control" rows="3"></f:textarea>
								<span><f:errors path="adresse" cssClass="errors" /></span>
							</div>
							<div class="form-group">
								<label>TELEPHONE : </label>
								<f:input path="tel" cssClass="form-control" type="text" />
								<span><f:errors path="tel" cssClass="errors" /></span>
							</div>
							<div class="form-group">
								<label>FAX : </label>
								<f:input path="fax" cssClass="form-control" type="text" />
								<span><f:errors path="fax" cssClass="errors" /></span>
							</div>
							<button type="submit" class="btn btn-primary"><i class="glyphicon glyphicon-plus"></i>Enregistrer</button>
							<button type="reset" class="btn btn-default">Annuler
								Button</button>
						</f:form>
					</div>
				</div>
				<div class="row">
					<div class="col-lg-12">
						<h2>Liste des Banques</h2>
						<div class="table-responsive">
							<table class="table table-hover">
								<thead>
									<tr>
										<th>ID</th>
										<th>NOM</th>
										<th>ADRESSE</th>
										<th>FAX</th>
										<th>TELEPHONE</th>
										<th>Action I</th>
										<th>Action II</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${listeDesBanques}" var="bq">
										<tr>
											<td>${bq.id}</td>
											<td>${bq.nom}</td>
											<td>${bq.adresse}</td>
											<td>${bq.fax}</td>
											<td>${bq.tel}</td>
											<td><a href="SupprimerBanque?id=${bq.id}"><i
													class="glyphicon glyphicon-remove"></i></a></td>
											<td><a href="EditerBanque?id=${bq.id}"><i
													class="glyphicon glyphicon-edit"></i></a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
					</div>
				</div>
				<!-- /.row -->
			</div>
			<!-- /.container-fluid -->

		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="<%=request.getContextPath()%>/resources/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>

</body>

</html>
