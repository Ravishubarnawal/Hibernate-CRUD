//package Game;
//
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//
//public class Controller{
//    public static void main(String[] args) {
//        Configuration configuration = new Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        SessionFactory factory = configuration.buildSessionFactory();
//        Session session = factory.openSession();
//        Transaction tx = session.beginTransaction();
//        Player p1= new Player();  // update a record
//        p1.setPlayerId(1);
//        p1.setPlayerName("Virat");
//        p1.setTeamName("India");
//        session.update(p1);  // compulsory we need provide as it will try to create the record on previously created db on id=1 and throw exception;
//        p1=session.get(Player.class,1);
//        System.out.println(p1);
//        Player p2= new Player();
//        p2.setPlayerName("Dhoni");
//        p2.setTeamName("India");
//        session.save(p2);
//        Player[] player= {p1,p2};// to get all the player data.
//        for (Player players: player) {
//            System.out.println(players);
//        }
//        session.delete(p2);
//        tx.commit();
//        session.close();
//    }
//}
