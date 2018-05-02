package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class VideoRepository {
	/**
	 * m�thode qui va chercher dans la database la vid�o � l'id demand�
	 * 
	 * @param id
	 * @return Video
	 */
	public Video findVideoById(Integer id) {

		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
			Session session = sessionFactory.openSession();	
				session.getTransaction().begin();
					Video currentVideo = session.find(Video.class, id);
				session.getTransaction().commit();
			session.close();
		sessionFactory.close();
		return currentVideo;
	}

}
