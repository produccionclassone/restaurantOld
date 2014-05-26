var menuBehaviour = function(e){
		e.preventDefault();
		console.log(e.which + ": " +
		String.fromCharCode(e.which));
		var currentOption=$('#activemenu').attr('name');
		console.log(currentOption);
		if((String.fromCharCode(e.which)==1)&&(currentOption=="menu")){
			$("#button1txt").text("${message:opcion11}");
			$("#button2txt").text("${message:opcion12}");
			$("#button3txt").text("${message:opcion13}");
			$("#button4txt").text("${message:opcion14}");
			$("#button5txt").text("${message:opcion15}");
			$("#button6txt").text("${message:opcion16}");
			$("#button7txt").text("${message:opcion17}");
			$("#button8txt").text("${message:opcion18}");
			$("#button9txt").text("${message:opcion19}");
			$("#buttonAtxt").text("");
			$("#buttonBtxt").text("");
			$("#buttonCtxt").text("");
			$("#buttonDtxt").text("");
			$("#buttonEtxt").text("");
			$("#buttonFtxt").text("");
			$("#buttonGtxt").text("");
			$("#buttonHtxt").text("");
			$("#buttonItxt").text("");
			$("#activemenu").replaceWith( "<li><a>${message:menuprincipal}</a></li>");
			$("#headernav ol li a").attr("href","/restaurant");
			$("#headernav ol").append("<li>${message:opcion1}</li>");
			$("#headernav ol li").attr("class","active");
		  }
		  if((String.fromCharCode(e.which)==2)&&(currentOption=="menu")){
			$("#button2txt").text("${message:opcion21}");
			$("#button2txt").text("${message:opcion22}");
			$("#button3txt").text("${message:opcion23}");
			$("#button4txt").text("${message:opcion24}");
			$("#button5txt").text("${message:opcion25}");
			$("#button6txt").text("${message:opcion26}");
			$("#button7txt").text("${message:opcion27}");
			$("#button8txt").text("${message:opcion28}");
			$("#button9txt").text("");
			$("#buttonAtxt").text("");
			$("#buttonBtxt").text("");
			$("#buttonCtxt").text("");
			$("#buttonDtxt").text("");
			$("#buttonEtxt").text("");
			$("#buttonFtxt").text("");
			$("#buttonGtxt").text("");
			$("#buttonHtxt").text("");
			$("#buttonItxt").text("");
			$("#activemenu").replaceWith( "<li><a>${message:menuprincipal}</a></li>");
			$("#headernav ol li a").attr("href","/restaurant");
			$("#headernav ol").append("<li>${message:opcion2}</li>");
			$("#headernav ol li").attr("class","active");
		  }
		};