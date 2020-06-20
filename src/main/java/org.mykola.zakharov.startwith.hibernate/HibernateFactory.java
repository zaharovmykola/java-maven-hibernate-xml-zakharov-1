package org.mykola.zakharov.startwith.hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.mykola.zakharov.startwith.hibernate.entity.*;

public class HibernateFactory {

    private static SessionFactory sessionFactory = null;

    static {
        Configuration cfg = new Configuration();
        cfg.setProperty("connection.driver_class", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/my-hibernate-annotations?serverTimezone=UTC");
        cfg.setProperty("hibernate.connection.username", "root");
        cfg.setProperty("hibernate.connection.password", "K1l1mandzar0");
        cfg.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
        cfg.setProperty("show_sql", "true");
        cfg.setProperty("hibernate.hbm2ddl.auto", "create");
        cfg.addAnnotatedClass(User.class);
        cfg.addAnnotatedClass(DreamJob.class);
        cfg.addAnnotatedClass(UserDetails.class);
        cfg.addAnnotatedClass(Workers.class);
        cfg.addAnnotatedClass(Role.class);
        sessionFactory = cfg.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
