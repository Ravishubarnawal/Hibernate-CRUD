package Game;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class MainWorks {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Player.class);
        configuration.addAnnotatedClass(Team.class);
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Team t1 = new Team("RCB");
        Team t2 = new Team("India");
        Player player = new Player();
        player.setPlayerName("Virat Kohli");
        player.setAge(31);
        player.getTeamList().add(t1);
        player.getTeamList().add(t2);
        session.save(t1);
        session.save(t2);
        session.save(player);
        tx.commit();


    }
}
