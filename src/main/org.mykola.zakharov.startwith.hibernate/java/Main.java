import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                HibernateFactory.getSessionFactory();

        User user = new User();
        user.setFirstName("Mykola");
        user.setLastName("Zakharov");
        user.setAge(23);

        EntityManager em = sessionFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

        DreamJob dreamJob = new DreamJob();
        dreamJob.setName("Programmer");
        dreamJob.setField("Finance");
        dreamJob.setSalary(25000);
        dreamJob.setCountry("Germany");
        dreamJob.setCity("Munich");
        em.getTransaction().begin();
        em.persist(dreamJob);
        em.getTransaction().commit();
    }
}
