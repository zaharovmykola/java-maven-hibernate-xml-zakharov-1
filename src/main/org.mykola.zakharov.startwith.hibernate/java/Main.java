import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                HibernateFactory.getSessionFactory();

        User u = new User();
        u.setFirstName("f1");
        u.setLastName("l1");
        u.setAge(20);

        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();

        DreamJob dreamJob = new DreamJob("programmer", "finance", 25000, "Germany", "Munich");
        em.getTransaction().begin();
        em.persist(dreamJob);
        em.getTransaction().commit();
    }
}
