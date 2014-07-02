(function($) {
	$.addDishGroup = function(dishGroupId, dishGroupCode, dishGroupDescription,
			ivaType, salesLedgerAccount, typeIncome, macroGroup) {
		var a = table.fnAddData([ dishGroupCode, dishGroupDescription, ivaType,
				salesLedgerAccount, typeIncome, macroGroup ]);
		nTr = table.fnSettings().aoData[a[0]].nTr; // añadir la nueva fila
		nTr.id = dishGroupId;
		$(nTr).addClass("textZoom");
		$(nTr).attr("style", $(".textZoom")[1].style.cssText); // pasar la
		// fuente
		// indirectamente
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