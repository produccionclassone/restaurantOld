(function($) {
	$.addCurrency = function(currencyId, currencyCode, currencyName, currencyChange, currencyQuote, commisionPercent) {
		var a = table.fnAddData([ currencyCode, currencyName, currencyChange, currencyQuote, commisionPercent]);
		nTr = table.fnSettings().aoData[a[0]].nTr; // añadir la nueva fila
		nTr.id = currencyId;
		if($(".textZoom").length==0){
			$(nTr).attr("style","text-align:left; font-size:12px;");
		}
		else{
		$(nTr).attr("style", $(".textZoom")[0].style.cssText);
		}
		$(nTr).addClass("textZoom");
	};
	$.extend(Tapestry.Initializer, {
		addCurrency : function(currency) {
			$.addCurrency(currency.currencyId, currency.currencyCode,
					currency.currencyName, currency.currencyChange,
					currency.currencyQuote, currency.commisionPercent);
		}
	});

})(jQuery)