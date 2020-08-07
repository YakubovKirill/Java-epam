package by.epam.learn.entity;

public enum Season {
    WINTER, SPRING, SUMMER, AUTUMN;

    private Season () {
        System.out.println("Season is " + this.name());
    }
}
