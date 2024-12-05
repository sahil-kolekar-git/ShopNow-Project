<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link rel="stylesheet" href="register.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.1/css/all.min.css"
	integrity="sha512-5Hs3dF2AEPkpNAR7UiOHba+lRSJNeM2ECkwxUIxC1Q/FLycGTbNapWXB4tP889k5T5Ju8fs4b1P5z/iB4nMfSQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<div>
		<article>
			<form action="register">
				<h3>Register</h3>
				<h6>${msg}</h6>
				<br /> <label for="name">Username</label><br /> <input type="text"
					name="uname" id="name" placeholder="Enter name" required /><br />
				<label for="email">Email</label><br /> <input type="email"
					name="uemail" id="email" placeholder="Enter email" required /><br />
				<label for="password">Password</label><br /> <input type="password"
					name="upassword" id="password" placeholder="Enter password"
					required /><br />
				<button type="submit" value="submit">Register</button>
			</form>
		</article>
	</div>
</body>
</html>
