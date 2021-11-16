package io.turntabl.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PersonFactory {
    private static Map<String, Person> persons = new HashMap<>();

    public static Person getPerson(String person, int id, String name) {
        Person student;

        if (persons.containsKey(person)) {
//            System.out.println("reusing existing student object");
            student = persons.get(person);
        } else {
//            System.out.println("creating student object");
            student = new Student(id, name);
            persons.put(person, student);
        }

        student.setId(id);
        student.setName(name);
        return student;
    }
}
