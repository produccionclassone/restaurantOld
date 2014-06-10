(function($, window) {
	'use scrict';
	$.extend(Tapestry.Initializer, 
	  { loadPrivileges : function(spec) {
		$(document).ready(function() {
			var levelSelected;
     		var privilegesSelected;
     		var privilegesNames = spec.privilegesNames;
			var privilegesList = spec.privilegesList;				
		 	
		 	$(".radiomap").click(function(){
           		var id = $(this).attr("id");
           		if($("input:radio[id="+id+"]:checked").length != 0)
           		{
					levelSelected = id;
				}
				for (var i = 0; i < 6;i++) {
					if (levelSelected == privilegesNames[i]){
						privilegesSelected = privilegesList[i];
					}
				}
				console.log(levelSelected);
				console.log(privilegesSelected);
				var chars = "123456789ABCDEFGHI";
				var k=0;
				for (var i = 0; i < 18; i++) {
					for	(var j = 0; j < 18; j++){
						var check = "#cbox" + chars[i] + chars[j];
						$(check).attr('checked',false);
						if(privilegesSelected[k]=='S'){
							$(check).attr('checked',true);
						}
						console.log($(check).attr('checked'));
						k++;
					}
				}           	
			});	
		});			
	  }
	})
})(jQuery, window);



     			
           					
