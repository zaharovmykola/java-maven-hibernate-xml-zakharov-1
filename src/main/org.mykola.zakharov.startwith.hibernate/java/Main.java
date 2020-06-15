import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateFactory.getSessionFactory();
        EntityManager em = sessionFactory.createEntityManager();

        UserDetails userDetails = new UserDetails();
        userDetails.setText("runglskbfyuabtrhbwnahefyaeriltaeyufeitho");
        User user = new User();
        user.setFirstName("Mykola");
        user.setLastName("Zakharov");
        user.setAge(23);
        user.setUserDetails(userDetails);
        Workers workers = new Workers();
        workers.getSetOfWorkers().add(user);
        em.getTransaction().begin();
        em.persist(userDetails);
        em.persist(user);
        em.persist(workers);
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
