package CRUD;

import javax.persistence.*;

@Entity
public class Laptop {
    @Id
    @Column
    private int id;
    @Column
    private String LapName;
    @Column
    private int LapPrice;

    public Laptop(int id, String lapName, int lapPrice) {
        this.id = id;
        LapName = lapName;
        LapPrice = lapPrice;
    }

    public Laptop(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLapName() {
        return LapName;
    }

    public void setLapName(String lapName) {
        LapName = lapName;
    }

    public int getLapPrice() {
        return LapPrice;
    }

    public void setLapPrice(int lapPrice) {
        LapPrice = lapPrice;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", LapName='" + LapName + '\'' +
                ", LapPrice=" + LapPrice +
                '}';
    }
}
