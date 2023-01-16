package Game;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String playerName;
    @OneToMany
    List<Team> teamList =new ArrayList<>();
    private int age;

    public Player() {

    }

    public Player(String playerName, List<Team> teamList, int age) {
        this.playerName = playerName;
        this.teamList = teamList;
        this.age = age;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", playerName='" + playerName + '\'' +
                ", team=" + teamList +
                ", age=" + age +
                '}';
    }
}


