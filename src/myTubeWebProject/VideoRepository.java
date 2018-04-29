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
	// construit l'objet Video � partir des colonnes de la base de donn�e
	private Video mapResultSetToVideo(ResultSet rsVideo, ResultSet rsUser) throws SQLException  {
		Video video = new Video();
		video.setId(rsVideo.getInt("id"));
		video.setTitle(rsVideo.getString("title"));
		video.setUrl(rsVideo.getString("url"));
		video.setDuration(rsVideo.getInt("duration"));
		video.setPublicationDate(rsVideo.getString("publicationDate"));
		video.setType(rsVideo.getString("type"));
		video.setNumberOfViews(rsVideo.getInt("numberofViews"));
		video.setCapture(rsVideo.getString("capture"));
		video.setDescription(rsVideo.getString("description"));
		video.setUser_id(rsVideo.getInt("user_id"));

		User user = new User();
		user.setId(rsUser.getInt("id"));
		user.setUsername(rsUser.getString("username"));
		user.setUseremail(rsUser.getString("email"));
		user.setUserpassword(rsUser.getString("password"));
		
		video.setAuthor(user);
		
		return video;
	}
	//method findVideoById
	//trouve dans la base de donn�es la vid�o correspondant � l'id
	public Video findVideoById(Integer id) {
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmtVideo = 
					conn.prepareStatement("SELECT * FROM video WHERE id = ?");
			pstmtVideo.setInt(1, id);
			
			ResultSet rsVideo = pstmtVideo.executeQuery(); // ligne de la table video � l'id demand�
			if(! rsVideo.next()) { 
				return null; 
			}
			PreparedStatement pstmtUser = 
					conn.prepareStatement("SELECT * FROM user WHERE id = ?");
			pstmtUser.setInt(1, rsVideo.getInt("user_id"));
			
			ResultSet rsUser = pstmtUser.executeQuery(); // ligne de la table user o� l'id est �gal � l'user_id de la table video
						
			 // contruction de la vid�o � partir des attributs video et user
			if(! rsUser.next()) { 
				return null; 
			}
			
			
			
			return mapResultSetToVideo(rsVideo, rsUser);
			
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
			
			Statement stmtVideo = conn.createStatement();			
			ResultSet rsVideo = stmtVideo.executeQuery("SELECT * FROM video");
			
			if(! rsVideo.next()) { 
				return null; 
			}
			PreparedStatement pstmtUser = 
					conn.prepareStatement("SELECT * FROM user WHERE id = ?");
			pstmtUser.setInt(1, rsVideo.getInt("user_id"));
			
			ResultSet rsUser = pstmtUser.executeQuery(); 
			if(! rsUser.next()) { 
				return null; 
			}
			PreparedStatement pstmtComment = 
					conn.prepareStatement("SELECT * FROM commentary WHERE video_id = ?");
			pstmtComment.setInt(1, rsVideo.getInt("id"));
			
			ResultSet rsComment = pstmtComment.executeQuery(); // ligne de la table user o� l'id est �gal � l'user_id de la table video
						
			 // contruction de la vid�o � partir des attributs video et user
			if(! rsComment.next()) { 
				return null; 
			}
			
			List<Video> videoList = new ArrayList<>();
			
			while(rsVideo.next()) {			
				Video video = mapResultSetToVideo(rsVideo, rsUser);
				videoList.add(video);
			}
			
			return videoList;
			
		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	
	//method findTrending()
	//ajoute la video � la liste de videos tendances
	public List<Video> findTrending() {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM video WHERE type = ?");
			pstmt.setString(1, "trending");

			ResultSet rsVideo = pstmt.executeQuery();
			if(! rsVideo.next()) { 
				return null; 
			}
			PreparedStatement pstmtUser = 
					conn.prepareStatement("SELECT * FROM user WHERE id = ?");
			pstmtUser.setInt(1, rsVideo.getInt("user_id"));
			
			ResultSet rsUser = pstmtUser.executeQuery(); 
			if(! rsUser.next()) { 
				return null; 
			}
			
			List<Video> videoList = new ArrayList<>();
			
			while(rsVideo.next()) {			
				Video video = mapResultSetToVideo(rsVideo, rsUser);
				videoList.add(video);
			}
			
			return videoList;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	//method findRecommended()
	//ajoute la video � la liste de videos recommand�es
	public List<Video> findRecommended() {

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytube?serverTimezone=UTC", "root", "rootroot")) {

			PreparedStatement pstmt = 
					conn.prepareStatement("SELECT * FROM video WHERE type = ?");
			pstmt.setString(1, "recommended");


			ResultSet rsVideo = pstmt.executeQuery();
			if(! rsVideo.next()) { 
				return null; 
			}
			PreparedStatement pstmtUser = 
					conn.prepareStatement("SELECT * FROM user WHERE id = ?");
			pstmtUser.setInt(1, rsVideo.getInt("user_id"));
			
			ResultSet rsUser = pstmtUser.executeQuery(); 
			if(! rsUser.next()) { 
				return null; 
			}
			
			List<Video> videoList = new ArrayList<>();
			
			while(rsVideo.next()) {			
				Video video = mapResultSetToVideo(rsVideo, rsUser);
				videoList.add(video);
			}
			
			return videoList;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
}
