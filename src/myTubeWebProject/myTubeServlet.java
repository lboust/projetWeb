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
@WebServlet("/myTubeServlet")
public class myTubeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public myTubeServlet() {
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
		
		video video1 = new video();
		video1.setAuthor("Marrionnaud France");
		video1.setDuration(10);
		video1.setNumberOfComments(1);
		video1.setNumberOfViews(3844);
		video1.setPublicationDate("1 sept. 2017");
		video1.setTitle("KENZO - KENZO WORLD");
		video1.setUrl("https://www.youtube.com/embed/PSLBKeZnPyE");
		
		request.setAttribute("titre1", video1.getTitle());
		
		
		ArrayList<video> videoList = new ArrayList<>();
		videoList.add(video1);
		request.setAttribute("videoList", videoList);
		
		
		
		if (pathInfo == null ) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/MyTubeWebProject.jsp").forward(request, response);
			
		
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
