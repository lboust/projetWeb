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
	private int id; // cl�
		
	@Column(name="title")
	private String title; // titre de la vid�o
	
	@Column(name="url")
	private String url; // lien youtube
	
	@Column(name="duration")
	private int duration; // dur�e totale de la vid�o en s
	
	@Column(name="publicationdate")
	private String publicationDate; // date et heure de publication
	
	//private User author; // nom du membre MyTube qui a publi� la vid�o
	
	@Column(name="type")
	private String type; // type de vid�o
	
	@Column(name="nomberofviews")
	private long numberOfViews; // nombre de vues de la vid�o
	
	@Column(name="numberofcomments")
	private int numberOfComments; // nombre de commentaires d'une vid�o
	
	@Column(name="capture")
	private String capture; // src de la miniature
	
	@Column(name="description")
	private String description; // texte de description
	
	@Column(name = "user_id")
	private Integer user_id; // cl� vers l'auteur
	
	
	
	//private List<Comment> comments; // liste des commentaires

}
