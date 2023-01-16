package Mapping;

import javax.persistence.*;

@Entity
public class Answer {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ans_id;
    private  String answer;
    // this will set the mapping will be done by answer object declared in question.
    // this will set only one foreign key for Question class too.
    // this will avoid third table creation (mapped by ="answer");
    @ManyToOne
    @JoinColumn(name = "question_id")  // join with customized name of question object as question_id;
    private  Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public Answer() {
    }

    public Answer(String answer) {
        this.answer = answer;
    }

    public int getAns_id() {
        return ans_id;
    }

    public void setAns_id(int ans_id) {
        this.ans_id = ans_id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
