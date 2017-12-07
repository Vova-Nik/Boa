<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <meta charset="UTF-8"></meta>
    <title>Show DB</title>
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.7-1/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/styles/vshowdb.css" />
</head>
<body>

${menu_bar}

<div class="container">
    <h2>Users</h2>
    <p>The .table-striped class adds zebra-stripes to a table:</p>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Lastname</th>
            <th>Pr</th>

            <th>Email</th>
           <%-- <th>Pwd</th>--%>
            <%--<th>Del</th>--%>
        </tr>
        </thead>

        <tbody>
<c:forEach var="customer" items="${customerList}">
        <tr>
            <td><p>${customer.id}</p></td>
            <td>${customer.title}</td>
            <td>${customer.surename}</td>
            <td>${customer.price}</td>

            <td>${customer.mail}</td>
           <%-- <td>${customer.password}</td>--%>
            <%--<td><input type="checkbox" name="${customer.id}" value="${customer.title}" form="form1"/></td>--%>
        </tr>
</c:forEach>
        </tbody>
    </table>
<%--    <div class="col-sm-2">
        <form action="delDBButton" id="form1" >
            <input type="submit" value="Submit" class="delBut">
        </form><br><br>
    </div>--%>
</div>


<br><br>
<jsp:include page="navbar.jsp" />
<script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
<script src="/webjars/bootstrap/3.3.7-1/js/bootstrap.min.js"></script>
<script src="/js/main.js"></script>

</body>
