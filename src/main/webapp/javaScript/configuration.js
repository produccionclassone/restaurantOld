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

var loadParametersGeneric = function(spec) {
	var parametersGeneric = spec.parametersGeneric;
	for (var i = 0; i < parametersGeneric.length; i++) {
		var parameter = (parametersGeneric[i]).split('|');
		$("#" + parameter[1]).attr('value', parameter[2]);
	}
};

var loadParametersBool = function(spec) {
	var parametersBool = spec.parametersBool;
	for (var i = 0; i < parametersBool.length; i++) {
		var parameter = (parametersBool[i]).split('|');
		if (parameter[2]=="true")
			$("#" + parameter[1]).attr('checked', true);
		else
			$("#" + parameter[1]).attr('checked', false);
		console.log(parameter);
		
	}
};

var loadParametersRoom = function(spec) {
	var parametersRoom = spec.parametersRoom;
	for (var i = 0; i < parametersRoom.length; i++) {
		var parameter = (parametersRoom[i]).split('|');
		$("#" + parameter[1]).attr('value', parameter[1]);
		$("#" + parameter[2]).attr('value', parameter[2]);
		$("#" + parameter[3]).attr('value', parameter[3]);
	}
};

(function($, window) {
	'use strict';
	$
			.extend(
					Tapestry.Initializer,
					{
						loadParameters : function(spec) {
							loadParametersGeneric(spec);
							loadParametersBool(spec);
							loadParametersRoom(spec);
							var parametersBool= spec.parametersBool;
							console.log(parametersBool);
							
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
