package by.epam.learn.entity;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LearnImport {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("path");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
