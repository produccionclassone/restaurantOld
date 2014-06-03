var clearButtons = function() {
	var chars = "ABCDEFGHI";
	for (var i = 1; i <= 9; i++) {
		var buttonNum = "#button" + i.toString() + "txt";
		$(buttonNum).text("");
		var buttonChar = "#button" + chars[i - 1] + "txt"
		$(buttonChar).text("");
	}
}

var changeLiterals = function(value, spec) {
	clearButtons();
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
	if (value == 1) {
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
	if (value == 3) {
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
	if (value == 4) {
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
	if (value == 5) {
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
	if (value == 6) {
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
	if (value == 6) {
		$("#button1txt").text(spec.option71);
		$("#button2txt").text(spec.option72);
		$("#button3txt").text(spec.option73);
		$("#button4txt").text(spec.option74);
		$("#headernav ol").append(
				"<li class='active'>" + spec.option7 + "</li>");
		$("#buttonmenu").text(spec.option7);
	}
	if (value == "a") {
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
}

var menuClickBehaviour = function(spec) {
	$("#button1opt").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals(1, spec);
		if (currentOption == "favorites") {
			console.log("ESTOY EN FAVORITOS");
			$("#add-favorite-modal").modal("show");
		}

	});
	$("#button1txt").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals(1, spec);
		if (currentOption == "favorites") {
			console.log("ESTOY EN FAVORITOS");
			$("#add-favorite-modal").modal("show");
		}
	});
	$("#button2opt").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals(2, spec);
	});
	$("#button2txt").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals(2, spec);
	});
	$("#button3opt").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals(3, spec);
	});
	$("#button3txt").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals(3, spec);
	});
	$("#buttonAopt").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals("a", spec);
	});
	$("#buttonAtxt").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "menu")
			changeLiterals("a", spec);
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
	if ((String.fromCharCode(e.which) == "a") && (currentOption == "menu")) {
		changeLiterals("a", spec);
	}
};

var changeToFavorite = function(i, option) {
	console.log(option);
	switch (i) {
	case 1:
		if (option == null) {
			$("#button1txt").text("");
			$("#button1opt")
					.replaceWith(
							"<button type='button' id='button1opt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#button1txt").text(option.toString());
		}
		break;

	case 2:
		if (option == null) {
			$("#button2txt").text("");
			$("#button2opt")
					.replaceWith(
							"<button type='button' id='button2opt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#button2txt").text(option.toString());
		}
		break;
	case 3:
		if (option == null) {
			$("#button3txt").text("");
			$("#button3opt")
					.replaceWith(
							"<button type='button' id='button3opt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#button3txt").text(option.toString());
		}
		break;
	case 4:
		if (option == null) {
			$("#button4txt").text("");
			$("#button4opt")
					.replaceWith(
							"<button type='button' id='button4opt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#button4txt").text("FAVORITO 4");
		}
		break;
	case 5:
		if (option == null) {
			$("#button5txt").text("");
			$("#button5opt")
					.replaceWith(
							"<button type='button' id='button5opt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#button5txt").text("FAVORITO 5");
		}
		break;
	case 6:
		if (option == null) {
			$("#button6txt").text("");
			$("#button6opt")
					.replaceWith(
							"<button type='button' id='button6opt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#button6txt").text("FAVORITO 6");
		}
		break;
	case 7:
		if (option == null) {
			$("#button7txt").text("");
			$("#button7opt")
					.replaceWith(
							"<button type='button' id='button7opt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#button7txt").text("FAVORITO 7");
		}
		break;
	case 8:
		if (option == null) {
			$("#button8txt").text("");
			$("#button8opt")
					.replaceWith(
							"<button type='button' id='button8opt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#button8txt").text("FAVORITO 8");
		}
		break;
	case 9:
		if (option == null) {
			$("#button9txt").text("");
			$("#button9opt")
					.replaceWith(
							"<button type='button' id='button9opt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#button9txt").text("FAVORITO 9");
		}
		break;
	case 10:
		if (option == null) {
			$("#buttonAtxt").text("");
			$("#buttonAopt")
					.replaceWith(
							"<button type='button' id='buttonAopt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#buttonAtxt").text("FAVORITO A");
		}
		break;

	case 11:
		if (option == null) {
			$("#buttonBtxt").text("");
			$("#buttonBopt")
					.replaceWith(
							"<button type='button' id='buttonBopt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#buttonBtxt").text("FAVORITO B");
		}
		break;
	case 12:
		if (option == null) {
			$("#buttonCtxt").text("");
			$("#buttonCopt")
					.replaceWith(
							"<button type='button' id='buttonCopt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#buttonCtxt").text("FAVORITO C");
		}
		break;
	case 13:
		if (option == null) {
			$("#buttonDtxt").text("");
			$("#buttonDopt")
					.replaceWith(
							"<button type='button' id='buttonDopt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#buttonDtxt").text("FAVORITO D");
		}
		break;
	case 14:
		if (option == null) {
			$("#buttonEtxt").text("");
			$("#buttonEopt")
					.replaceWith(
							"<button type='button' id='buttonEopt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#buttonEtxt").text("FAVORITO E");
		}
		break;
	case 15:
		if (option == null) {
			$("#buttonFtxt").text("");
			$("#buttonFopt")
					.replaceWith(
							"<button type='button' id='buttonFopt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#buttonFtxt").text("FAVORITO F");
		}
		break;
	case 16:
		if (option == null) {
			$("#buttonGtxt").text("");
			$("#buttonGopt")
					.replaceWith(
							"<button type='button' id='buttonGopt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#buttonGtxt").text("FAVORITO G");
		}
		break;
	case 17:
		if (option == null) {
			$("#buttonHtxt").text("");
			$("#buttonHopt")
					.replaceWith(
							"<button type='button' id='buttonHopt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#buttonHtxt").text("FAVORITO H");
		}
		break;
	case 18:
		if (option == null) {
			$("#buttonItxt").text("");
			$("#buttonIopt")
					.replaceWith(
							"<button type='button' id='buttonIopt' class='btn btn-default btn-option btn-addFavorite'><img src='css/images/add.png' width='20' height='20'/></button>");
		} else {
			$("#buttonItxt").text("FAVORITO I");
		}
		break;

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