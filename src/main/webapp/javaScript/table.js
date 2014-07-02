var editor;
var zoom = 0;
$(document)
		.ready(
				function() {
					$('#pleaseWaitDialog').modal('hide');
					$('#tableZone').show();
					// Inicializar la tabla
					table = $('#table')
							.dataTable(
									{
										"sDom" : '<"row top"TfC<"toolbar">>rtR  <"bottom" lp>',
										"lengthMenu" : [ [ 25, 50, 100, -1 ],
												[ 25, 50, 100, "*" ] ],
												 "scrollY": "500px",
								        "scrollCollapse": true,
								        "bScrollInfinite": true,
										stateSave : true,
										aocolumnDefs : [ {
											targets : [ 0 ],
											orderData : [ 0, 1 ]
										}, {
											targets : [ 1 ],
											orderData : [ 1, 0 ]
										}, {
											targets : [ 4 ],
											orderData : [ 4, 0 ]
										}
										],


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
					
					$(window).resize( function () {
						  table.fnAdjustColumnSizing();
						} );
						
					// BARRA DE BOTONES AÑADIR/QUITAR/MODIFICAR/ZOOM
					$("div.toolbar")
							.html(
									"<button id='addRowButton' class='btn btn-default' "
											+ "data-toggle='tooltip' data-placement='bottom' title='Add'><img src='"
											+ "../css/images/add.png' width='20' height='20'  /> "
											+ "<button id='editRowButton' class='btn btn-default'	 data-toggle='tooltip' "
											+ "data-placement='bottom' title='Edit'> <img src='../css/images/edit.png' width='20'"
											+ " height='20'/>  "
											+ " <button id='deleteRowButton' class='btn btn-default'	"
											+ " data-toggle='tooltip' data-placement='bottom' title='Delete'> "
											+ "<img src='../css/images/delete.png' width='20' height='20' /> "
											+ "<button id='zoomButton' class='btn btn-default'	"
											+ " data-toggle='tooltip' data-placement='bottom' "
											+ "title='Zoom'> <img src='../images/text_page.png' "
											+ "width='20' height='20'/>");

					// PERSONALIZADO DE LA TABLA
					$(".dataTables_empty").text("");
					$(".dataTables_empty")
							.append(
									"<img src='../images/database.png' width='25' height='25'></img>");
					$("#ToolTables_table_0")
							.children()
							.replaceWith(
									"<img src='../images/copy_paste.png' width='25' height='25'></img>");
					$("#ToolTables_table_1")
							.children()
							.replaceWith(
									"<img src='../images/csv_file.png' width='25' height='25'></img>");
					$("#ToolTables_table_2").replaceWith("");
					$("#ToolTables_table_3")
							.children()
							.replaceWith(
									"<img src='../images/pdf_file.png' width='25' height='25'></img>");
					$("#ToolTables_table_4")
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
					// Desabilitar botones
					$("#deleteRowButton").prop('disabled', true);
					$("#editRowButton").prop('disabled', true);
					$('#table tbody').on('click', 'tr', function() {
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
					console.log(table);
					

					
					$("#addRowButton").click(function() {
						$(".insert").click();
						$(".btn-change").attr("src","../css/images/add.png");
					});
					
					//AÑadir FILA
					$(".btn-change").click(function(){
						$("#modal").modal("hide");
					});
					$("#editRowButton").click(function() {
						if ($("tr").hasClass("selected")) {
							var size = ($(".selected").size());
							if (size == 1) {
								$("#editRowButton").prop('disabled', false);
								var id = $(".selected")[0].id;
								$("." + id).click();
							}
						}
					});
					$("#deleteRowButton").click(function() {
						$('#modalDelete').modal('show');
					});
					$("#confirmDeleteButton")
							.click(
									function() {
										if ($("tr").hasClass("selected")) {
											$("#modalDelete").modal("show");
											var size = ($(".selected").size());
											for (var i = 0; i < size; i++) {
												var id = $(".selected")[i].id;
												$
														.post(window.location.pathname +":delete/"
																+ id);
												$("#" + id).hide();
												$("#modalDelete").modal("hide");
											}
										}
									});

					// Cambia el tamaño de todas las paginas para el boton de
					// impresion
					$("#ToolTables_table_4")
							.click(
									function() {
										if (zoom == 0) {
											$(".textZoom")
													.attr("style",
															"font-size:14px; text-align:left;");
										} else if (zoom == 1) {
											$(".textZoom")
													.attr("style",
															"font-size:8px; text-align:left;");
										} else if (zoom == 2) {
											$(".textZoom")
													.attr("style",
															"font-size:10px; text-align:left;");
										} else if (zoom == 3) {
											$(".textZoom")
													.attr("style",
															"font-size:12px; text-align:left;");
										}
									});
					// Cambia el tamaño de letra de las filas
					$("#zoomButton")
							.click(
									function() {
										console.log(this);
										console.log(zoom);
										if (zoom == 0) {
											$(".textZoom")
													.attr("style",
															"font-size:14px;");
											zoom++;
										} else if (zoom == 1) {
											$(".textZoom")
													.attr("style",
															"font-size:8px;");
											zoom++;
										} else if (zoom == 2) {
											$(".textZoom")
													.attr("style",
															"font-size:10px;");
											zoom++;
										} else if (zoom = 3) {

											$(".textZoom")
													.attr("style",
															"font-size:12px;");
											zoom = 0;

										}
										console.log(zoom);
									});

					// CAMBIOS EN NAVBAR
					$("#activemenu")
							.replaceWith(
									"<li id='disablemenu' class='disable'><a href='/restaurant/?showFavorites=false&showHistory=false'>"
											+ $("#activemenu").text()
											+ "</a></li>");
					var url = window.location.pathname;
					if (url == "/restaurant/masterfiles/masterdishgroup") {
						$("#headernav ol")
								.append(
										"<li class='disable' name='A'> <a href='/restaurant/?showFavorites=false&showHistory=false&option=A'>"
												+ "Mantenimiento de ficheros maestros"
												+ "</a></li>"
												+ "<li class='active' name='1'>"
												+ "Grupos a la carta" + "</li>");
					} else if (url == "/restaurant/masterfiles/masterclient") {
						$("#headernav ol")
								.append(
										"<li class='disable' name='A'> <a href='/restaurant/?showFavorites=false&showHistory=false&option=A'>"
												+ "Mantenimiento de ficheros maestros"
												+ "</a></li>"
												+ "<li class='active' name='1'>"
												+ "Fichero de clientes"
												+ "</li>");
					}

					$(document)
							.keyup(
									function(e) {

										if (e.keyCode == 27) {
											$(location)
													.attr('href',
															'/restaurant/?showFavorites=false&showHistory=false?option=A');
										}
									});
				});