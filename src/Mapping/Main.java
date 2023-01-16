package Mapping;

import Game.Player;
import Game.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        //creating question
        Question q1 = new Question();
        q1.setQuestionName("What is java?");
        // creating answer
        Answer a1 = new Answer("Java  is a high level programming language");
        a1.setQuestion(q1);

        Answer a2 = new Answer("It is object oriented programming type");
        a2.setQuestion(q1);
        // creating list for answers
        List<Answer> list = new ArrayList<>();
        list.add(a1);
        list.add(a2);


        // now one question has multiple answers i.e. list of answers is passed to question.
        q1.setAnswers(list);

        //session save

        session.save(q1);

        session.save(a1);
        session.save(a2);

        //read and get question and answers data to console

        Question read= session.get(Question.class,1);
        System.out.println(read.getQuestionName());
        for (Answer as: q1.answers){
            System.out.println(as.getAnswer());
        }
        tx.commit();


    }
}

