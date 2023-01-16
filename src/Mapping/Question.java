package Mapping;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Question {
    @Id
    @Column
    @GeneratedValue
    private  int id;
    private  String questionName;
    @OneToMany
    List<Answer> answers = new ArrayList<>();
    public Question(){

    }

    public Question(String questionName, List<Answer> answer) {
        this.questionName = questionName;
        this.answers = answers;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
