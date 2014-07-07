(function($) {
	$.addWaiter = function(waiterId, waiterName, waiterZip, waiterDNI,
			waiterPhone) {
		var a = table.fnAddData([ waiterId, waiterName, waiterZip,
				waiterDNI, waiterPhone ]);
		nTr = table.fnSettings().aoData[a[0]].nTr; //añadir la nueva fila
		nTr.id = waiterId;
		if($(".textZoom").length==0){
			$(nTr).attr("style","text-align:left; font-size:12px;");
		}
		else{
		$(nTr).attr("style", $(".textZoom")[0].style.cssText);
		}
		$(nTr).addClass("textZoom");
	};
	$.extend(Tapestry.Initializer, {
		addWaiter : function(waiter) {
			$.addWaiter(waiter.waiterId, waiter.waiterName,
					waiter.waiterZip, waiter.waiterDNI,
					waiter.waiterPhone);
		}
	});

})(jQuery)