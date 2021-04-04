<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<%@include file="All_css_js.jsp"%>
</head>
<body>

	<%@include file="Navbar.jsp"%>
<%

response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
%>
	<main>
		<div class="container offset-md-4">

			<div class="row">

				<form action="loginCheck" method="post" class="text-center border border-light p-5">
					<div>
						<p class="h4 mb-3 signup">Login Form</p>
						<hr class="font-weight-bold">
					</div>
					<div class="form-row mb-4">
                    
						<div class="col">
						<label class="mr-4 font-weight-bold">User Email</label>
						<input type="email" id="email"
							class="form-control mb-4" placeholder="E-mail" name="uemail" autocomplete="on">
						</div>
						
						<div class="col">
						<label class="mr-4 font-weight-bold">User Password</label>
						<input type="password" id="upass"
							class="form-control mb-3" placeholder="Password"
							aria-describedby="defaultRegisterFormPasswordHelpBlock"
							name="upass">
						</div>
						</div>

						<button
							class="btn btn-primary my-4 btn-block waves-effect waves-light font-weight-bold"
							type="submit">Login</button>
							

						<div class="container create text-center">
							<p class="text-center">
								<a href="Register.jsp">Create an Account</a>
							</p>
						</div>
						
				</form>

			</div>

		</div>

	</main>


</body>
</html>