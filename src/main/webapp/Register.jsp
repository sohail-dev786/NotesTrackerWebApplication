<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<%@include file="All_css_js.jsp"%>
</head>
<body>

<%@include file="Navbar.jsp" %>
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
%>>
<main>
  <div class="container offset-md-4">
        
          <div class="row">
                <form action="UserRegister"  method="post"  class="text-center border border-light p-5">
        			<div>
                <!--  	<span class="fa fa-user-plus  fa-3x fa-spin "></span> -->
								
                	  <p class="h4 mb-3 signup">Sign up</p>
        			</div>
                  <div class="form-row mb-4">
                    
                    <div class="col">
                      <input type="text" id="fname" class="form-control" placeholder="First Name" name="fname" >
                    </div>
  
                    <div class="col">
                      <input type="text" id="lname" class="form-control" placeholder="Last Name" name="lname">
                    </div>
                  </div>
        
        
                  <!-- E-mail -->
                 
                  <input type="email" id="uemail" class="form-control mb-4" placeholder="E-mail" name="uemail">
           
                  <!-- Password -->
           
                  <input type="password" id="upassword" class="form-control mb-3" placeholder="Password" aria-describedby="defaultRegisterFormPasswordHelpBlock" name="upassword">
        
                  <!-- Sign up button -->
                
                  <button class="btn btn-primary my-4 btn-block waves-effect waves-light" type="submit">Sign in</button>


					<div class="container create text-center">
						<p class="text-center class="font-weight-bold">
							<a href="Login.jsp">Existing User ! Login Here</a>
						</p>
					</div>

				</form>     
            </div>
                     
            </div>
          
 </main>          
            

</body>
</html>