package io.turntabl.flyweight;

public class SchoolManagementSystem {
    public static void main(String[] args) {
        // student data
        String[] names = {"Mary", "Dominic", "Rebecca"};
        int[] ids = {1001, 1002, 1003};

        Person student;

        for (int i = 0; i < 3; i++) {
            student = PersonFactory.getPerson("student", ids[i], names[i]);
            student.printInfo();
        }
    }
}
