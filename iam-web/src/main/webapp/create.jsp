<html>
<head>
<link xmlns="http://www.w3.org/1999/xhtml" rel="stylesheet"
	href="css/bootstrap.min.css" />
</head>

<body>
    <h1>Identity Creation</h1>
    <a href="welcome.jsp">&lt;&lt; back</a>
	<div class="container">
		<div xmlns="http://www.w3.org/1999/xhtml" class="bs-example">
			<form role="form" method="post" action="IdAction">
				<div class="form-group">
					<label for="displayName">Display Name</label> 
					<input name="displayName" type="text" class="form-control" id="displayName"
						placeholder="Enter Display Name" />
				</div>
				<div class="form-group">
					<label for="email">Email</label> 
					<input name="email" type="text" class="form-control" id="email"
						placeholder="Enter email" />
				</div>
				<div class="form-group">
					<label for="uid">UID</label> 
					<input name="uid" type="text" class="form-control" id="uid"
						placeholder="Enter Uid" />
				</div>
				<div class="form-group">
					<label for="birthDate">BirthDate</label> 
					<input name="birthDate" type="date" class="form-control" id="birthDate"
						placeholder="Enter Birthdate" />
				</div>
				<div class="form-group">
					<label for="username">Username</label> 
					<input name="username" type="text" class="form-control" id="username"
						placeholder="Enter Username" />
				</div>
				<div class="form-group">
					<label for="password">Password</label> 
					<input name="password" type="text" class="form-control" id="password"
						placeholder="Enter Password" />
				</div>
				

				<button type="submit" class="btn btn-default">Save</button>
			</form>
		</div>
	</div>
</body>
</html>
