package java;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.*;

/** TestDAO implemented using a singleton pattern
 *  Used to get Authors data from my MYSQL database*/
public class TestDAO {

    SessionFactory factory = null;
    Session session = null;

    private static TestDAO single_instance = null;

    private TestDAO()
    {
        factory = HibernateUtils.getSessionFactory();
    }


    public static TestDAO getInstance()
    {
        if (single_instance == null) {
            single_instance = new TestDAO();
        }

        return single_instance;
    }

    /** Used to get more than one Authors from database
     *  Uses the OpenSession construct rather than the
     *  getCurrentSession method so that I control the
     *  session.  Need to close the session myself in finally.*/
    public List<Authors> getAuthors() {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from java.Authors";
            List<Authors> cs = (List<Authors>)session.createQuery(sql).getResultList();
            session.getTransaction().commit();
            return cs;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }

    }

    /** Used to get a single Authors from database */
    public Authors getAuthors(int id) {

        try {
            session = factory.openSession();
            session.getTransaction().begin();
            String sql = "from java.Authors where id=" + Integer.toString(id);
            Authors c = (Authors)session.createQuery(sql).getSingleResult();
            session.getTransaction().commit();
            return c;

        } catch (Exception e) {
            e.printStackTrace();
            // Rollback in case of an error occurred.
            session.getTransaction().rollback();
            return null;
        } finally {
            session.close();
        }
    }

}
