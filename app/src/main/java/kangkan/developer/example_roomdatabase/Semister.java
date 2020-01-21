package kangkan.developer.example_roomdatabase;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Semister {

    @PrimaryKey(autoGenerate = true)
    int id;
    String semister_name;
    double semister_gpa;
    double semister_cradit;


    public Semister(String semister_name, double semister_gpa, double semister_cradit) {
        this.semister_name = semister_name;
        this.semister_gpa = semister_gpa;
        this.semister_cradit = semister_cradit;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSemister_name() {
        return semister_name;
    }

    public void setSemister_name(String semister_name) {
        this.semister_name = semister_name;
    }

    public double getSemister_gpa() {
        return semister_gpa;
    }

    public void setSemister_gpa(double semister_gpa) {
        this.semister_gpa = semister_gpa;
    }

    public double getSemister_cradit() {
        return semister_cradit;
    }

    public void setSemister_cradit(double semister_cradit) {
        this.semister_cradit = semister_cradit;
    }
}
