package by.epam.learn.entity;

public class MultiVariable {
    public void method (int ... values) {
        for (int param: values ) {
            System.out.print(param + " ");
        }
        System.out.println();
    }
}
