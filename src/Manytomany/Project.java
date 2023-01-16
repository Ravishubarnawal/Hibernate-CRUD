package Manytomany;

import javax.persistence.*;
import java.util.List;
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String project_name;
    @ManyToMany
    private List<Employee> employees;

    public Project() {
    }

    public Project(String project_name, List<Employee> employees) {
        this.project_name = project_name;
        this.employees = employees;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", project_name='" + project_name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
