package by.epam.learn.collection;

import java.util.ArrayList;
import java.util.List;

public class ComparatorMain {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Kirill",22));
        personList.add(new Person("Ivan",19));
        personList.add(new Person("Julia",20));
        personList.add(new Person("Fedor",30));
        System.out.println(personList);
        personList.sort((o1, o2) -> o1.getAge() - o2.getAge());
        System.out.println(personList);
    }
}
