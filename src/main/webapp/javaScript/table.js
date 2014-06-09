var editor;

$(document).ready( function () {
	 $('#example').dataTable( {
		 "dom": '<"top"fCT>rt<"bottom"lp><"clear">',
		 "tableTools": {
			 "sRowSelect": "os",
	            "sSwfPath": "../swf/copy_csv_xls_pdf.swf"
	        }
	   } );
} );