package by.epam.learn.entity;

public class OverloadMain {
    public static void main(String[] args) {
        Overload obj = new Overload();

        obj.over();
        obj.over(100);
        obj.over(1000, 2000);

    }
}
