package by.epam.learn.entity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.Math.PI;
import static java.lang.StrictMath.cos;

public class LearnImport {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("path");
            System.out.println(PI + " - " + cos(30));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
