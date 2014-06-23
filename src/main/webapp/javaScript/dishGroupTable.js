var editor;

$(document)
		.ready(
				function() {
					var table = $('#dishGroupTable').dataTable(
							{
								"dom" : '<"top row"TfC>Rrt<"bottom"lp>',
								"lengthMenu" : [ [ 10, 25, 50, 100, -1 ],
										[ 10, 25, 50, 100, "*" ] ],
										  stateSave: true,
										columnDefs: [ {
								            targets: [ 0 ],
								            orderData: [ 0, 1 ]
								        }, {
								            targets: [ 1 ],
								            orderData: [ 1, 0 ]
								        }, {
								            targets: [ 4 ],
								            orderData: [ 4, 0 ]
								        } ],
								"language" : {
									"search" : "",
									"paginate" : {
										"previous" : "<",
										"next" : ">"
									},
									"lengthMenu" : ""

								},
								"tableTools" : {
									"sRowSelect" : "os",
									"sSwfPath" : "../swf/copy_csv_xls_pdf.swf"
								}

							});
					new $.fn.dataTable.FixedHeader(table);
					$(".FixedHeader_Cloned")[0].style["cssText"] = $(".FixedHeader_Cloned")[0].style["cssText"]
							.replace("absolute", "relative");
					$(".header").hide();
					$(".dataTables_empty").text("");
					$(".dataTables_empty")
							.append(
									"<img src='../images/database.png' width='25' height='25'></img>");
					$("#ToolTables_dishGroupTable_0")
							.children()
							.replaceWith(
									"<img src='../images/copy_paste.png' width='25' height='25'></img>");
					$("#ToolTables_dishGroupTable_1")
							.children()
							.replaceWith(
									"<img src='../images/csv_file.png' width='25' height='25'></img>");
					$("#ToolTables_dishGroupTable_2").replaceWith("");
					$("#ToolTables_example_3")
							.children()
							.replaceWith(
									"<img src='../images/pdf_file.png' width='25' height='25'></img>");
					$("#ToolTables_dishGroupTable_4")
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
					$('#dishGroupTable tbody').on('click', 'tr', function() {
						var size = ($(".selected").size());
						$("#deleteRowButton").prop('disabled', false);
						if (size == 0) {
							$("#deleteRowButton").prop('disabled', true);
							$("#editRowButton").prop('disabled', true);
						} else if (size == 1)
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
					$('#modalCreate').on('shown.bs.modal', function() {
						$('#dishGroupCode').focus();

					});
					$.urlParam = function(name) {
						var results = new RegExp('[\?&]' + name + '=([^&#]*)')
								.exec(window.location.href);
						if (results == null) {
							return null;
						} else {
							return results[1] || 0;
						}
					}
					if ($.urlParam('id') != null) {
						$('#modalEdit').modal('show');
						$('#modalEdit').on('shown.bs.modal', function() {
							$('#editdishGroupCode').focus();

						});
					}
					$("#activemenu")
					.replaceWith(
							"<li id='disablemenu' class='disable'><a href='/restaurant/?showFavorites=false&showHistory=false'>"
									+ $("#activemenu").text() + "</a></li>");
					$("#headernav ol").append(
							"<li class='disable' name='A'> <a href='/restaurant/?showFavorites=false&showHistory=false&option=A'>"
									+ "Mantenimiento de ficheros maestros"
									+ "</a></li>" + "<li class='active' name='1'>"
									+ "Grupos a la carta" + "</li>");
					$(document).keyup(function(e) {
							
						  if (e.keyCode == 27) { 
							  $(location)
								.attr(
										'href',
										'/restaurant/?showFavorites=false&showHistory=false?option=A');
						  }  
						});
						$("tr").dblclick(function() {
							  console.log( this);
						});
					
					

				});