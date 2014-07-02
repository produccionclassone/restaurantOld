(function($) {
	$.addClient = function(clientId, clientName, clientZipCode, clientDNI,
			clientPhoneContact) {
		var a = table.fnAddData([ clientId, clientName, clientZipCode,
				clientDNI, clientPhoneContact ]);
		nTr = table.fnSettings().aoData[a[0]].nTr; //añadir la nueva fila
		nTr.id = clientId;
		$(nTr).addClass("textZoom");
		$(nTr).attr("style", $(".textZoom")[1].style.cssText); //pasar la fuente indirectamente
	};
	$.extend(Tapestry.Initializer, {
		addClient : function(client) {
			$.addClient(client.clientId, client.clientName,
					client.clientZipCode, client.clientDNI,
					client.clientPhoneContact);
		}
	});

})(jQuery)