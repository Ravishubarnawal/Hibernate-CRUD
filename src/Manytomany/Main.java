package Manytomany;

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
        Employee e1= new Employee();
        e1.setEmp_Name("Hinsh Maharjan");
        Employee e2= new Employee();
        e2.setEmp_Name("Krish Yadav");

        Project p1=new Project();
        p1.setProject_name("Client Management system");

        Project p2 = new Project();
        p2.setProject_name("Admin Management system");


        List<Employee> employeeList =new ArrayList<>();
        List<Project> projectList =new ArrayList<>();

        employeeList.add(e1);
        employeeList.add(e2);

        projectList.add(p1);
        projectList.add(p2);

        e1.setProjects(projectList);
        p2.setEmployees(employeeList);


        session.save(e1);
        session.save(e2);
        session.save(p1);
        session.save(p2);



    }
}
