package by.epam.learn.entity;

import java.util.Arrays;

public class Abiturient {
    private int id;
    public String secondName;
    public String firstName;
    public String otch;
    public String adress;
    public int [] marks;

    public Abiturient() {}

    public Abiturient(String secondName, String firstName, String otch) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.otch = otch;
    }

    public Abiturient(String secondName, String firstName, String otch, String adress, int[] marks) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.otch = otch;
        this.adress = adress;
        this.marks = marks;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getOtch() {
        return otch;
    }

    public void setOtch(String otch) {
        this.otch = otch;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", otch='" + otch + '\'' +
                ", adress='" + adress + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}
