package es.classone.restaurant.model.favorite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import es.classone.restaurant.model.userprofile.UserProfile;

@Entity
@Table(name = "Res14fav")
public class Favorite {

	private int favoriteId;
	private String useCase;
	private String path;
	private UserProfile userProfile;

	public Favorite() {
	}

	public Favorite(String useCase,String path) {
		this.useCase= useCase;
		this.path=path;
	}

	@Column(name = "R1FAV001")
	@SequenceGenerator( // It only takes effect for
	name = "FavoriteIdGenerator", // databases providing identifier
	sequenceName = "FavoriteSeq")
	// generators.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "FavoriteIdGenerator")
	public int getFavoriteId() {
		return favoriteId;
	}

	public void setFavoriteId(int favoriteId) {
		this.favoriteId = favoriteId;
	}

	@Column(name = "R1FAV002")
	public String getUseCase() {
		return useCase;
	}

	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "Res14usr_R1USR001_K1")
	public UserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	@Column(name = "R1FAV003")
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}
// CREATE TABLE IF NOT EXISTS `ayx14res`.`Res14fav` (
// `R1FAV001` INT NOT NULL,
// `R1FAV002` INT NOT NULL,
// `Res14usr_R1USR001_K1` INT NOT NULL,