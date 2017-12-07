<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>--%>
<html lang="en">
<body>
	<div>
		<div>
			<h1>Another page</h1>
			<h3>Create form</h3>
			<form action="VCreateForm">
				First name:<br>
				<input type="text" name="title" value="Mickey" required>
				<br>
				Surename:<br>
				<input type="text" name="surename" value="Mouse" required>
				<br><br>
				e-mail:<br>
				<input type="email" name="mail">
				<br><br>
				Password:<br>
				<input type="text" name="password">
				<br><br>
				Price:<br>
				<input type="number" name="price" value="10">
				<br><br>
				<input type="submit" value="Submit">
			</form>
<div>${custexists}</h2></div>
			<br></br><br></br>
			<h3>Change form</h3>
			<form action="VChangeForm">
				Title:<br>
				<input type="text" name="title"></input>
				<br>
				<br><input type="number" name="Price"></input><br>
				<input type="submit" value="Change"></input>
			</form>
			<br><br>

			<button type="button"> <a href="VShowDB">Show DB there</a> </button>


			<ul>
			<c:if test="${customerList != null}">
					<c:forEach  var="customer" items="${customerList}">
						<li>${customer.id}&#160${customer.title}</li>
					</c:forEach>
			</c:if>
			</ul>



<br><br>
			Click on this <strong><a href="/index">link</a></strong> to visit previous page.

		</div>
	</div>
</body>
</html>
