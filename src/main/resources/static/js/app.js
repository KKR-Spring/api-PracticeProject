$(document).ready(function(){
  $("#btn1").click(function(){
	  var users = {
	  "id": 1,
      "name": "kumarRanjan1",
      "dob": "2020-05-23T",
      "addressDetails": {
          "houseNumber": "H-55",
          "aadharNumber": 32345,
          "addressLine1": "Hebbala",
          "addressLine2": "Esteem mall",
          "landmark": "In Airport Road",
          "pin": 546609,
          "officeAddress": {
              "buildingNumber": 3,
              "addressLine1": "TCS",
              "addressLine2": "WhileField",
              "landMark": "Near Orbit Mall",
              "cardId": "TCS001",
              "pin": 75943764
          }
      }
	  }
	  alert(users);
	  $.ajax({url: "/users", success: function(users){
		  alert(6);
      alert(users.name);
    }});
  });
});