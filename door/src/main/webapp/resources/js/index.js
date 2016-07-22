document.getElementsByTagName("body").innerHTML = "Hello this is awesome!!!";
	console.log("hello");
	$.ajax({url:"/door/rest/allDoors"}).done(function(data){
		console.log(data);
	});