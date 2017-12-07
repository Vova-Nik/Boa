<%--
  Created by IntelliJ IDEA.
  User: Vova
  Date: 02-Dec-17
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/styles/vshowdb.css" />
</head>


<body>
${menu_bar}

<div class="proc80"><h3>${message}</h3></div>

<div class="proc80">
    <form class="form-horizontal" action="VLoginForm">



        <div class="form-group">
            <label class="control-label col-sm-2" for="email">Email:</label>
            <div class="col-sm-10">
                <input type="email" class="form-control" id="email" name="mail" placeholder="Enter email">
            </div>
        </div>

        <div class="form-group">
            <label class="control-label col-sm-2" for="pwd">Password:</label>
            <div class="col-sm-10">
                <input type="password" class="form-control" id="pwd"name="password" placeholder="Enter password">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
 <%--               <div class="checkbox">
                    <label><input type="checkbox"> Remember me</label>
                </div>--%>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</div>



<div>${LoginError}</h2></div>
<br></br><br></br>
<jsp:include page="navbar.jsp" />
<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<script src="/js/main.js"></script>
</body>
</html>
