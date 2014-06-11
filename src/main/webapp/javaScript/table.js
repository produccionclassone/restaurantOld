var editor;

$(document).ready(
		function() {
			$('#example').dataTable({
				"dom" : '<"top"TfC>Rrt<"bottom"lp><"clear">',
				"tableTools" : {
					"sRowSelect" : "os",
					"sSwfPath" : "../swf/copy_csv_xls_pdf.swf"
				}
			});
								 $("#ToolTables_example_0").children().replaceWith("<img src='../images/copy_paste.png' width='25' height='25'></img>");
								$("#ToolTables_example_1").children().replaceWith("<img src='../images/csv_file.png' width='25' height='25'></img>");
								$("#ToolTables_example_2").replaceWith("");
								$("#ToolTables_example_3").children().replaceWith("<img src='../images/pdf_file.png' width='25' height='25'></img>");
								$("#ToolTables_example_4").children().replaceWith("<img src='../images/printer.png' width='25' height='25'></img>");
								$(".ColVis_Button").children().replaceWith("<img src='../images/eye.png' width='25' height='25'></img>")
								$("#example_filter").children().replaceWith("<label><img src='../images/search.png' width='30' height='30'></img><input type='search' class='form-control input-sm' aria-controls='example'></label>");
			$("#addRowButton").click(function() {
				$("#modalCreate").modal("show");
			});

			$("#editRowButton").click(
					function() {
						if ($("tr").hasClass("selected")) {
							var size = ($(".selected").size());
							if (size == 1)
								$("#modalEdit").modal("show");
							$(location).attr(
									'href',
									'/restaurant/masterfiles/masterdishgroup?id='
											+ ($(".selected")[0].id));
						}

					});

			$("#deleteRowButton").click(
					function() {
						if ($("tr").hasClass("selected")) {
							$("#modalDelete").modal("show");
							var size = ($(".selected").size());
							var rows = [];
							for (var i = 0; i < size; i++) {
								rows.push($(".selected")[i].id);
							}
							var strRows = "";
							for (var i = 0; i < size; i++) {
								strRows = strRows + rows[i] + ":";
							}
						}
						$("#deleteRows").attr(
								'href',
								"/restaurant/masterfiles/masterdishgroup:deleterows/"
										+ strRows);

					});

		});