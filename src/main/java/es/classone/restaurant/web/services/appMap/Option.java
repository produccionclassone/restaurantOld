package es.classone.restaurant.web.services.appMap;

import java.util.ArrayList;

public class Option {

	private String option;
	private String path;
	private boolean hasSubLevel;
	private String optionName;
	private ArrayList<Option> options;
	
	public Option(String option, String path, boolean hasSubLevel, String optionName) {
		this.option = option;
		this.hasSubLevel = hasSubLevel;
		this.optionName = optionName;
		this.path=path;
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

	public boolean isHasSubLevel() {
		return hasSubLevel;
	}

	public void setHasSubLevel(boolean hasSubLevel) {
		this.hasSubLevel = hasSubLevel;
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
}
