(function($) {
	$.addClient = function(clientId, clientName, clientZipCode, clientDNI,
			clientPhoneContact) {

		var row = "'<tr style='font-size:12px; text-align:left;' class='textZoom even' id='"
				+ clientId
				+ "'> "
				+ "<td class=' '>"
				+ clientId
				+ "</td><td class=' '>"
				+ clientName
				+ "</td> "
				+ "<td class=' '>"
				+ clientZipCode
				+ "</td><td class=' '>"
				+ clientDNI
				+ "</td><td class=' '>"
				+ clientPhoneContact
				+ "</td></tr>'";

		$("tbody").prepend(row);
//		$("#"+clientId).click(function(){
//			$(this).addClass("DTTT_selected");
//			$(this).addClass("selected");
//		});

	};
	$.extend(Tapestry.Initializer, {
		addRow : function(client) {
			$.addClient(client.clientId, client.clientName,
					client.clientZipCode, client.clientDNI,
					client.clientPhoneContact);
		}
	});

})(jQuery)