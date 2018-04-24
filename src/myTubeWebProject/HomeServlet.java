package myTubeWebProject;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class myTubeServlet
 */
@WebServlet("/HomePage")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setHeader("Content-Type", "text/html");
		response.setCharacterEncoding("UTF-8");
		
		String pathInfo= request.getPathInfo();
		
		//TODO construire les 10 vidéos avec le constructeur
				Video video1 = new Video();
				video1.setAuthor("Marrionnaud France");
				video1.setDuration(10);
				video1.setNumberOfComments(318);
				video1.setNumberOfViews(85508);
				video1.setPublicationDate("15 avr. 2018");
				video1.setTitle("2 CHANSONS A ECOUTER EN MEME TEMPS - Tai Reflections");
				video1.setUrl("https://www.youtube.com/embed/PSLBKeZnPyE");
				video1.setId(1);
				video1.setCapture("C:\Users\Administrateur\eclipse-workspace\MyTubeWebProject\images/image1.PNG");

				Video video2 = new Video();
				video2.setAuthor("TAI REFLECTIONS / STARRYSKY");
				video2.setDuration(606);
				video2.setNumberOfComments(1);
				video2.setNumberOfViews(3844);
				video2.setPublicationDate("1 sept. 2017");
				video2.setTitle("KENZO - KENZO WORLD");
				video2.setUrl("https://www.youtube.com/embed/NDrAng2nueI");
				video2.setId(2);
				video2.setCapture()"C:\Users\Administrateur\eclipse-workspace\MyTubeWebProject\images/image2.PNG";
				
				Video video3 = new Video();
				video3.setAuthor("EnjoyPhoenix");
				video3.setDuration(689);
				video3.setNumberOfComments(1291);
				video3.setNumberOfViews(345474);
				video3.setPublicationDate("14 avr. 2018");
				video3.setTitle("RECETTES: 4 BREAKFAST IDEAS");
				video3.setUrl("https://www.youtube.com/watch?v=sdlWIZSsmhs");
				video3.setId(3);
				video3.setCapture()"C:\Users\Administrateur\eclipse-workspace\MyTubeWebProject\images/image3.PNG";
				
				Video video4 = new Video();
				video4.setAuthor("Parole de chat");
				video4.setDuration(131);
				video4.setNumberOfComments(1120);
				video4.setNumberOfViews(426523);
				video4.setPublicationDate("13 avr. 2018");
				video4.setTitle("LA PISCINE - PAROLE DE RATON LAVEUR");
				video4.setUrl("https://www.youtube.com/watch?v=5o4r1hlI5tI");
				video4.setId(4);
				video4.setCapture()"C:\Users\Administrateur\eclipse-workspace\MyTubeWebProject\images/image4.PNG";
				
				Video video5 = new Video();
				video5.setAuthor("orelsan");
				video5.setDuration(236);
				video5.setNumberOfComments(12303);
				video5.setNumberOfViews(8631819);
				video5.setPublicationDate("11 avr. 2018");
				video5.setTitle("Orelsan - La pluie (feat. Stromae) [CLIP OFFICIEL]");
				video5.setUrl("https://www.youtube.com/watch?v=37StRy0LEbI");
				video5.setId(5);
				video5.setCapture()"C:\Users\Administrateur\eclipse-workspace\MyTubeWebProject\images/image5.PNG";

		ArrayList<Video> videoList = new ArrayList<>();
		videoList.add(video1);
		videoList.add(video2);
		videoList.add(video3);
		videoList.add(video4);
		videoList.add(video5);
		request.setAttribute("videoList", videoList);
		
		
		
		if (pathInfo == null ) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/Home.jsp").forward(request, response);
			
		
		} else {
			response.setStatus(404);
			response.getWriter().append("<p>404 - La page demandée n'existe pas</p>");
			return;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
