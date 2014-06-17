package es.classone.restaurant.web.util;

import java.util.ArrayList;

public class MapApp {
	private static MapApp instance = null;
	private static ArrayList<Option> map;

	private MapApp() {
		 map = new ArrayList<>();
	}

	public static MapApp getInstance() {
		if (instance == null) {
			instance = new MapApp();
		}
		return instance;
	}

	public static void setOptionName(String option, String name, String path) { 
		if (map.isEmpty())
			map.add(new Option(option,name, path, false));

		for (Option o : map) {
			if (o.getOption().equals(option)) {
				return;
			}
		}
		if (option.contains(".")) {
			Option optionParent = getOptionObjByOption(option.substring(0, 1));
			if (!optionParent.isParent()) {
				ArrayList<Option> submap = new ArrayList<>();
				optionParent.setParent(true);
				submap.add(new Option(option,name, path, false));
				optionParent.setOptions(submap);
			} else {
				ArrayList<Option> submap = optionParent.getOptions();
				for (Option so : submap) {
					if (so.getOption().equals(option)) {
						return;
					}
				}
				submap.add(new Option(option,name, path, false));
			}
		} else {
			map.add(new Option(option,name, path, false));
		}

	}

	public static Option getOptionObjByOption(String option) {
		for (Option o : map) {
			if (o.getOption().equals(option)) {
				return o;
			}
			if (o.isParent()){
				for (Option so: o.getOptions()){
					if (so.getOption().equals(option)) {
						return so;
					}
				}
			}
		}
		return null;
	}

	public static ArrayList<Option> getMapApp() {
		return map;
	}
}
