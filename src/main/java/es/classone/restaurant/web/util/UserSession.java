package es.classone.restaurant.web.util;


public class UserSession {

	private int userProfileId;
	private char userPrivilege;
	private String ipIn;
	private String ipExt;
	private String macAddress;
	private String persPath;

	public int getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}

	public char getUserPrivilege() {
		return userPrivilege;
	}

	public void setUserPrivilege(char userPrivilege) {
		this.userPrivilege = userPrivilege;
	}

	public String getIpIn() {
		return ipIn;
	}

	public void setIpIn(String ipIn) {
		this.ipIn = ipIn;
	}

	public String getIpExt() {
		return ipExt;
	}

	public void setIpExt(String ipExt) {
		this.ipExt = ipExt;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
	
	public String getPersPath(){
		return persPath;
	}
	
	public void setPersPath(String persPath){
		this.persPath=persPath;
	}

}
