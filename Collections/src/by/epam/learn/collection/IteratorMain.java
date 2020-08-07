package by.epam.learn.collection;

import java.util.ArrayList;

public class IteratorMain {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>() {
            {
                this.add(new Person("Kirill",22));
                this.add(new Person("Ivan",19));
                this.add(new Person("Julia",20));
                this.add(new Person("Fedor",30));
                this.add(new Person("Maria",18));
                this.add(new Person("Alex",19));
            }
        };

        PeopleAction peopleAction = new PeopleAction();
        peopleAction.twentyAction(personList);

        System.out.println(personList);
    }
}
