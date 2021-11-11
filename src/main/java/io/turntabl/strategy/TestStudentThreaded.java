//package io.turntabl.strategy;
//
//import java.util.Arrays;
//
//public class TestStudentThreaded implements Runnable {
//    private Thread thread;
//
//    public static void main(String[] args) {
//
//    }
//
//    public void TestFlyWeightThreaded() {
//        // data configuration
//        String[] names = {"Ralph", "Alice", "Sam"};
//        int[] ids = {1001, 1002, 1003};
//        int[] scores = {45, 55, 65};
//        double averageScore = Arrays.stream(scores).average().getAsDouble();
//
//        // shared object ::: flyweight
//        StudentThreaded studentThreaded = StudentThreaded.getInstance();
//
//        // configure flyweight on-the-fly for a student
//        studentThreaded.setName("Ralph");
//        System.out.println("Name: " + studentThreaded.getName());
//
//        System.out.println("");
//    }
//
//    @Override
//    public void run() {
//        StudentThreaded studentThreaded = StudentThreaded.getInstance();
//    }
//}
