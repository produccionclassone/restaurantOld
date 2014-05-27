var changeLiterals = function(value,spec){
	if (value==0){
		$("#button1txt").text(spec.opcion1);
		$("#button2txt").text(spec.opcion2);
		$("#button3txt").text(spec.opcion3);
		$("#button4txt").text(spec.opcion4);
		$("#button5txt").text(spec.opcion5);
		$("#button6txt").text(spec.opcion6);
		$("#button7txt").text(spec.opcion7);
		$("#button8txt").text(spec.opcion8);
		$("#button9txt").text(spec.opcion9);
		$("#buttonAtxt").text(spec.opciona);
		$("#buttonBtxt").text(spec.opcionb);
		$("#buttonCtxt").text(spec.opcionc);
		$("#buttonDtxt").text(spec.opciond);
		$("#buttonEtxt").text(spec.opcione);
		$("#buttonFtxt").text(spec.opcionf);
		$("#buttonGtxt").text(spec.opciong);
		$("#buttonHtxt").text(spec.opcionh);
		$("#buttonItxt").text(spec.opcioni);
		$("#disablemenu").replaceWith( "<li>"+spec.menu+"</li>");
		$( ".active" ).remove();	
		$("#headernav ol li").attr("id","activemenu");
		$("#activemenu").attr("class","active");
		$("#activemenu").attr("name","menu");
		$("#buttonmenu").text(spec.menu);
		
	}
	if (value==1){
	  	$("#button1txt").text(spec.opcion11);
		$("#button2txt").text(spec.opcion12);
		$("#button3txt").text(spec.opcion13);
		$("#button4txt").text(spec.opcion14);
		$("#button5txt").text(spec.opcion15);
		$("#button6txt").text(spec.opcion16);
		$("#button7txt").text(spec.opcion17);
		$("#button8txt").text(spec.opcion18);
		$("#button9txt").text(spec.opcion19);
		$("#buttonAtxt").text("");
		$("#buttonBtxt").text("");
		$("#buttonCtxt").text("");
		$("#buttonDtxt").text("");
		$("#buttonEtxt").text("");
		$("#buttonFtxt").text("");
		$("#buttonGtxt").text("");
		$("#buttonHtxt").text("");
		$("#buttonItxt").text("");
		$("#activemenu").replaceWith( "<li><a>"+spec.menu+"</a></li>");
		$("#headernav ol li a").attr("href","/restaurant");
		$("#headernav ol li").attr("id","disablemenu");
		$("#headernav ol").append("<li>"+spec.opcion1+"</li>");
		$("#headernav ol li").attr("class","active");
		$("#disablemenu").attr("name","menu");
		$("#disablemenu").attr("class","disable");
		$("#buttonmenu").text(spec.opcion1);
	}
	if (value==2){
		$("#button1txt").text(spec.opcion21);
		$("#button2txt").text(spec.opcion22);
		$("#button3txt").text(spec.opcion23);
		$("#button4txt").text(spec.opcion24);
		$("#button5txt").text(spec.opcion25);
		$("#button6txt").text(spec.opcion26);
		$("#button7txt").text(spec.opcion27);
		$("#button8txt").text(spec.opcion28);
		$("#button9txt").text(spec.opcion29);
		$("#buttonAtxt").text("");
		$("#buttonBtxt").text("");
		$("#buttonCtxt").text("");
		$("#buttonDtxt").text("");
		$("#buttonEtxt").text("");
		$("#buttonFtxt").text("");
		$("#buttonGtxt").text("");
		$("#buttonHtxt").text("");
		$("#buttonItxt").text("");
		$("#activemenu").replaceWith( "<li><a>"+spec.menu+"</a></li>");
		$("#headernav ol li a").attr("href","/restaurant");
		$("#headernav ol li").attr("id","disablemenu");
		$("#headernav ol").append("<li>"+spec.opcion2+"</li>");
		$("#headernav ol li").attr("class","active");
		$("#disablemenu").attr("name","menu");
		$("#disablemenu").attr("class","disable");
		$("#buttonmenu").text(spec.opcion2);
	}
		if (value==3){
		$("#button1txt").text(spec.opcion31);
		$("#button2txt").text(spec.opcion32);
		$("#button3txt").text(spec.opcion33);
		$("#button4txt").text(spec.opcion34);
		$("#button5txt").text(spec.opcion35);
		$("#button6txt").text(spec.opcion36);
		$("#button7txt").text(spec.opcion37);
		$("#button8txt").text(spec.opcion38);
		$("#button9txt").text(spec.opcion39);
		$("#buttonAtxt").text("");
		$("#buttonBtxt").text("");
		$("#buttonCtxt").text("");
		$("#buttonDtxt").text("");
		$("#buttonEtxt").text("");
		$("#buttonFtxt").text("");
		$("#buttonGtxt").text("");
		$("#buttonHtxt").text("");
		$("#buttonItxt").text("");
		$("#activemenu").replaceWith( "<li><a>"+spec.menu+"</a></li>");
		$("#headernav ol li a").attr("href","/restaurant");
		$("#headernav ol li").attr("id","disablemenu");
		$("#headernav ol").append("<li>"+spec.opcion3+"</li>");
		$("#headernav ol li").attr("class","active");
		$("#disablemenu").attr("name","menu");
		$("#disablemenu").attr("class","disable");
		$("#buttonmenu").text(spec.opcion3);		
	}
	if (value==4){
		$("#button1txt").text(spec.opcion41);
		$("#button2txt").text(spec.opcion42);
		$("#button3txt").text(spec.opcion43);
		$("#button4txt").text(spec.opcion44);
		$("#button5txt").text(spec.opcion45);
		$("#button6txt").text(spec.opcion46);
		$("#button7txt").text(spec.opcion47);
		$("#button8txt").text(spec.opcion48);
		$("#button9txt").text(spec.opcion49);
		$("#buttonAtxt").text("");
		$("#buttonBtxt").text("");
		$("#buttonCtxt").text("");
		$("#buttonDtxt").text("");
		$("#buttonEtxt").text("");
		$("#buttonFtxt").text("");
		$("#buttonGtxt").text("");
		$("#buttonHtxt").text("");
		$("#buttonItxt").text("");
		$("#activemenu").replaceWith( "<li><a>"+spec.menu+"</a></li>");
		$("#headernav ol li a").attr("href","/restaurant");
		$("#headernav ol li").attr("id","disablemenu");
		$("#headernav ol").append("<li>"+spec.opcion4+"</li>");
		$("#headernav ol li").attr("class","active");
		$("#disablemenu").attr("name","menu");
		$("#disablemenu").attr("class","disable");
		$("#buttonmenu").text(spec.opcion4);		
	}		 		 
}


var menuBehaviour = function(e,spec){
		e.preventDefault();
		console.log(e.which + ": " +String.fromCharCode(e.which));
		var currentOption=$('.active').attr('name');
		console.log(currentOption);
		if((String.fromCharCode(e.which)==1)&&(currentOption=="menu")){
			changeLiterals(1,spec);
		  }
		  if((String.fromCharCode(e.which)==2)&&(currentOption=="menu")){
			changeLiterals(2,spec);
		  }
		};
		
		
(function( $, window ) {		
	 'use scrict';  
	  $.extend(Tapestry.Initializer, {
	 	 initMenu: function (spec) {
	 	 $("#menuexperto").keypress(function(e){
 			menuBehaviour(e,spec);	
		 });
		 $(document).keyup(function(e) {
  				if (e.keyCode == 27) { 
  				if ($("#activemenu").attr("name")!="menu")
  				changeLiterals(0,spec);}  
		 });
	    }
	   })
})(jQuery, window);