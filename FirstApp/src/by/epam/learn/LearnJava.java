package by.epam.learn;

public class LearnJava {
    public static void main(String[] args) {
        final int DISCOUNT = 10;
        int cart = 500;
        int good = 23;
        int discountRate = 20;
        int cartCost;

        if ((cart / good ) > discountRate) {
            cartCost = cart - DISCOUNT;
        }
        else {
            cartCost = cart + DISCOUNT;
        }
    }
}
