package es.classone.restaurant.model.history;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import es.classone.restaurant.model.userprofile.UserProfile;

public class History {
	private int historyId;
	private int useCase;
	private UserProfile userProfile;
	
	
	public History(){

	}

	@Column(name = "R1HIS001")
	@SequenceGenerator( // It only takes effect for
	name = "historyIdGenerator", // databases providing identifier
	sequenceName = "HistorySeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "historyIdGenerator")
	public int gethistoryId() {
		return historyId;
	}


	public void sethistoryId(int historyId) {
		this.historyId = historyId;
	}

	@Column(name = "R1HIS002")
	public int getUseCase() {
		return useCase;
	}


	public void setUseCase(int useCase) {
		this.useCase = useCase;
	}

	@Column(name = "Res14usr_R1USR001_K1")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "R1USR001_K1")
	public UserProfile getUserProfile() {
		return userProfile;
	}


	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	
	
}
