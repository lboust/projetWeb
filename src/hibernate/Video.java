package hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "video")

public class Video {
	// instance fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id; // clé
		
	@Column(name="title")
	private String title; // titre de la vidéo
	
	@Column(name="url")
	private String url; // lien youtube
	
	@Column(name="duration")
	private int duration; // durée totale de la vidéo en s
	
	@Column(name="publicationdate")
	private String publicationDate; // date et heure de publication
	
	//private User author; // nom du membre MyTube qui a publié la vidéo
	
	@Column(name="type")
	private String type; // type de vidéo
	
	@Column(name="nomberofviews")
	private long numberOfViews; // nombre de vues de la vidéo
	
	@Column(name="numberofcomments")
	private int numberOfComments; // nombre de commentaires d'une vidéo
	
	@Column(name="capture")
	private String capture; // src de la miniature
	
	@Column(name="description")
	private String description; // texte de description
	
	@Column(name = "user_id")
	private Integer user_id; // clé vers l'auteur
	
	
	
	//private List<Comment> comments; // liste des commentaires

}
