package myTubeWebProject;


public class Comment {
	//instance fields
	private String message; //texte du commentaire
	//methods
	// montre l'auteur du commentaire
	public void showWriter() {
		
	}
	//like le commentaire
	public void likeComment() {
		
	}
	//répond au comentaire par un commentaire
	public Comment answer(String message) {
		Comment answerToComment = new Comment();
		answerToComment.message = message;
		return answerToComment;
	}
	//montre les réponses à un commentaire
	public void showAnswers() {
		
	}
}
