package by.epam.learn.collection;

import java.util.TreeSet;

public class ComparableMain {
    public static void main(String[] args) {
        TreeSet<Person> personTreeSet = new TreeSet<>();
        personTreeSet.add(new Person("Kirill",22));
        personTreeSet.add(new Person("Ivan",19));
        personTreeSet.add(new Person("Julia",20));
        personTreeSet.add(new Person("Fedor",30));
        System.out.println(personTreeSet);
    }
}
