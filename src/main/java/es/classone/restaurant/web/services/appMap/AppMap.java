package es.classone.restaurant.web.services.appMap;

import java.util.ArrayList;

import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;

public class AppMap {
	@Inject
	Messages messages;

	private ArrayList<Option> map;

	public AppMap() {
		map = new ArrayList<Option>();
		map.add(1,new Option("1"," ", true, messages.get("option1")));
		map.add(2,new Option("2"," ", false, messages.get("option2")));
		map.add(3,new Option("3"," ", true, messages.get("option3")));
		map.add(4,new Option("4"," ", true, messages.get("option4")));
		map.add(5,new Option("5"," ", true, messages.get("option5")));
		map.add(6,new Option("6"," ", true, messages.get("option6")));
		map.add(7,new Option("7"," ", true, messages.get("option7")));
		map.add(8,new Option("A"," ", true, messages.get("optiona")));
		map.add(9,new Option("B"," ", true, messages.get("optionb")));
		map.add(10,new Option("C"," ", false, messages.get("optionc")));
		map.add(11,new Option("D"," ", false, messages.get("optiond")));
		map.add(12,new Option("E"," ", true, messages.get("optione")));
		ArrayList<Option> submap = new ArrayList<>();
		submap.add(new Option("1.1"," ",false,messages.get("option11")));
		submap.add(new Option("1.2"," ",false,messages.get("option12")));
		submap.add(new Option("1.3"," ",false,messages.get("option13")));
		submap.add(new Option("1.4"," ",false,messages.get("option14")));
		submap.add(new Option("1.5"," ",false,messages.get("option15")));
		submap.add(new Option("1.6"," ",false,messages.get("option16")));
		submap.add(new Option("1.7"," ",false,messages.get("option17")));
		submap.add(new Option("1.8"," ",false,messages.get("option18")));
		map.get(1).setOptions(submap);
		submap.clear();
		submap.add(new Option("3.1"," ",false,messages.get("option31")));
		submap.add(new Option("3.2"," ",false,messages.get("option32")));
		submap.add(new Option("3.3"," ",false,messages.get("option33")));
		submap.add(new Option("3.4"," ",false,messages.get("option34")));
		submap.add(new Option("3.5"," ",false,messages.get("option35")));
		submap.add(new Option("3.6"," ",false,messages.get("option36")));
		submap.add(new Option("3.7"," ",false,messages.get("option37")));
		map.get(3).setOptions(submap);
		submap.clear();
		submap.add(new Option("4.1"," ",false,messages.get("option41")));
		submap.add(new Option("4.2"," ",false,messages.get("option42")));
		submap.add(new Option("4.3"," ",false,messages.get("option43")));
		submap.add(new Option("4.4"," ",false,messages.get("option44")));
		submap.add(new Option("4.5"," ",false,messages.get("option45")));
		submap.add(new Option("4.6"," ",false,messages.get("option46")));
		submap.add(new Option("4.7"," ",false,messages.get("option47")));
		submap.add(new Option("4.8"," ",false,messages.get("option48")));
		submap.add(new Option("4.A"," ",false,messages.get("option4a")));
		submap.add(new Option("4.B"," ",false,messages.get("option4b")));
		submap.add(new Option("4.C"," ",false,messages.get("option4c")));
		submap.add(new Option("4.D"," ",false,messages.get("option4d")));
		submap.add(new Option("4.E"," ",false,messages.get("option4e")));
		map.get(4).setOptions(submap);
		submap.clear();
		submap.add(new Option("5.1"," ",false,messages.get("option51")));
		submap.add(new Option("5.2"," ",false,messages.get("option52")));
		submap.add(new Option("5.3"," ",false,messages.get("option53")));
		submap.add(new Option("5.4"," ",false,messages.get("option54")));
		submap.add(new Option("5.5"," ",false,messages.get("option55")));
		submap.add(new Option("5.6"," ",false,messages.get("option56")));
		submap.add(new Option("5.7"," ",false,messages.get("option57")));
		submap.add(new Option("5.8"," ",false,messages.get("option58")));
		submap.add(new Option("4.A"," ",false,messages.get("option5a")));
		submap.add(new Option("4.B"," ",false,messages.get("option5b")));
		map.get(5).setOptions(submap);
		submap.clear();
		submap.add(new Option("6.1"," ",false,messages.get("option61")));
		submap.add(new Option("6.2"," ",false,messages.get("option62")));
		submap.add(new Option("6.3"," ",false,messages.get("option63")));
		submap.add(new Option("6.4"," ",false,messages.get("option64")));
		submap.add(new Option("6.5"," ",false,messages.get("option65")));
		submap.add(new Option("6.6"," ",false,messages.get("option66")));
		map.get(6).setOptions(submap);
		submap.clear();
		submap.add(new Option("7.1"," ",false,messages.get("option71")));
		submap.add(new Option("7.2"," ",false,messages.get("option72")));
		submap.add(new Option("7.3"," ",false,messages.get("option73")));
		submap.add(new Option("7.4"," ",false,messages.get("option74")));
		map.get(7).setOptions(submap);
		submap.clear();
		submap.add(new Option("A.1"," ",false,messages.get("optiona1")));
		submap.add(new Option("A.2"," ",false,messages.get("optiona2")));
		submap.add(new Option("A.3"," ",false,messages.get("optiona3")));
		submap.add(new Option("A.4"," ",false,messages.get("optiona4")));
		submap.add(new Option("A.5"," ",false,messages.get("optiona5")));
		submap.add(new Option("A.6"," ",false,messages.get("optiona6")));
		submap.add(new Option("A.7"," ",false,messages.get("optiona7")));
		submap.add(new Option("A.8"," ",false,messages.get("optiona8")));
		map.get(8).setOptions(submap);
		submap.clear();
		submap.add(new Option("B.1"," ",false,messages.get("optionb1")));
		submap.add(new Option("B.3"," ",false,messages.get("optionb3")));
		submap.add(new Option("B.4"," ",false,messages.get("optionb4")));
		submap.add(new Option("B.5"," ",false,messages.get("optionb5")));
		submap.add(new Option("B.6"," ",false,messages.get("optionb6")));
		submap.add(new Option("B.7","/restaurant/",false,messages.get("optionb7")));
		map.get(9).setOptions(submap);
		submap.clear();
		submap.add(new Option("E.1"," ",false,messages.get("optione1")));
		submap.add(new Option("E.2"," ",false,messages.get("optione2")));
		submap.add(new Option("E.3"," ",false,messages.get("optione3")));
		submap.add(new Option("E.4"," ",false,messages.get("optione4")));
		submap.add(new Option("E.5"," ",false,messages.get("optione5")));
		submap.add(new Option("E.6"," ",false,messages.get("optione6")));
		submap.add(new Option("E.7"," ",false,messages.get("optione7")));
		submap.add(new Option("E.8"," ",false,messages.get("optione8")));
		submap.add(new Option("E.9"," ",false,messages.get("optione9")));
		map.get(12).setOptions(submap);
		submap.clear();
	}
	
	public ArrayList<Option> getMap(){
		return map;
	}
	
}
