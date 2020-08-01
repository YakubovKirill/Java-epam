package by.epam.learn.entity;

import java.util.ArrayList;
import java.util.Random;

public class AbiturientMain {
    final static int BEST_MARK_SUMM = 30;

    public static void main(String[] args) {
        final Random rand = new Random();

        String [] secNames = new String[] {"Ivanov", "Petrov", "Sidorov", "Chumakov"};
        String [] firstNames = new String[] {"Ivan", "Petr", "Sidor", "Kirill"};
        String [] otchs = new String[] {"Ivanovich", "Petrovich", "Sidorovich", "Kirillovich"};

        // generate random number of students from 3 to 18
        int numStudents = rand.nextInt(15);

        Abiturient [] abiturients = new Abiturient[numStudents];
        ArrayList<Abiturient> badAbiturients = new ArrayList<>();
        ArrayList<Abiturient> bestAbiturients = new ArrayList<>();

        System.out.println("------- All students --------");

        for (int i = 0; i < numStudents; i++) {
            int [] marks = new int[] {
                    rand.nextInt(10) + 3,
                    rand.nextInt(10) + 3,
                    rand.nextInt(10) + 3,
                    rand.nextInt(10) + 3,
                    rand.nextInt(10) + 3};
            abiturients[i] = new Abiturient(
                    secNames[rand.nextInt(3)],
                    firstNames[rand.nextInt(3)],
                    otchs[rand.nextInt(3)],
                    "Address - " + rand.nextInt(999) + 1000,
                    marks
            );

            int markSummm = 0;
            for (int mark:marks) {
                if (mark < 5) {
                    badAbiturients.add(abiturients[i]);
                    markSummm = 0;
                    break;
                }
                markSummm += mark;
            }

            if (markSummm > BEST_MARK_SUMM) {
                bestAbiturients.add(abiturients[i]);
            }
            System.out.println(abiturients[i].toString());
        }

        System.out.println("------- Bad students --------");

        for (Abiturient abiturient: badAbiturients) {
            System.out.println(abiturient.toString());
        }

        System.out.println("------- Best students --------");
        for (Abiturient abiturient: bestAbiturients) {
            System.out.println(abiturient.toString());
        }
    }
}
