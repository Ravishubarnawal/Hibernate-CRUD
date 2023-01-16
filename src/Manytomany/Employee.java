package Manytomany;

import javax.persistence.*;
import java.util.List;
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;    @Column
    private String Emp_Name;
    @ManyToMany
    private
    List<Project>projects;

    public Employee() {
    }

    public Employee(String emp_Name, List<Project> projects) {
        Emp_Name = emp_Name;
        this.projects = projects;
    }

    public String getEmp_Name() {
        return Emp_Name;
    }

    public void setEmp_Name(String emp_Name) {
        Emp_Name = emp_Name;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", Emp_Name='" + Emp_Name + '\'' +
                ", projects=" + projects +
                '}';
    }
}
