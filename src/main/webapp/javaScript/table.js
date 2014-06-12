var editor;

$(document)
		.ready(
				function() {
					$('#example').dataTable({
						"dom" : '<"top row"TfC>Rrt<"bottom"lp>',
						"language" : {
							"search" : "",
							"paginate": {
								            "previous": "<",
								            "next": ">"
								           },
								           "lengthMenu": ""
								           
							
						},
						"tableTools" : {
							"sRowSelect" : "os",
							"sSwfPath" : "../swf/copy_csv_xls_pdf.swf"
						}

					});
					$("#headernav ol").append("<li class='active' name='A'>"+"Mantenimiento de ficheros maestros" + "</li>"+ "<li class='active' name='1'>" + "Grupos a la carta" + "</li>");
					$(".header").hide();
					$(".dataTables_empty").text("");
					$(".dataTables_empty").append("<img src='../images/database.png' width='25' height='25'></img>");
					$("#ToolTables_example_0")
							.children()
							.replaceWith(
									"<img src='../images/copy_paste.png' width='25' height='25'></img>");
					$("#ToolTables_example_1")
							.children()
							.replaceWith(
									"<img src='../images/csv_file.png' width='25' height='25'></img>");
					$("#ToolTables_example_2").replaceWith("");
					$("#ToolTables_example_3")
							.children()
							.replaceWith(
									"<img src='../images/pdf_file.png' width='25' height='25'></img>");
					$("#ToolTables_example_4")
							.children()
							.replaceWith(
									"<img src='../images/printer.png' width='25' height='25'></img>");
					$(".ColVis_Button")
							.attr("class",
									"ColVis_Button ColVis_MasterButton btn btn-default");
					$(".ColVis_Button")
							.children()
							.replaceWith(
									"<img src='../images/eye.png' width='25' height='25'></img>")

					$(
							"<img	src='../images/search.png' width='30' height='30'></img>")
							.appendTo(".dataTables_filter");	
					$("#deleteRowButton").prop('disabled', true);
					$("#editRowButton").prop('disabled', true);
					$('#example tbody').on('click', 'tr', function() {
						var size = ($(".selected").size());
						$("#deleteRowButton").prop('disabled', false);
						console.log(size)
						if (size==0){
							$("#deleteRowButton").prop('disabled', true);
							$("#editRowButton").prop('disabled', true);
						}
						else if (size == 1)
							$("#editRowButton").prop('disabled', false);
						else if (size != 1)
							$("#editRowButton").prop('disabled', true);
					});

					$("#addRowButton").click(function() {
						$("#modalCreate").modal("show");
					});

					$("#editRowButton")
							.click(
									function() {
										if ($("tr").hasClass("selected")) {
											var size = ($(".selected").size());
											if (size == 1) {
												$("#editRowButton").prop(
														'disabled', false);
												$(location)
														.attr(
																'href',
																'/restaurant/masterfiles/masterdishgroup?id='
																		+ ($(".selected")[0].id));
											}
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