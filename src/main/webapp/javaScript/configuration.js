function save(parameter){
	$.post( "/restaurant/configuration/configuration.levelchanged",{param : parameter.value});
}

function saveBool(parameter){
	$.post( "/restaurant/configuration/configuration.checkchanged",{param : parameter.checked});
}

function saveCheckBox(){
	var chars = "123456789ABCDEFGHI";
	var privileges='';
	for (var i = 0; i < 18; i++) {
		for	(var j = 0; j < 18; j++){
			var check = "#cbox" + chars[i] + chars[j];
			if ($(check).is(':checked')== true)
  				privileges = privileges + "S";
    		else
				privileges = privileges + "N";
		}
	}
	var levelSelected = '';
	$('.radiomap').each(function(){
   		var id = $(this).attr("id");
       	if($("input:radio[id="+id+"]:checked").length != 0) {
			levelSelected = id;
		}
   	});
	
	var param = levelSelected  + ":" + privileges;		
	$.post( "/restaurant/configuration/configuration:checkchanged/"+param);
}

function savePrivilege(){
	var chars = "123456789ABCDEFGHI";
	var privileges='';
	for (var i = 0; i < 18; i++) {
		for	(var j = 0; j < 18; j++){
			var check = "#cbox" + chars[i] + chars[j];
			if ($(check).is(':checked')== true)
  				privileges = privileges + "S";
    		else
				privileges = privileges + "N";
		}
	}
	var levelSelected = '';
	$('.radiomap').each(function(){
   		var id = $(this).attr("id");
       	if($("input:radio[id="+id+"]:checked").length != 0) {
			levelSelected = id;
		}
   	});
	
	var parameterValue = levelSelected  + ":" + privileges;
	console.log(parameterValue);	
	$.post( "/restaurant/configuration/configuration.levelchanged",{param : parameterValue});
}

var validateSave = function(){
	$(".numericParam").focusout(function() {
		console.log();
		var intRegex = /^\d+$/;
		var str = this.value;
		if(intRegex.test(str)) {
			 $(this).removeClass("t-error");
			save(this);
			if ($(".t-error").length==0)
			$(".alert-numeric").hide();
		}
		else{ console.log("ERROR");
		 $(this).addClass("t-error");
		 $(".alert-alphabetic").hide();
		 $(".alert-float").hide();
		 $(".alert-numeric1_3").hide();
		 $(".alert-porcent").hide();
		 $(".alert-date").hide();
		 $(".alert-monExt").hide();
		 $(".alert-hex").hide();
		 $(".alert-dirIp").hide();
		 $(".alert-numeric").show();
		}
	});
	
	$(".alphabeticParam").focusout(function() {
		console.log();
		var alfRegex = /^(\w|\*|\s|\á|\é|\í|\ó|\ú|\ñ|\Ñ|\ü|\.|\:|\,|\;|\>|\<|\-|\_|\{|\}|\Ç|\[|\]|\+|\*|\|\(|\)|\@|\=|\?|\¿|\¡)+$/;
		var str = this.value;
		if(alfRegex.test(str)) {
			 $(this).removeClass("t-error");
			save(this);
			if ($(".t-error").length==0)
			$(".alert-alphabetic").hide();
		}
		else{ console.log("ERROR");
		 $(this).addClass("t-error");
		 $(".alert-numeric").hide();
		 $(".alert-float").hide();
		 $(".alert-numeric1_3").hide();
		 $(".alert-porcent").hide();
		 $(".alert-date").hide();
		 $(".alert-monExt").hide();
		 $(".alert-hex").hide();
		 $(".alert-dirIp").hide();
		 $(".alert-alphabetic").show();
		}
	});
	
	$(".boolParam").click(function() {
		saveBool(this);
	});
			
	$(".privParam").click(function() {
		saveCheckBox(this);
	});
	
	$(".floatParam").focusout(function() {
		console.log();
	var floatRegex = /^(\d{1,9}(,|.)\d{1,2}|\d{1,9})$/;
	var str = this.value;
	if(floatRegex.test(str)) {	
		$(this).removeClass("t-error");
		save(this);
		if ($(".t-error").length==0)
			$(".alert-float").hide();
	}
	else{ 
		console.log("ERROR");
		$(this).addClass("t-error");
		$(".alert-numeric").hide();
		$(".alert-alphabetic").hide();
		$(".alert-numeric1_3").hide();
		$(".alert-porcent").hide();
		$(".alert-date").hide();
		$(".alert-monExt").hide();
		$(".alert-hex").hide();
		$(".alert-dirIp").hide();
		$(".alert-float").show();
	}
	});
	
	$(".numeric1_3Param").focusout(function() {
		console.log();
		var int1_3Regex = /^[1-3]{1}$/;
		var str = this.value;
		if(int1_3Regex.test(str)) {
			 $(this).removeClass("t-error");
			save(this);
			if ($(".t-error").length==0)
			$(".alert-numeric1_3").hide();
		}
		else{ console.log("ERROR");
		 $(this).addClass("t-error");
		 $(".alert-numeric").hide();
		 $(".alert-alphabetic").hide();
		 $(".alert-float").hide();
		 $(".alert-porcent").hide();
		 $(".alert-date").hide();
		 $(".alert-monExt").hide();
		 $(".alert-hex").hide();
		 $(".alert-dirIp").hide();
		 $(".alert-numeric1_3").show();
		}
	});
	
	$(".porcentParam").focusout(function() {
		console.log();
	var porcentRegex = /^(\d{1,2}(,|.)\d{1,2}|\d{1,2}|[100])$/;
	var str = this.value;
	if(porcentRegex.test(str)) {	
		$(this).removeClass("t-error");
		save(this);
		if ($(".t-error").length==0)
			$(".alert-porcent").hide();
	}
	else{ 
		console.log("ERROR");
		$(this).addClass("t-error");
		$(".alert-numeric").hide();
		$(".alert-numeric1_3").hide();
		$(".alert-alphabetic").hide();
		$(".alert-float").hide();
		$(".alert-date").hide();
		$(".alert-monExt").hide();
		$(".alert-hex").hide();
		$(".alert-dirIp").hide();
		$(".alert-porcent").show();
	}
	});
	
	$(".dateParam").focusout(function() {
		console.log();
		var dateRegex = /^([0-2]{1}[1-9]{1}|[3][0-1]{1})\/([0]{1}[1-9]{1}|[1][0-2]{1})\/\d{4}$/
		var str = this.value;
		if(dateRegex.test(str)) {
			if(checkDate(str)==true) {
				$(this).removeClass("t-error");
				save(this);
				if ($(".t-error").length==0)
				$(".alert-date").hide();
			}
			else{ console.log("ERROR");
		 		$(this).addClass("t-error");
		 		$(".alert-alphabetic").hide();
		 		$(".alert-float").hide();
				$(".alert-numeric1_3").hide();
		 		$(".alert-porcent").hide();
		 		$(".alert-numeric").hide();
		 		$(".alert-monExt").hide();
		 		$(".alert-hex").hide();
		 		$(".alert-dirIp").hide();
		 		$(".alert-date").show();
			}
		}
		else{ console.log("ERROR");
		 $(this).addClass("t-error");
		 $(".alert-alphabetic").hide();
		 $(".alert-float").hide();
		 $(".alert-numeric1_3").hide();
		 $(".alert-porcent").hide();
		 $(".alert-numeric").hide();
		 $(".alert-monExt").hide();
		 $(".alert-hex").hide();
		 $(".alert-dirIp").hide();
		 $(".alert-date").show();
		}
	});
	
	$(".monExtParam").focusout(function() {
		console.log();
	var monExtRegex = /^(\d{1,9}(,|.)\d{1,5}|\d{1,9})$/;
	var str = this.value;
	if(monExtRegex.test(str)) {	
		$(this).removeClass("t-error");
		save(this);
		if ($(".t-error").length==0)
			$(".alert-monExt").hide();
	}
	else{ 
		console.log("ERROR");
		$(this).addClass("t-error");
		$(".alert-numeric").hide();
		$(".alert-alphabetic").hide();
		$(".alert-numeric1_3").hide();
		$(".alert-porcent").hide();
		$(".alert-date").hide();
		$(".alert-hex").hide();
		$(".alert-dirIp").hide();
		$(".alert-monExt").show();
	}
	});
	
	$(".hexParam").focusout(function() {
		console.log();
		var hexRegex = /^[A-Fa-f0-9]+$/
		var str = this.value;
		if(hexRegex.test(str)) {
			 $(this).removeClass("t-error");
			save(this);
			if ($(".t-error").length==0)
			$(".alert-hex").hide();
		}
		else{ console.log("ERROR");
		 $(this).addClass("t-error");
		 $(".alert-numeric").hide();
		 $(".alert-alphabetic").hide();
		 $(".alert-float").hide();
		 $(".alert-numeric1_3").hide();
		 $(".alert-porcent").hide();
		 $(".alert-date").hide();
		 $(".alert-monExt").hide();
		 $(".alert-dirIp").hide();
		 $(".alert-hex").show();
		}
	});
	
	$(".dirIpParam").focusout(function() {
		console.log();
		var dirIpRegex = /^([1-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\.([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])){3}$/
		var str = this.value;
		if(dirIpRegex.test(str)) {
			 $(this).removeClass("t-error");
			save(this);
			if ($(".t-error").length==0)
			$(".alert-dirIp").hide();
		}
		else{ console.log("ERROR");
		 $(this).addClass("t-error");
		 $(".alert-numeric").hide();
		 $(".alert-alphabetic").hide();
		 $(".alert-float").hide();
		 $(".alert-numeric1_3").hide();
		 $(".alert-porcent").hide();
		 $(".alert-date").hide();
		 $(".alert-monExt").hide();
		 $(".alert-hex").hide();
		 $(".alert-dirIp").show();
		}
	});
}

var checkDate = function(dateAsString){
		var strSplit = dateAsString.split('/');
		var day = strSplit[0];
		var month = strSplit[1];
		var year = strSplit[2];
		var esBisiesto = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) ? true : false;
		
		if ((year < 1900)|| year > 2100) return false;
		
		if (((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day < 31) ) 
			return true;
		
		if (((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) && (day < 32) ) 
			return true;
		
		if ((esBisiesto) && (month == 2) && (day < 30))
			return true;
			
		if ((!esBisiesto) && (month == 2) && (day < 28))
			return true;
			
		return false;
		
}

var showParameters = function(parameters) {
	var parametersGeneric=parameters.parametersGeneric;
	var parametersBool=parameters.parametersBool;
	var parametersRoom=parameters.parametersRoom;

	for (var i=0;i<parametersBool.length;i++){
		$("#"+parametersBool[i].name).attr('checked',parametersBool[i].value);
	}
	
	for (var i=0;i<parametersGeneric.length;i++){
		$("#"+parametersGeneric[i].name).attr('value',parametersGeneric[i].value);
		$("#"+parametersGeneric[i].name).val(parametersGeneric[i].value);		
	}
			
	for (var i=0;i<parametersRoom.length;i++){
		$("#desc"+parametersRoom[i].id).attr('value',parametersRoom[i].roomDescription);
		$("#firstTab"+parametersRoom[i].id).attr('value',parametersRoom[i].firstTab);
		$("#lastTab"+parametersRoom[i].id).attr('value',parametersRoom[i].lastTab);
	}
};

(function($, window) {
	'use strict';
	$
			.extend(
					Tapestry.Initializer,
					{
						loadParameters : function(parameters) {
							showParameters(parameters);
							$('.radiomap').change(function(){
								var id = $(this).attr("id");
       	 						var levelSelected;
       	 						var privilegesSelected='';
       	 						if($("input:radio[id="+id+"]:checked").length != 0) {
									levelSelected = id;
								}
																
								for (var i = 0; i < parameters.parametersPrivilege.length;i++) {
									if(levelSelected == parameters.parametersPrivilege[i].name){
										privilegesSelected = parameters.parametersPrivilege[i].value;
									}	
								}
								var i=0;
								$('.cbox').each(function(){
   									if (privilegesSelected[i] == "S")
   										$(this).attr('checked',true);
   									else
   										$(this).attr('checked',false);
									i=i+1;
								});
							});
							
							
							validateSave();
							$('body').on('keydown', 'input, select, textarea', function(e) {
								var self = $(this)
								  , form = self.parents('form:eq(0)')
								  , focusable
								  , next
								  , prev
								  ;
								 if (e.keyCode == 27) {
								     focusable =   form.find('input,a,select,button,textarea').filter(':visible');
								     prev = focusable.eq(focusable.index(this)-1); 
								     if ((focusable.index(this))==0){
								     }
								     else if (prev.length) {
								        prev.focus();
								     } else {

								    }
								  }
								
								  else
								if (e.keyCode == 13) {
								    focusable = form.find('input,a,select,button,textarea').filter(':visible');
								    next = focusable.eq(focusable.index(this)+1);
								    if (next.length) {
								        next.focus();
								    } else {
	
								    }
								    return false;
								}
								 
								});
								
								$(".pick-a-color").pickAColor({
			  						showSpectrum            : false,
									showSavedColors         : true,
									saveColorsPerElement    : true,
									fadeMenuToggle          : true,
									showAdvanced						: true,
									showBasicColors         : true,
									showHexInput            : true,
									allowBlank							: true,
									inlineDropdown					: true
								});
						}
					})
})(jQuery, window);