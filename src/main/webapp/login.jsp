<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Document</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.1/css/all.min.css"
	integrity="sha512-5Hs3dF2AEPkpNAR7UiOHba+lRSJNeM2ECkwxUIxC1Q/FLycGTbNapWXB4tP889k5T5Ju8fs4b1P5z/iB4nMfSQ=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
<link rel="stylesheet" href="login.css" />
</head>
<body>
	<nav>
		<h2>ShopNow</h2>
		<h4>Home</h4>
		<h4>Products</h4>
		<h4>Themes</h4>
		<h4>Premium Themes</h4>
		<h4>Support</h4>
		<h4>Blog</h4>
		<h4>Account</h4>
		<h4>
			<i class="fa-solid fa-magnifying-glass"></i>
		</h4>
	</nav>
	<div>
		<article>
			<form action="login">
				<h3>Login</h3>
				<h6>${msg}</h6>
				<br /> <label for="email">Email</label><br /> <input type="email"
					name="uemail" id="email" required /><br /> <label for="password">Password</label><br />

				<input type="password" name="upassword" id="password" required /><br />
				<button type="submit" value="submit">Login</button>
				<br />
				<h2>
					Not registred ? <a target="_blank" href="register.jsp">Register
						Here</a>
				</h2>
			</form>
		</article>
	</div>
</body>
</html>
