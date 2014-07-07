(function($) {
	$.addQualifier = function(qualifierId, qualifierNameLang1,
			qualifierNameLang2, qualifierNameLang3) {
		var a = table.fnAddData([qualifierId, qualifierNameLang1,
		             			qualifierNameLang2, qualifierNameLang3]);
		nTr = table.fnSettings().aoData[a[0]].nTr; // añadir la nueva fila
		nTr.id = qualifierId;
		if($(".textZoom").length==0){
			$(nTr).attr("style","text-align:left; font-size:12px;");
		}
		else{
		$(nTr).attr("style", $(".textZoom")[0].style.cssText);
		}
		$(nTr).addClass("textZoom");
	};
	$.extend(Tapestry.Initializer, {
		addQualifier : function(qualifier) {
			$.addQualifier(qualifier.qualifierId, qualifier.qualifierNameLang1,
					qualifier.qualifierNameLang2, qualifier.qualifierNameLang3);
		}
	});

})(jQuery)