package org.mykola.zakharov.startwith.hibernate;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateFactory.getSessionFactory();
        EntityManager em = sessionFactory.createEntityManager();

//        UserDetails userDetails = new UserDetails();
//        userDetails.setText("runglskbfyuabtrhbwnahefyaeriltaeyufeitho");
//        User user = new User();
//        user.setFirstName("Mykola");
//        user.setLastName("Zakharov");
//        user.setAge(23);
//        user.setUserDetails(userDetails);
//        Workers workers = new Workers();
//        workers.getSetOfWorkers().add(user);
//        user.setWorkers(workers);
//        em.getTransaction().begin();
//        em.persist(userDetails);
//        em.persist(workers);
//        em.persist(user);
//        em.getTransaction().commit();
//
//        DreamJob dreamJob = new DreamJob();
//        dreamJob.setName("Programmer");
//        dreamJob.setField("Finance");
//        dreamJob.setSalary(25000);
//        dreamJob.setCountry("Germany");
//        dreamJob.setCity("Munich");
//        em.getTransaction().begin();
//        em.persist(dreamJob);
//        em.getTransaction().commit();

        /// this last part of code is Needed to be executed with commented code above
        DreamJob dreamj = em.find(DreamJob.class, 1L);
        System.out.println(dreamj);
        Workers workers = em.find(Workers.class, 1L);
        System.out.println(workers);
    }
}
