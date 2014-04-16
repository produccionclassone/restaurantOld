package es.classone.restaurant.web.util;


public class UserSession {

	private Long userProfileId;
	private String firstName;
	private char userPrivilege;
	private String ipIn;
	private String ipExt;
	private String macAddress;

	public Long getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(Long userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
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

}
