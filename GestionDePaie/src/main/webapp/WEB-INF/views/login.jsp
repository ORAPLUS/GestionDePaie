<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
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

<!-- Custom Login CSS -->
<link href="<%=request.getContextPath()%>/resources/css/login.css"
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

		<div id="page-wrapper">

			<div class="container-fluid">
				<div class="container">
					<div class="login-container">
						<div id="output"></div>
						<div class="avatar"></div>

						<div class="form-box">
							<form action="j_spring_security_check" method="post">
								<input type="hidden" name="${_csrf.parameterName}"
									value="${_csrf.token}" /> <input name="username" type="text"
									placeholder="Votre Pseudo" /> <input name="password"
									type="password" placeholder="Votre Mot de Passe" />
								<button class="btn btn-info btn-block login" type="submit">
									<i class="glyphicon glyphicon-log-in"></i> Login
								</button>
							</form>
						</div>
					</div>
				</div>
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
