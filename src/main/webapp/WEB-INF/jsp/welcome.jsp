<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="/js/app.js"></script>
</head>
<body>

<h2>Enter User details to register in this application</h2>
<div id="div1"></div>
<form accept-charset="ISO-8859-1", action="users" method="post">

<label for="name">Enter Dummy Id:</label><br>
  <input type="text" id="id" name="id" value=""><br>
  
  <label for="name">Enter Candidate Name:</label><br>
  <input type="text" id="name" name="name" value=""><br>
  
  <label for="dob">Enter Date of Birth: </label><br>
  <input type="text" id="dob" name="dob" value=""><br><br>
  
  <h2>Enter Home Address details:</h2>
  
  <label for="houseNumber">House Number:</label><br>
  <input type="text" id="addressDetails.houseNumber" name="houseNumber" value=""><br>
  
  <label for="aadharNumber">Aadhar Id:</label><br>
  <input type="text" id="addressDetails.aadharNumber" name="aadharNumber" value=""><br><br>
  
  <label for="addressLine1">Address 1:</label><br>
  <input type="text" id="addressDetails.addressLine1" name="addressLine1" value=""><br>
  
  <label for="addressLine2">Address 2:</label><br>
  <input type="text" id="addressDetails.addressLine2" name="addressLine2" value=""><br>
  
  <label for="landmark">Nearest Landmark:</label><br>
  <input type="text" id="addressDetails.landmark" name="landmark" value=""><br>
  
  <label for="pin">Pin Code:</label><br>
  <input type="text" id="addressDetails.pin" name="pin" value=""><br>
  
  <h2>Enter Office Address details:</h2>
  
  <label for="houseNumber">Building Number:</label><br>
  <input type="text" id="buildingNumber" name="buildingNumber" value=""><br>
  
  <label for="addressLine1">Address 1:</label><br>
  <input type="text" id="addressLine1" name="addressLine1" value=""><br>
  
  <label for="addressLine2">Address 2:</label><br>
  <input type="text" id="addressLine2" name="addressLine2" value=""><br>
  
  <label for="landmark">Landmark Landmark:</label><br>
  <input type="text" id="landmark" name="landmark" value=""><br>
  
  <label for="card Id">Employee Id:</label><br>
  <input type="text" id="cardId" name="cardId" value=""><br>
  
  <label for="pin">Pin Code:</label><br>
  <input type="text" id="pin" name="pin" value=""><br>
  
  <input type="submit" value="Submit">
  
</form> 
</body>
</html>
