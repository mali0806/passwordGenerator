<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Random Password Generator</title>
</head>
<body>
	<form method="get" action="PasswordGenerator">
		<table>
			<tr>
				<td>Please Enter Max Password length: <input type="text"
					name="maxlen">
				</td>

			</tr>
			<tr>
				<td>Please Enter "Y" for Special Characters: <input type="text"
					name="splchar">
				</td>

			</tr>
			<tr>
				<td>Please Click Below Button To Generate Random Password.</td>
				<td></td>
			</tr>

			<tr>
				<td><input type="submit" value="Generate Password"></td>
				<td></td>
			</tr>

		</table>
	</form>
</body>
</html>