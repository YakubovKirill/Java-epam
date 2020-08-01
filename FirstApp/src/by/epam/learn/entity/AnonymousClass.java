package by.epam.learn.entity;

import java.util.Arrays;

public class AnonymousClass {
    public static void main(String[] args) {
        ServiceAnon serv = new ServiceAnon() {
            @Override
            public void service1() {
                System.out.println("Hello from override service 1");
            }
        };

        serv.service1();

        Arrays.stream(Figure.values()).forEach(e -> System.out.println(e.computeSq()));
    }
}
