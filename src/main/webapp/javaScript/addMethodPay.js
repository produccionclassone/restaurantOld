(function($) {
	$.addDishGroup = function(dishGroupId, dishGroupCode, dishGroupDescription,
			ivaType, salesLedgerAccount, typeIncome, macroGroup) {
		var a = table.fnAddData([ dishGroupCode, dishGroupDescription, ivaType,
				salesLedgerAccount, typeIncome, macroGroup ]);
		nTr = table.fnSettings().aoData[a[0]].nTr; // añadir la nueva fila
		nTr.id = dishGroupId;
		if($(".textZoom").length==0){
			$(nTr).attr("style","text-align:left; font-size:12px;");
		}
		else{
		$(nTr).attr("style", $(".textZoom")[0].style.cssText);
		}
		$(nTr).addClass("textZoom");
	};
	$.extend(Tapestry.Initializer, {
		addDishGroup : function(dishGroup) {
			$.addDishGroup(dishGroup.dishGroupId, dishGroup.dishGroupCode,
					dishGroup.dishGroupDescription, dishGroup.ivaType,
					dishGroup.salesLedgerAccount, dishGroup.typeIncome,
					dishGroup.macroGroup);
		}
	});

})(jQuery)