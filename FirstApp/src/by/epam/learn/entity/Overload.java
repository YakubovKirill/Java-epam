package by.epam.learn.entity;

public class Overload {
    public void over () {
        System.out.println("No param");
    }

    public void over (final int ONE) {
        System.out.println("1 param " + ONE);
    }

    public void over (final int ONE, final int TWO) {
        System.out.println("2 params " + ONE + " - " + TWO);
    }
}
