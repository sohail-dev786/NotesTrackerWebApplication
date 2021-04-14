<%
String session_username=(String)session.getAttribute("userEmail");
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
%>
<div class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom box-shadow">
    <h5 class="my-0 mr-md-auto font-weight-normal"><strong><a href="index.jsp">NoteTrackerApp</strong></a></h5>
      <nav class="my-2 my-md-0 mr-md-3">
      
         <a class="p-2 text-dark font-weight-bold" href="index.jsp">Home</a>
       	 <a class="p-2 text-dark font-weight-bold" href="About.jsp">About</a>
         <a class="p-2 text-dark font-weight-bold" href="Contact.jsp">Contact</a>
       
       
        <% if(session_username!=null ) { %>
        <a class="p-2 text-dark" href="AddNote.jsp">Add Notes</a>
        <a class="p-2 text-dark" href="ShowNotes.jsp">Show Notes</a>
        <% }  %>
      </nav>
      
      <% if(session_username==null)  {%>
      <a class="btn btn-outline-primary mr-2" href="Login.jsp">Login</a>
      <a class="btn btn-outline-primary mr-2" href="Register.jsp">Sign up</a>
      <% } %>
      
      <% if(session_username!=null)  {%>
      <a class="btn btn-warning font-weight-bold mr-2 wcf" > Welcome :<%= session.getAttribute("userEmail") %> </a>
	  <a class="btn btn-danger" href="Logout.jsp">Log out</a>
	  
	  <% } %>

</div>