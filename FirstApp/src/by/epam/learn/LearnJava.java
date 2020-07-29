package by.epam.learn;

import java.awt.image.AreaAveragingScaleFilter;

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

        final int ARGS_LEN = args.length;
        switch (ARGS_LEN) {
            case 0: {
                System.out.println("Args length is 0");
                break;
            }
            case 1: {
                System.out.println("Args length is 1");
                break;
            }
            case 2: {
                System.out.println("Args length is 2");
                break;
            }
            default: {
                System.out.println("There is too much parameters");
                break;
            }
        }
    }
}
