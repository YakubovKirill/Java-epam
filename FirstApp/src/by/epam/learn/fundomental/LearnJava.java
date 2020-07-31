package by.epam.learn.fundomental;

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

        System.out.println("------- For loop ------- ");

        for (int i = 0; i < 10; i++) {
            var num = Math.round(Math.random() * 10 * i);
            System.out.println("Your number is " + num);
        }

        System.out.println("------- While loop ---------");
        long counter = 0;
        while (counter != 5) {
            counter = Math.round(Math.random() * 10);
            System.out.println("Counter = " + counter);
        }

        System.out.println("------- Arrays ---------");

        int [] array, array3; // so bad
        String [] strings;
        int array2[], array4[]; // so bad
        int dataArray [] ; // so good

        int [] arr = new int[24];
        Integer [] arr2 = new Integer [24];

        int a3[] = new int[] {1,2,3};

        // multiArray
        int [] [] multiArr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                multiArr[i][j] = (int) Math.round(Math.random() * 10);
                System.out.print(multiArr[i][j] + " ");
            }
            System.out.print('\n');
        }

        System.out.println("Array length = " + multiArr.length);

        // test multiArray print
        System.out.println("--- Print multi array method ---");
        printMultiArray (multiArr);
    }


    // Print multi array to console
    protected static void printMultiArray (final int MULTI_ARR[][]) {
        for (int [] arrStr: MULTI_ARR) {
            for (int elem: arrStr) {
                System.out.print(elem + " ");
            }
            System.out.print('\n');
        }
    }
}
