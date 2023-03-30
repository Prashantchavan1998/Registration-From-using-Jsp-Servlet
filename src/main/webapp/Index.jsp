<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>

</head>
<body>
<div>
<h1>Registration Page</h1>
<form action="Reg" method="post">

FisrtName:<input type="text" name="fname"><br><br>
LastName:<input type="text" name="lname"><br><br>
Address:<input type="text" name="address"><br><br>
Pincode:<input type="text" name="pincode"><br><br>
<label for="City" name="city">Select the city:</label>

<select name="city">
  <option value="Pune">Pune</option>
  <option value="Mumbai">Mumbai</option>
  <option value="Nashik">Nashik</option>
  <option value="Sangamner">Sangamner</option>
</select><br><br>
<label for="state" name="state">Select the State:</label>

<select name="state">
  <option value="Maharashtra">Maharashtra</option>
</select><br><br>
<label for="education" name="education">Select the Education:</label>

<select name="education">
  <option value="BE">BE</option>
  <option value="BSC">BSC</option>
  <option value="BCA">BCA</option>
  <option value="BCS">BCS</option>
</select><br><br>
Gender:<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Female">Female
<input type="radio" name="gender" value="Others">Others
<br><br>
<label for="Passing year" name="passing"> Select the passing Year</label>
<select name="passing">
<option value="2022" name="passing">2022</option>
<option value="2021" name="passing">2021</option>
<option value="2020" name="passing">2020</option>
</select><br><br>
Percentage:<input type="number" name="percentage"><br><br>
<label for="nationality" name="nationality">select the nationality</label>

<select name="nationality">
<option>Indian</option>
<option>Nepal</option>
<option>Other</option>
</select><br><br>
Age: <input type="number" name="age"><br><br>
Mobile Number:+91-<input type="text" name="number"><br><br>
Email: <input type="text" name="email"><br><br>
UserName: <input type="text" name="username"><br><br>
Password: <input type="Password" name="password"><br><br>
<input type="submit">
</form>
</div>
</body>
</html>