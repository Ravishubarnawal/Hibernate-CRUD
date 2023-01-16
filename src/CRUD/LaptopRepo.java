package CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaptopRepo {
    private SessionFactory factory;
    public LaptopRepo() {

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        factory = configuration.buildSessionFactory();
    }
    public void add(Laptop laptop){
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.save(laptop);
        session.getTransaction().commit();
        session.close();
    }
    public Laptop read(int id) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        Laptop laptop = session.get(Laptop.class, id);
        session.getTransaction().commit();
        session.close();
        return laptop;
    }
    public void update(Laptop laptop) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.update(laptop);
        session.getTransaction().commit();
        session.close();
    }
    public void delete(Laptop laptop) {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        session.delete(laptop);
        session.getTransaction().commit();
        session.close();
    }
}
