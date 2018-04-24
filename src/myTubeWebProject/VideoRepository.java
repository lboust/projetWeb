package myTubeWebProject;

import java.util.ArrayList;

public class VideoRepository {
	//method findTrending()
	//ajoute la video à la liste de videos tendances
	public ArrayList<Video> findTrending(Video video, ArrayList<Video> videoList) {

		if (video.getId()>0 && video.getId()<6) {
			videoList.add(video);
				
		}
		return videoList;
	}
	//method findRecommended()
	//ajoute la video à la liste de videos recommandées
	public ArrayList<Video> findRecommended(Video video, ArrayList<Video> videoList) {

		if (video.getId()>5){
			videoList.add(video);
				
		}
		return videoList;
	}
	
}
