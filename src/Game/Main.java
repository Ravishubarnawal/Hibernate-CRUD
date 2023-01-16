//package Game;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;
//
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        SessionFactory factory = configuration.buildSessionFactory();
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        //Query query= session.createQuery("from Player p where p.age>=:AgePlayer");
//        Query query = session.createQuery("from Player p where p.age>=:AgePlayer order by playerName desc ");
//        query.setInteger("AgePlayer", 30);
//        List<Player> playerLists = query.list();
//        System.out.println("Player Details");
//        for (Player PlayerList : playerLists) {
//            System.out.println(PlayerList);
//
//        }
//
//    }
//}
