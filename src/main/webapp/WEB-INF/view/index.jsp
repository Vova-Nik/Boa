<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>


<head>
	<meta charset="UTF-8"></meta>
	<title>Index</title>
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
	<link rel="stylesheet" href="/styles/vshowdb.css" />
</head>

<spring:form></spring:form>

<body>
${menu_bar}

		<div class="vindex">
			<h2>Hello, &#160 ${message}!</h2>
			<h3> Once upon a time</h3>
			<h3> Twice upon a time</h3>
		</div>


<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<script src="/js/main.js"></script>
${footer}
</body>
</html>
