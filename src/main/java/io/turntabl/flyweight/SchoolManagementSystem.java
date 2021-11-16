package io.turntabl.flyweight;

public class SchoolManagementSystem {
    public static void main(String[] args) {

        // Naive Implementation
//        Student std1 = new Student(1, "Paul");
//        Student std2 = new Student(2, "Mark");
//        Student std3 = new Student(3, "Mary");


        // student data
        String[] names = {"Mary", "Dominic", "John"};
        int[] ids = {1001, 1002, 100005555};

        Person student;

        for (int i = 0; i < 3; i++) {
            student = PersonFactory.getPerson("student", ids[i], names[i]);
            student.printInfo();
        }
    }
}
