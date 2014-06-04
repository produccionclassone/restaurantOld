var clearButtons = function() {
	var chars = "ABCDEFGHI";
	for (var i = 1; i <= 9; i++) {
		var buttonNum = "#button" + i.toString() + "txt";
		$(buttonNum).text("");
		var buttonChar = "#button" + chars[i - 1] + "txt";
		$(buttonChar).text("");
	}
}

var changeLiterals = function(value, spec) {
	// ARREGLAR BUG DE SI NO TIENE SUBNIVEL EN CLICK
	clearButtons();
	console.log(value);
	$("#activemenu")
			.replaceWith(
					"<li id='disablemenu' class='disable'><a href='/restaurant/?showFavorites=false&showHistory=false'>"
							+ spec.menu + "</a></li>");
	if (value == 0) {
		$("#button1txt").text(spec.option1);
		$("#button2txt").text(spec.option2);
		$("#button3txt").text(spec.option3);
		$("#button4txt").text(spec.option4);
		$("#button5txt").text(spec.option5);
		$("#button6txt").text(spec.option6);
		$("#button7txt").text(spec.option7);
		$("#buttonAtxt").text(spec.optiona);
		$("#buttonBtxt").text(spec.optionb);
		$("#buttonCtxt").text(spec.optionc);
		$("#buttonDtxt").text(spec.optiond);
		$("#buttonEtxt").text(spec.optione);
		$("#disablemenu").replaceWith("<li>" + spec.menu + "</li>");
		$(".active").remove();
		$("#headernav ol li").attr("id", "activemenu");
		$("#activemenu").attr("class", "active");
		$("#activemenu").attr("name", "menu");
		$("#buttonmenu").text(spec.menu);

	}
	if (value == "1") {
		$("#button1txt").text(spec.option11);
		$("#button2txt").text(spec.option12);
		$("#button3txt").text(spec.option13);
		$("#button4txt").text(spec.option14);
		$("#button5txt").text(spec.option15);
		$("#button6txt").text(spec.option16);
		$("#button7txt").text(spec.option17);
		$("#button8txt").text(spec.option18);
		$("#headernav ol").append(
				"<li class='active'>" + spec.option1 + "</li>");
		$("#buttonmenu").text(spec.option1);
	}
	if (value == "3") {
		$("#button1txt").text(spec.option31);
		$("#button2txt").text(spec.option32);
		$("#button3txt").text(spec.option33);
		$("#button4txt").text(spec.option34);
		$("#button5txt").text(spec.option35);
		$("#button6txt").text(spec.option36);
		$("#button7txt").text(spec.option37);

		$("#headernav ol").append(
				"<li class='active'>" + spec.option3 + "</li>");
		$("#buttonmenu").text(spec.option3);
	}
	if (value == "4") {
		$("#button1txt").text(spec.option41);
		$("#button2txt").text(spec.option42);
		$("#button3txt").text(spec.option43);
		$("#button4txt").text(spec.option44);
		$("#button5txt").text(spec.option45);
		$("#button6txt").text(spec.option46);
		$("#button7txt").text(spec.option47);
		$("#button8txt").text(spec.option48);
		$("#buttonAtxt").text(spec.option4a);
		$("#buttonBtxt").text(spec.option4b);
		$("#buttonCtxt").text(spec.option4c);
		$("#buttonDtxt").text(spec.option4d);
		$("#buttonEtxt").text(spec.option4e);
		$("#activemenu")
				.replaceWith(
						"<li id='disablemenu' class='disable'><a href='/restaurant/?showFavorites=false&showHistory=false'>"
								+ spec.menu + "</a></li>");
		$("#headernav ol").append(
				"<li class='active'>" + spec.option4 + "</li>");
		$("#buttonmenu").text(spec.option4);
	}
	if (value == "5") {
		$("#button1txt").text(spec.option51);
		$("#button2txt").text(spec.option52);
		$("#button3txt").text(spec.option53);
		$("#button4txt").text(spec.option54);
		$("#button5txt").text(spec.option55);
		$("#button6txt").text(spec.option56);
		$("#button7txt").text(spec.option57);
		$("#button8txt").text(spec.option58);
		$("#buttonAtxt").text(spec.option5a);
		$("#buttonBtxt").text(spec.option5b);
		$("#headernav ol").append(
				"<li class='active'>" + spec.option5 + "</li>");
		$("#buttonmenu").text(spec.option5);
	}
	if (value == "6") {
		$("#button1txt").text(spec.option61);
		$("#button2txt").text(spec.option62);
		$("#button3txt").text(spec.option63);
		$("#button4txt").text(spec.option64);
		$("#button5txt").text(spec.option65);
		$("#button6txt").text(spec.option66);
		$("#headernav ol").append(
				"<li class='active'>" + spec.option6 + "</li>");
		$("#buttonmenu").text(spec.option6);
	}
	if (value == "7") {
		$("#button1txt").text(spec.option71);
		$("#button2txt").text(spec.option72);
		$("#button3txt").text(spec.option73);
		$("#button4txt").text(spec.option74);
		$("#headernav ol").append(
				"<li class='active'>" + spec.option7 + "</li>");
		$("#buttonmenu").text(spec.option7);
	}
	if (value == "A") {
		$("#button1txt").text(spec.optiona1);
		$("#button2txt").text(spec.optiona2);
		$("#button3txt").text(spec.optiona3);
		$("#button4txt").text(spec.optiona4);
		$("#button5txt").text(spec.optiona5);
		$("#button6txt").text(spec.optiona6);
		$("#button7txt").text(spec.optiona7);
		$("#button8txt").text(spec.optiona8);
		$("#headernav ol").append(
				"<li class='active'>" + spec.optiona + "</li>");
		$("#buttonmenu").text(spec.optiona);
	}
	if (value == "B") {
		$("#button1txt").text(spec.optionb1);
		$("#button3txt").text(spec.optionb3);
		$("#button4txt").text(spec.optionb4);
		$("#button5txt").text(spec.optionb5);
		$("#button6txt").text(spec.optionb6);
		$("#button7txt").text(spec.optionb7);
		$("#headernav ol").append(
				"<li class='active' name='" + spec.optionb + "'>"
						+ spec.optionb + "</li>");
		$("#buttonmenu").text(spec.optionb);
	}
}

var menuClickBehaviour = function(spec) {
	$(".btn-option").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals(($(this).attr('id')[6]), spec);
		if (currentOption == "favorites") {
			if ($(this).text()=="")
			$("#add-favorite-modal").modal("show");
			else{
				//$(location).attr('href', );ENLAZAR A LA RUTA DEL FAVORITO
			}
				
			
		}
	});
	$(".btn-text").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals(($(this).attr('id')[6]), spec);
		if (currentOption == "favorites") {
			$("#add-favorite-modal").modal("show");
		}
	});

}

var menuBehaviour = function(e, spec) {
	e.preventDefault();
	console.log(e.which + ": " + String.fromCharCode(e.which));
	var currentOption = $('.active').attr('name');
	console.log(currentOption);
	if ((String.fromCharCode(e.which) == 1) && (currentOption == "menu")) {
		changeLiterals(1, spec);
	}
	if ((String.fromCharCode(e.which) == 3) && (currentOption == "menu")) {
		changeLiterals(3, spec);
	}
	if ((String.fromCharCode(e.which) == 4) && (currentOption == "menu")) {
		changeLiterals(4, spec);
	}
	if ((String.fromCharCode(e.which) == 5) && (currentOption == "menu")) {
		changeLiterals(5, spec);
	}
	if ((String.fromCharCode(e.which) == 6) && (currentOption == "menu")) {
		changeLiterals(6, spec);
	}
	if ((String.fromCharCode(e.which) == 7) && (currentOption == "menu")) {
		changeLiterals(7, spec);
	}
	if ((String.fromCharCode(e.which) == 7) && (currentOption == spec.optionb)) {

		$(location).attr('href', spec.pathb7);
	}
	if ((String.fromCharCode(e.which) == "a") && (currentOption == "menu")) {
		changeLiterals("a", spec);
	}
	if ((String.fromCharCode(e.which) == "b") && (currentOption == "menu")) {
		changeLiterals("b", spec);
	}
};

var changeToFavorite = function(i, option) {
	console.log(option);
	var chars = "ABCDEFGHI";
	var button, buttonOpt;
	if (i <= 9) {
		button = "#button" + i.toString() + "txt";
		buttonOpt = "#button" + i.toString() + "opt";
	} else {
		button = "#button" + chars[i - 10] + "txt";
		buttonOpt = "#button" + chars[i - 10] + "opt";
	}
	if (option == null) {
		$(button).text("");
		$(buttonOpt)
				.replaceWith(
						"<button type='button' id='"
								+ buttonOpt
								+ "' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
	} else {
		$(button).text(option.toString());
	}

};
(function($, window) {
	'use scrict';
	$.extend(Tapestry.Initializer, {
		initMenu : function(spec) {

			$("#menuexperto").keypress(function(e) {
				menuBehaviour(e, spec);
			});
			menuClickBehaviour(spec);
			$(document).keyup(function(e) {
				if (e.keyCode == 27) {
					if ($("#activemenu").attr("name") != "menu")
						changeLiterals(0, spec);
				}
			});

		}
	})

	$
			.extend(
					Tapestry.Initializer,
					{
						favorites : function(spec) {
							var favorites = spec.favorites;
							for (var i = 1; i <= 19; i++) {
								changeToFavorite(i, favorites[i]);
							}
							menuClickBehaviour(null);
							$("#buttonmenu").text("Favoritos");
							$("#activemenu")
									.replaceWith(
											"<li id='disablemenu' class='disable'><a href='/restaurant/?showFavorites=false&showHistory=false'>"
													+ "Menu Principal"
													+ "</a></li>");
							$("#headernav ol").append(
									"<li class='active' name='favorites'>"
											+ "Favoritos" + "</li>");
							$(document)
									.keyup(
											function(e) {
												if ((e.keyCode == 27)
														&& ($(
																"#add-favorite-modal")
																.attr("style") == "display: none;")) {
													$(location)
															.attr('href',
																	"/restaurant/?showFavorites=false&showHistory=false");
												}

											});
						}
					})
})(jQuery, window);