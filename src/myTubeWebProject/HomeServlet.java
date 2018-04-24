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
				video1.setCapture("image1.PNG");
				//video1.setCapture("C:\Users\Administrateur\eclipse-workspace\MyTubeWebProject\images/image1.PNG");
		
				
				Video video2 = new Video();
				video2.setAuthor("TAI REFLECTIONS / STARRYSKY");
				video2.setDuration(606);
				video2.setNumberOfComments(1);
				video2.setNumberOfViews(3844);
				video2.setPublicationDate("1 sept. 2017");
				video2.setTitle("KENZO - KENZO WORLD");
				video2.setUrl("https://www.youtube.com/embed/NDrAng2nueI");
				video2.setId(2);
				//test setAttribute
				request.setAttribute("titre1", video1.getTitle());


		
		ArrayList<Video> videoList = new ArrayList<>();
		videoList.add(video1);
		videoList.add(video2);
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
