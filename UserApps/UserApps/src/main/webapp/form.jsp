<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<form action="connect" modelAttribute="user">
		<table align="left"
			style="border: 1px solid black; margin-left: 200px; margin-top: 30px;">
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><b>Login Registration Form</b></td>
			<tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<td>&nbsp;&nbsp;User Name:</td>
			<tr><td><input type="text" name="uname" value="" /></td>
			
			<tr>
				<td>&nbsp;&nbsp;Email:</td>
				<td><input type="text" name="email" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;Password:</td>
				<td><input type="password" name="pass" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;Confirm Password:</td>
				<td><input type="password" name="conpass" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;Phn No:</td>
				<td><input type="number" name="phn" value="" /></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;Gender</td>
				<td><input type="radio" name="gender" value="Male" />Male
					&nbsp;&nbsp; <input type="radio" name="gender" value="Female" />Female
					&nbsp;&nbsp; <input type="radio" name="gender" value="Transgender" />Transgender
					&nbsp;&nbsp;</td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;Address:</td>
				<td><textarea name=address id=address rows="4" cols="14"></textarea></td>
			</tr>
			<tr>
				<td>&nbsp;&nbsp;Country:</td>
				<td><select name="country" id="country">
						<option value=""></option>
						<option value="INDIA">INDIA</option>
						<option value="SRILANKA">SRILANKA</option>
						<option value="PAKISTAN">PAKISTAN</option>
						<option value="BANGALADESH">BANGALADESH</option>
				</select></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><input type="Submit" value="Submit" />&nbsp;
					&nbsp;<input type="Submit" value="Reset" /></td>
			</tr>
		</table>
	</form>
</body>
</html>