var selectLevel = function() {
     $(document).ready(function() {
     	$(".radiogroup").click(function(){
           var id = $(this).attr("id");
           if($("input:radio[id="+id+"]:checked").length != 0)
           {
           	console.log(id);
           }
		});
	 });
};

(function($, window) {
	'use scrict';
	$.extend(Tapestry.Initializer, {
		loadPrivileges : function(spec) {
			selectLevel();
			var privilegesNames = spec.privilegesNames;
			var privilegesList = spec.privilegesList;				
			
			for (var i = 0; i < 6;i++) {
				console.log(privilegesNames[i]);
				console.log(privilegesList[i]);
			}
		}
	})
})(jQuery, window);
