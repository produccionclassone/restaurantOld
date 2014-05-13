<!--//--><![CDATA[//><!--
 
function cambiarpropiedad()
{
	/*Utilizamos una función if para que, al volver a clicar el botón, vuelva a verse el texto*/
	if (document.getElementById('waitDiv').style.display == 'none')
	{
		document.getElementById('waitDiv').style.display = 'block';
		document.getElementById('input').style.display = 'none';
	} else
	{
		document.getElementById('waitDiv').style.display = 'none';
	}
}
//--><!]]>

<!--//--><![CDATA[//><!--
 
function cambiarpropiedad2()
{
	/*Utilizamos una función if para que, al volver a clicar el botón, vuelva a verse el texto*/
	if (document.getElementById('waitDiv2').style.display == 'none')
	{
		document.getElementById('waitDiv2').style.display = 'block';
		document.getElementById('input2').style.display = 'none';
	} else
	{
		document.getElementById('waitDiv2').style.display = 'none';
	}
}
//--><!]]>

<!--//--><![CDATA[//><!--

startList = function() {
	if (document.getElementById) {
		navRoot = document.getElementById("nav");
		for (i=0; i<navRoot.childNodes.length; i++) {
			node = navRoot.childNodes[i];
			if (node.nodeName=="LI") {
				node.onclick=function() {this.className = (this.className == "on") ? "off" : "on";}
   			}
  		}
   	} 	
}

//--><!]]>

<!--//--><![CDATA[//><!--

startList = function() {
	if (document.getElementById) {
		navRoot = document.getElementById("nav");
		for (i=0; i<navRoot.childNodes.length; i++) {
			node = navRoot.childNodes[i];
			if (node.nodeName=="LI") {
				node.onclick=function() {
											if(this.className == "on") { this.className = "off";}
										 	else { this.className = "on";
												   	navRoot = document.getElementById("nav");
												   for (i=0; i<navRoot.childNodes.length; i++) {
												      node = navRoot.childNodes[i];
												      if (node.nodeName=="LI") {
												      		if(node.id != this.id) {node.className="off";}
													  }
												   }
										 		 }
										}
   			}
  		}
  		
  		navRoot2 = document.getElementById("nav2");
		for (j=0; j<navRoot2.childNodes.length; j++) {
			node2 = navRoot2.childNodes[j];
			if (node2.nodeName=="LI") {
				node2.onclick=function() {
											if(this.className == "on2") { this.className = "off2"; }
										 	else { this.className = "on2";
												   navRoot = document.getElementById("nav2");
												   for (i=0; i<navRoot.childNodes.length; i++) {
												      node = navRoot.childNodes[i];
												      if (node.nodeName=="LI") {
												      		if(node.id != this.id) {node.className="off2";}
													  }
												   }
												   navRoot2 = document.getElementById("nav");
												   for (j=0; j<navRoot2.childNodes.length; j++) {
												   	node2 = navRoot2.childNodes[j];
														if (node2.nodeName=="LI") {
															if(node2.id == "opcion1") {node2.className="off";}
														}
												   }																			 	
										 		 }
										}
   			}
  		}
  		
  		navRoot3 = document.getElementById("nav2");
		for (j=0; j<navRoot3.childNodes.length; j++) {
			node3 = navRoot3.childNodes[j];
				if (node3.nodeName=="LI") {node3.className="off2";}
		}
   	} 	
}

window.onload=startList;
//--><!]]>