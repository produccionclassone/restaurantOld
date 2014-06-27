var editor;
var zoom = 0;
$(document)
		.ready(
				function() {
					$(".progress").show();
					var table = $('#example')
							.dataTable(
									{
										"sDom" : '<"row top"TfC  <"toolbar">>Rrt<"bottom"lp>',
										"lengthMenu" : [ [ 25, 50, 100, -1 ],
												[ 25, 50, 100, "*" ] ],
										stateSave : true,
										columnDefs : [ {
											targets : [ 0 ],
											orderData : [ 0, 1 ]
										}, {
											targets : [ 1 ],
											orderData : [ 1, 0 ]
										}, {
											targets : [ 4 ],
											orderData : [ 4, 0 ]
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
					$("div.toolbar")
							.html(
									"<button id='addRowButton' class='btn btn-default' data-toggle='tooltip' data-placement='bottom' title='Add'><img src='../css/images/add.png' width='20' height='20'  /></button> <button id='editRowButton' class='btn btn-default'	 data-toggle='tooltip' data-placement='bottom' title='Edit'> <img src='../css/images/edit.png' width='20' height='20' /> </button> <button id='deleteRowButton' class='btn btn-default'	 data-toggle='tooltip' data-placement='bottom' title='Delete'> <img src='../css/images/delete.png' width='20' height='20' /> </button><button id='zoomButton' class='btn btn-default'	 data-toggle='tooltip' data-placement='bottom' title='Zoom'> <img src='../images/text_page.png' width='20' height='20' /> </button>");
					new $.fn.dataTable.FixedHeader(table);

					$(".FixedHeader_Cloned")[0].style["cssText"] = $(".FixedHeader_Cloned")[0].style["cssText"]
							.replace("absolute", "relative");

					$(".dataTables_empty").text("");
					$(".dataTables_empty")
							.append(
									"<img src='../images/database.png' width='25' height='25'></img>");
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
						if (size == 0) {
							$("#deleteRowButton").prop('disabled', true);
							$("#editRowButton").prop('disabled', true);
						} else if (size == 1)
							$("#editRowButton").prop('disabled', false);
						else if (size != 1)
							$("#editRowButton").prop('disabled', true);
					});
					$(".top")
							.append(
									"<div class='row' style='margin-top:50px; margin-left:350px; width:250px;'><div class='progress progress-striped active'><div class='bar progress-bar' style='width: 0%;'></div></div>");

					//PROGRESS BAR 
					var progress = setInterval(function() {
						var $bar = $('.progress-bar');
						console.log($bar.width());
						if ($bar.width() == 250) {
							$(".progress").hide();
							$("div.row.top").height(30);
							$("#example").show();
							clearInterval(progress);
							$('.progress').removeClass('active');
							console.log($(".top"));

						} else {
							console.log($(".top"));
							$bar.width(250);
						}
					}, 50);
					
					
					$("#addRowButton").click(function() {
						$("#modalCreate").modal("show");
					});

					$("#editRowButton").click(function() {
						if ($("tr").hasClass("selected")) {
							var size = ($(".selected").size());
							if (size == 1) {
								$("#editRowButton").prop('disabled', false);
								var id = $(".selected")[0].id;
								$("."+id).click();

							}
						}

					});

					$("#deleteRowButton").click(function() {
						if ($("tr").hasClass("selected")) {
							$("#modalDelete").modal("show");
							var size = ($(".selected").size());
							for (var i = 0; i < size; i++) {
								var id = $(".selected")[i].id;
								$.post( "/restaurant/masterfiles/masterclient:delete/"+id);
								$("#"+id).hide();
							}		
						}
					});
					//Cambia el tamaño de letra de las filas
					$("#zoomButton").click(
							function() {
								console.log(this);
								console.log(zoom);
								if (zoom == 0) {
									$(".textZoom").attr("style",
											"font-size:14px; text-align:left;");
									zoom++;
								}
								else if (zoom == 1) {
									$(".textZoom").attr("style",
											"font-size:8px; text-align:left;");
									zoom++;
								}
								else if (zoom == 2) {
									$(".textZoom").attr("style",
											"font-size:10px; text-align:left;");
									zoom++;
								}
								else if (zoom = 3) {
									
										$(".textZoom").attr("style",
												"font-size:12px; text-align:left;");
										zoom = 0;

								}
								console.log(zoom);
							});
					$("#activemenu")
							.replaceWith(
									"<li id='disablemenu' class='disable'><a href='/restaurant/?showFavorites=false&showHistory=false'>"
											+ $("#activemenu").text()
											+ "</a></li>");
					$("#headernav ol")
							.append(
									"<li class='disable' name='A'> <a href='/restaurant/?showFavorites=false&showHistory=false&option=A'>"
											+ "Mantenimiento de ficheros maestros"
											+ "</a></li>"
											+ "<li class='active' name='1'>"
											+ "Grupos a la carta" + "</li>");
					$(document)
							.keyup(
									function(e) {

										if (e.keyCode == 27) {
											$(location)
													.attr('href',
															'/restaurant/?showFavorites=false&showHistory=false?option=A');
										}
									});

					$('#modalEdit').on('shown.bs.modal', function() {
						$('#clientName').focus();
					});

				});