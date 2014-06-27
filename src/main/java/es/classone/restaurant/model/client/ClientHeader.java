package es.classone.restaurant.model.client;

public class ClientHeader {
		private Long clientId; 
		private String clientName; 
		private String clientZipCode; 
		private String clientDNI; 
		private String clientPhoneContact; 


		public ClientHeader(Long clientId, String clientName, String clientZipCode,
				String clientDNI, String clientPhoneContact) {

			this.clientId = clientId;
			this.clientName = clientName;
			this.clientZipCode = clientZipCode;
			this.clientDNI = clientDNI;
			this.clientPhoneContact = clientPhoneContact;
		}

	
		public Long getClientId() {
			return clientId;
		}

		public void setClientId(Long clientId) {
			this.clientId = clientId;
		}
		
		public String getClientName() {
			return clientName;
		}

		public void setClientName(String clientName) {
			this.clientName = clientName;
		}


		public String getClientZipCode() {
			return clientZipCode;
		}

		public void setClientZipCode(String clientZipCode) {
			this.clientZipCode = clientZipCode;
		}

		public String getClientDNI() {
			return clientDNI;
		}

		public void setClientDNI(String clientDNI) {
			this.clientDNI = clientDNI;
		}

		public String getClientPhoneContact() {
			return clientPhoneContact;
		}

		public void setClientPhoneContact(String clientPhoneContact) {
			this.clientPhoneContact = clientPhoneContact;
		}	

	}
