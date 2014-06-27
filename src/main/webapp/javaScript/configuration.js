function permite(elEvento, permitidos) {
	// Variables que definen los caracteres permitidos
	var numeros = "0123456789";
	var caracteres = " abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ*";
	var numeros_caracteres = numeros + caracteres;
	var teclas_especiales = [ 8, 13, 27, 37, 39, 46 ];
	// 8 = BackSpace, 46 = Supr, 37 = flecha izquierda, 39 = flecha derecha

	// Seleccionar los caracteres a partir del parámetro de la función
	switch (permitidos) {
	case 'num':
		permitidos = numeros;
		break;
	case 'car':
		permitidos = caracteres;
		break;
	case 'num_car':
		permitidos = numeros_caracteres;
		break;
	}

	// Obtener la tecla pulsada
	var evento = elEvento || window.event;
	var codigoCaracter = evento.charCode || evento.keyCode;
	var caracter = String.fromCharCode(codigoCaracter);

	// Comprobar si la tecla pulsada es alguna de las teclas especiales
	// (teclas de borrado y flechas horizontales)
	var tecla_especial = false;
	for ( var i in teclas_especiales) {
		if (codigoCaracter == teclas_especiales[i]) {
			tecla_especial = true;
			break;
		}
	}

	// Comprobar si la tecla pulsada se encuentra en los caracteres permitidos
	// o si es una tecla especial
	return permitidos.indexOf(caracter) != -1 || tecla_especial;
}


function save(parameter){
	console.log(parameter.name);
	console.log(parameter.id);
	$.post( "/restaurant/configuration/configuration."+parameter.id+":"+parameter.id+"changed",{param : parameter.value});
}

function saveBool(parameter){
	console.log(parameter.checked);
	console.log(parameter.id);
	$.post( "/restaurant/configuration/configuration."+parameter.id+":"+parameter.id+"changed",{param : parameter.checked});
}
var validateSave = function(){
	$(".numericParam").focusout(function() {
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
		 $(".alert-numeric").show();
		}
	});
	$(".floatParam").focusout(function() {
		console.log();
		var floatRegex = /^(?:[1-9]\d*|0)?(?:\.\d+)?$/;
		var str = this.value;
		if(floatRegex.test(str)) {			
			 $(this).removeClass("t-error");
			save(this);
			if ($(".t-error").length==0)
			$(".alert-numeric").hide();
		}
		
		else{ console.log("ERROR");
		 $(this).addClass("t-error");
		 $(".alert-numeric").show();
		}
	});
	$(".boolParam").click(function(){
		saveBool(this);
	});
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
							
							
						}
					})
})(jQuery, window);
