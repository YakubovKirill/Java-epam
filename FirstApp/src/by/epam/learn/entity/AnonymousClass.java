package by.epam.learn.entity;

public class AnonymousClass {
    public static void main(String[] args) {
        ServiceAnon serv = new ServiceAnon() {
            @Override
            public void service1() {
                System.out.println("Hello from override service 1");
            }
        };

        serv.service1();
    }
}
