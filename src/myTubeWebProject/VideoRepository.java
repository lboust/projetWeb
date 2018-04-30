package myTubeWebProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VideoRepository {
	//method mapResultSetToVideo
	// construit l'objet Video à partir des colonnes de la base de donnée
	private Video mapResultSetToVideo(ResultSet rsVideo) throws SQLException  {
		Video video = new Video();
		video.setId(rsVideo.getInt("video.id"));
		video.setTitle(rsVideo.getString("video.title"));
		video.setUrl(rsVideo.getString("video.url"));
		video.setDuration(rsVideo.getInt("video.duration"));
		video.setPublicationDate(rsVideo.getString("video.publicationDate"));
		video.setType(rsVideo.getString("video.type"));
		video.setNumberOfViews(rsVideo.getInt("video.numberofViews"));
		video.setCapture(rsVideo.getString("video.capture"));
		video.setDescription(rsVideo.getString("video.description"));
		video.setUser_id(rsVideo.getInt("video.user_id"));
		
		User author = new User(rsVideo.getInt("user.id"), rsVideo.getString("user.username"), rsVideo.getString("user.email"), rsVideo.getString("user.password"));
		video.setAuthor(author);
		
		List<Comment> commentList= new ArrayList<>();
		commentList = video.getComments();
		Comment comment = new Comment(rsVideo.getInt("commentary.id"), rsVideo.getString("commentary.message"));
		commentList.add(comment);
		video.setComments(commentList);
		
		return video;
	}
	//method findVideoById
	//trouve dans la base de données la vidéo correspondant à l'id
	public Video findVideoById(Integer id) {
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmtVideo = 
					conn.prepareStatement("SELECT video.id, video.title, video.url, video.duration, video.publicationDate, video.author, video.type, video.numberOfViews, video.numberOfComments, video.capture, video.description, video.user_id, user.id, user.username, user.email, user.password, commentary.id, commentary.message, commentary.user_id, commentary.video_id FROM user INNER JOIN video ON video.user_id = ? LEFT OUTER JOIN commentary ON video.id = commentary.video_id;");
			pstmtVideo.setInt(1, id);
			ResultSet rsVideo = pstmtVideo.executeQuery(); // ligne de la table video à l'id demandé
			
			if(! rsVideo.next()) { 
				return null; 
			}
			
			return mapResultSetToVideo(rsVideo);
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * method findAllVideos
	 * @return liste de toutes les videos
	 */
	public List<Video> findAllVideos() {
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {
			Statement stmt = conn.createStatement();			
			ResultSet rsVideo = stmt.executeQuery("SELECT video.id, video.title, video.url, video.duration, video.publicationDate, video.author, video.type, video.numberOfViews, video.numberOfComments, video.capture, video.description, video.user_id, user.id, user.username, user.email, user.password, commentary.id, commentary.message, commentary.user_id, commentary.video_id FROM user INNER JOIN video ON video.user_id = user.id LEFT OUTER JOIN commentary ON video.id = commentary.video_id;");
			
			
		
			List<Video> videoList = new ArrayList<>();
			
			while(rsVideo.next()) {			
				Video video = mapResultSetToVideo(rsVideo);
				videoList.add(video);
			}
			
			return videoList;
			
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	//method findTrending()
	//ajoute la video à la liste de videos tendances
	public List<Video> findTrending() {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT video.id, video.title, video.url, video.duration, video.publicationDate, video.author, video.type, video.numberOfViews, video.numberOfComments, video.capture, video.description, video.user_id, user.id, user.username, user.email, user.password FROM video INNER JOIN user ON video.user_id = user.id AND video.type= ?");
			pstmt.setString(1, "trending");

			ResultSet rsVideo = pstmt.executeQuery();
	
			List<Video> videoList = new ArrayList<>();
			
			while(rsVideo.next()) {			
				Video video = mapResultSetToVideo(rsVideo);
				videoList.add(video);
			}
			
			return videoList;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//method findRecommended()
	//ajoute la video à la liste de videos recommandées
	public List<Video> findRecommended() {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT video.id, video.title, video.url, video.duration, video.publicationDate, video.author, video.type, video.numberOfViews, video.numberOfComments, video.capture, video.description, video.user_id, user.id, user.username, user.email, user.password FROM video INNER JOIN user ON video.user_id = user.id AND video.type= ?");
			pstmt.setString(1, "recommended");


			ResultSet rsVideo = pstmt.executeQuery();
	
			List<Video> videoList = new ArrayList<>();
			
			while(rsVideo.next()) {			
				Video video = mapResultSetToVideo(rsVideo);
				videoList.add(video);
			}
			
			return videoList;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
