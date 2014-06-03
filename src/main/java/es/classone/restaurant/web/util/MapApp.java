package es.classone.restaurant.web.util;
import java.util.ArrayList;

public class MapApp {
	private static MapApp instance = null;
	private ArrayList<Option> map = new ArrayList<>();

	protected MapApp() {
		map.add(0, new Option("1", " ", true));
		map.add(1, new Option("2", " ", false));
		map.add(2, new Option("3", " ", true));
		map.add(3, new Option("4", " ", true));
		map.add(4, new Option("5", " ", true));
		map.add(5, new Option("6", " ", true));
		map.add(6, new Option("7", " ", true));
		map.add(7, new Option("A", " ", true));
		map.add(8, new Option("B", " ", true));
		map.add(9, new Option("C", " ", false));
		map.add(10, new Option("D", " ", false));
		map.add(11, new Option("E", " ", true));
		ArrayList<Option> submap1 = new ArrayList<>();
		submap1.add(new Option("1.1", " ", false));
		submap1.add(new Option("1.2", " ", false));
		submap1.add(new Option("1.3", " ", false));
		submap1.add(new Option("1.4", " ", false));
		submap1.add(new Option("1.5", " ", false));
		submap1.add(new Option("1.6", " ", false));
		submap1.add(new Option("1.7", " ", false));
		submap1.add(new Option("1.8", " ", false));
		map.get(0).setOptions(submap1);
		ArrayList<Option> submap3 = new ArrayList<>();
		submap3.add(new Option("3.1", " ", false));
		submap3.add(new Option("3.2", " ", false));
		submap3.add(new Option("3.3", " ", false));
		submap3.add(new Option("3.4", " ", false));
		submap3.add(new Option("3.5", " ", false));
		submap3.add(new Option("3.6", " ", false));
		submap3.add(new Option("3.7", " ", false));
		map.get(2).setOptions(submap3);
		ArrayList<Option> submap4 = new ArrayList<>();
		submap4.add(new Option("4.1", " ", false));
		submap4.add(new Option("4.2", " ", false));
		submap4.add(new Option("4.3", " ", false));
		submap4.add(new Option("4.4", " ", false));
		submap4.add(new Option("4.5", " ", false));
		submap4.add(new Option("4.6", " ", false));
		submap4.add(new Option("4.7", " ", false));
		submap4.add(new Option("4.8", " ", false));
		submap4.add(new Option("4.A", " ", false));
		submap4.add(new Option("4.B", " ", false));
		submap4.add(new Option("4.C", " ", false));
		submap4.add(new Option("4.D", " ", false));
		submap4.add(new Option("4.E", " ", false));
		map.get(3).setOptions(submap4);
		ArrayList<Option> submap5 = new ArrayList<>();
		submap5.add(new Option("5.1", " ", false));
		submap5.add(new Option("5.2", " ", false));
		submap5.add(new Option("5.3", " ", false));
		submap5.add(new Option("5.4", " ", false));
		submap5.add(new Option("5.5", " ", false));
		submap5.add(new Option("5.6", " ", false));
		submap5.add(new Option("5.7", " ", false));
		submap5.add(new Option("5.8", " ", false));
		submap5.add(new Option("4.A", " ", false));
		submap5.add(new Option("4.B", " ", false));
		map.get(4).setOptions(submap5);
		ArrayList<Option> submap6 = new ArrayList<>();
		submap6.add(new Option("6.1", " ", false));
		submap6.add(new Option("6.2", " ", false));
		submap6.add(new Option("6.3", " ", false));
		submap6.add(new Option("6.4", " ", false));
		submap6.add(new Option("6.5", " ", false));
		submap6.add(new Option("6.6", " ", false));
		map.get(5).setOptions(submap6);
		ArrayList<Option> submap7 = new ArrayList<>();
		submap7.add(new Option("7.1", " ", false));
		submap7.add(new Option("7.2", " ", false));
		submap7.add(new Option("7.3", " ", false));
		submap7.add(new Option("7.4", " ", false));
		map.get(6).setOptions(submap7);
		ArrayList<Option> submapA = new ArrayList<>();
		submapA.add(new Option("A.1", " ", false));
		submapA.add(new Option("A.2", " ", false));
		submapA.add(new Option("A.3", " ", false));
		submapA.add(new Option("A.4", " ", false));
		submapA.add(new Option("A.5", " ", false));
		submapA.add(new Option("A.6", " ", false));
		submapA.add(new Option("A.7", " ", false));
		submapA.add(new Option("A.8", " ", false));
		map.get(7).setOptions(submapA);
		ArrayList<Option> submapB = new ArrayList<>();
		submapB.add(new Option("B.1", " ", false));
		submapB.add(new Option("B.3", " ", false));
		submapB.add(new Option("B.4", " ", false));
		submapB.add(new Option("B.5", " ", false));
		submapB.add(new Option("B.6", " ", false));
		submapB.add(new Option("B.7", "/restaurant/", false));
		map.get(8).setOptions(submapB);
		ArrayList<Option> submapE = new ArrayList<>();
		submapE.add(new Option("E.1", " ", false));
		submapE.add(new Option("E.2", " ", false));
		submapE.add(new Option("E.3", " ", false));
		submapE.add(new Option("E.4", " ", false));
		submapE.add(new Option("E.5", " ", false));
		submapE.add(new Option("E.6", " ", false));
		submapE.add(new Option("E.7", " ", false));
		submapE.add(new Option("E.8", " ", false));
		submapE.add(new Option("E.9", " ", false));
		map.get(11).setOptions(submapE);
	}

	public static MapApp getInstance() {
		if (instance == null) {
			instance = new MapApp();
		}
		return instance;
	}

	public void setOptionName(String option, String name) {
		for (Option o : map) {
			if (o.getOption().equals(option)) {
				o.setOptionName(name);
			}
			if (o.isParent()) {
				
				ArrayList<Option> subOptions=o.getOptions();
				for (Option so : subOptions) {
					if (so.getOption().equals(option)) {
						so.setOptionName(name);
					}
				}
			}
		}
	}

	public ArrayList<Option> getMapApp() {
		return map;
	}

	// GET OPTION BY INDEX
}
