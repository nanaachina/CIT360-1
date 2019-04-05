package comicbook;


import java.util.*;

public class RunHibernateExample {

    public static void main(String[] args) {

        AuthorsDAO t = AuthorsDAO.getInstance();

        List<Authors> c = t.getAuthors();
        for (Authors i : c) {
            System.out.println(i);
        }

        System.out.println(t.getAuthors(1));
    }
}
