(function($) {
	$.addClient = function(clientId, clientName, clientZipCode, clientDNI,
			clientPhoneContact) {
		var a = table.fnAddData([ clientId, clientName, clientZipCode,
				clientDNI, clientPhoneContact ]);
		nTr = table.fnSettings().aoData[a[0]].nTr; //añadir la nueva fila
		nTr.id = clientId;
		if($(".textZoom").length==0){
			$(nTr).attr("style","text-align:left; font-size:12px;");
		}
		else{
		$(nTr).attr("style", $(".textZoom")[].style.cssText);
		}
		$(nTr).addClass("textZoom");
	};
	$.extend(Tapestry.Initializer, {
		addClient : function(client) {
			$.addClient(client.clientId, client.clientName,
					client.clientZipCode, client.clientDNI,
					client.clientPhoneContact);
		}
	});

})(jQuery)