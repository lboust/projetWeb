package myTubeWebProject;


public class Comment {
	//instance fields
	private int id;
	private String message; //texte du commentaire
	
	//constructor

	public Comment(int id, String message) {
		super();
		this.id = id;
		this.message = message;
	}
	
	//getters and setters 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
