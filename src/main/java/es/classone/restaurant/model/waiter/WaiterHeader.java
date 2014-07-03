package es.classone.restaurant.model.waiter;


public class WaiterHeader {
	private int waiterId;// R1CAM001
	private String waiterName;// R1CAM002
	private String waiterZip;// R1CAM004
	private String waiterDNI;// R1CAM007
	private String waiterPhone;// R1CAM008
	public WaiterHeader(int waiterId, String waiterName, String waiterZip,
			String waiterDNI, String waiterPhone) {
		this.waiterId = waiterId;
		this.waiterName = waiterName;
		this.waiterZip = waiterZip;
		this.waiterDNI = waiterDNI;
		this.waiterPhone = waiterPhone;

	}
	public int getWaiterId() {
		return waiterId;
	}
	public void setWaiterId(int waiterId) {
		this.waiterId = waiterId;
	}
	public String getWaiterName() {
		return waiterName;
	}
	public void setWaiterName(String waiterName) {
		this.waiterName = waiterName;
	}
	public String getWaiterZip() {
		return waiterZip;
	}
	public void setWaiterZip(String waiterZip) {
		this.waiterZip = waiterZip;
	}
	public String getWaiterDNI() {
		return waiterDNI;
	}
	public void setWaiterDNI(String waiterDNI) {
		this.waiterDNI = waiterDNI;
	}
	public String getWaiterPhone() {
		return waiterPhone;
	}
	public void setWaiterPhone(String waiterPhone) {
		this.waiterPhone = waiterPhone;
	}

	
}
