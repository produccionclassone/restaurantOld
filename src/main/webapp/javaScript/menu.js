var clearButtons = function() {
	var chars = "ABCDEFGHI";
	for (var i = 1; i <= 9; i++) {
		var buttonNum = "#button" + i.toString() + "txt";
		$(buttonNum).text("");
		var buttonChar = "#button" + chars[i - 1] + "txt";
		$(buttonChar).text("");
	}
}

var returnMenu = function(options, literalMenu) {
	console.log(options);
	for (var i = 1; i < 19; i++) {
		if (options[i - 1].option != null) {
			console.log("escribo " + i)
			var button = "#button" + options[i - 1].option + "txt";
			$(button).text(options[i - 1].name);
		}
	}
	$("#disablemenu").replaceWith("<li>" + literalMenu + "</li>");
	$(".active").remove();
	$("#headernav ol li").attr("id", "activemenu");
	$("#activemenu").attr("class", "active");
	$("#activemenu").attr("name", "menu");
	$("#buttonmenu").text(literalMenu);
	disableButtons();
}

var currentOptionNumber = function(literal, options) {
	for (var i = 0; i < 18; i++) {
		if (literal == options[i].option)
			return i;
	}
}

var menuClickBehaviour = function(spec) {

	$(".btn-option").click(function() {
		var currentOption = $('.active').attr('name');
		if (currentOption == "favorites") {
			if ($(this).text() == "")
				$("#add-favorite-modal").modal("show");
			else {
				$(location).attr('href', spec[($(this).attr('id')[6])]); // ENLAZAR
				// A LA
				// RUTA
				// DEL
				// FAVORITO
			}
		} else
			menuBehaviour(($(this).attr('id')[6]), spec.options);
	});
	$(".btn-text").mousedown(function(event) {
		var currentOption = $('.active').attr('name');
		if (currentOption == "favorites") {
			if ($(this).text() == "")
				$("#add-favorite-modal").modal("show");
			else {
				$(location).attr('href', spec[($(this).attr('id')[6])]); // ENLAZAR
				// A LA
				// RUTA
				// DEL
				// FAVORITO
			}
		} else
			menuBehaviour(($(this).attr('id')[6]), spec.options);
	});

}

var menuBehaviour = function(value, options) {

	var chars = "ABCDEFGHI";
	var literal = $('.active').text();
	var currentOption = $('.active').attr('name');
	console.log(options);
	if (currentOption != "menu")
		options = options[currentOptionNumber(currentOption, options)].suboptions;

	for (var i = 1; i <= 19; i++) {
		var j;
		if (i > 9) {
			j = chars[i - 10];
		} else
			j = i;
		if ((value == j) && (options[i - 1].name != "")) {
			$("#activemenu")
					.replaceWith(
							"<li id='disablemenu' class='disable'><a href='/restaurant/?showFavorites=false&showHistory=false'>"
									+ literal + "</a></li>");
			clearButtons();
			var suboptions = options[i - 1].suboptions;
			if (suboptions != null) {
				for (var k = 0; k < suboptions.length; k++) {
					var button = "#button" + suboptions[k].option[2] + "txt";
					$(button).text(suboptions[k].name);
				}
				$("#headernav ol").append(
						"<li class='active' name='" + options[i - 1].option
								+ "'>" + options[i - 1].name + "</li>");
				$("#buttonmenu").text(options[i - 1].name);
			} else
				$(location).attr('href', options[i - 1].path);
			break;
		}

	}
	disableButtons();
};

var disableButtons = function() {
	for (var i = 0; i < $(".btn-text").length; i++) {
		var btntext = $(".btn-text")[i];
		var btnoption = $(".btn-option")[i];
		if ($(btntext).text() == "") {
			$(btntext).attr("disabled", "disabled");
			$(btnoption).attr("disabled", "disabled");
		} else {
			$(btntext).removeAttr("disabled");
			$(btnoption).removeAttr("disabled");
		}
	}
};

var changeToFavorite = function(i, option) {
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
			var options = spec.options;
			console.log(options);
			var literalMenu = spec.menu;
			$.urlParam = function(name) {
				var results = new RegExp('[\?&]' + name + '=([^&#]*)')
						.exec(window.location.href);
				if (results == null) {
					return null;
				} else {
					return results[1] || 0;
				}
			}
			disableButtons();
			if ($.urlParam('option') != null)
				menuBehaviour($.urlParam('option'), options);

			$("#menuexperto").keypress(function(e) {
				e.preventDefault();
				var value = String.fromCharCode(e.which).toUpperCase();
				menuBehaviour(value, options);
			});
			menuClickBehaviour(spec);
			$(document).keyup(function(e) {
				if (e.keyCode == 27) {
					if ($("#activemenu").attr("name") != "menu")
						returnMenu(options, literalMenu);
				}
			});

		}
	})

	$
			.extend(
					Tapestry.Initializer,
					{
						favorites : function(spec) {
							var favoriteNames = spec.favoriteNames;
							var favoritePaths = spec.favoritePaths;
							for (var i = 1; i <= 19; i++) {
								changeToFavorite(i, favoriteNames[i - 1]);
							}
							menuClickBehaviour(favoritePaths);
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