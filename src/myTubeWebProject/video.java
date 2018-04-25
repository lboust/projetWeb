package myTubeWebProject;

public class Video {
	//instance fields
	private String title; // titre de la vidéo
	private String url; // lien youtube
	private int duration; // durée totale de la vidéo en s
	private String description; // texte de description
	private String publicationDate; //date et heure de publication
	private String author; //nom du membre MyTube qui a publié la vidéo
	private String type; // type de vidéo
	private String format; // format de vidéo
	private long numberOfViews; //nombre de vues de la vidéo
	private int numberOfComments; //nombre de commentaires d'une vidéo
	private int id; //clé
	private String capture; //src de la miniature
	//methods
	//lit la vidéo à un certain temps
	public void play(int playingTime) {

	}
	//lit la vidéo suivante dans la playlist
	public void next() {

	}
	
	//règle le son
	public void sound(){
		
	}
	
	//règles les paramètres de lecture
	public void parameters() {
		
	}
	
	//règle le mode de lecture
	public void mode() {
		
	}
	
	//règle l'affichage plein écran
	public void fullScreen() {
		
	}
	
	//like ou don't like la vidéo
	public void likeVideo() {
		
	}
	
	//partage la vidéo
	public void share() {
		
	}
	
	//passe l'annonce de la vidéo
	public void skip() {
		
	}
	
	//ajout de la vidéo à la playlist
	public void addToPlaylist() {
		
	}
	
	//signale la vidéo
	public void report() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}


	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public long getNumberOfViews() {
		return numberOfViews;
	}
	public void setNumberOfViews(long numberOfViews) {
		this.numberOfViews = numberOfViews;
	}
	public int getNumberOfComments() {
		return numberOfComments;
	}
	public void setNumberOfComments(int numberOfComments) {
		this.numberOfComments = numberOfComments;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCapture() {
		return capture;
	}
	public void setCapture(String capture) {
		this.capture = capture;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	/*public Video(String title, String url, int duration, String description, String publicationDate, String author,
			String type, String format, long numberOfViews, int numberOfComments, int id, String capture) {
		super();
		this.title = title;
		this.url = url;
		this.duration = duration;
		this.description = description;
		this.publicationDate = publicationDate;
		this.author = author;
		this.type = type;
		this.format = format;
		this.numberOfViews = numberOfViews;
		this.numberOfComments = numberOfComments;
		this.id = id;
		this.capture = capture;
	}*/

}
