package es.classone.restaurant.web.util;

import java.util.ArrayList;

public class Option {

	private String option;
	private String path;
	private boolean parent;
	private String optionName;
	private ArrayList<Option> options;
	
	public Option(String option,String name, String path, boolean parent) {
		this.option = option;
		this.parent = parent;
		this.path=path;
		this.optionName=name;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public ArrayList<Option> getOptions() {
		return options;
	}

	public void setOptions(ArrayList<Option> options) {
		this.options = options;
	}

	public boolean isParent() {
		return parent;
	}

	public void setParent(boolean parent) {
		this.parent = parent;
	}
}
