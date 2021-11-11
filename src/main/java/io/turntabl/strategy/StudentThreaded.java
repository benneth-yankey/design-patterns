//package io.turntabl.flyweight;
//
//public class StudentThreaded {
//   private int id;
//   private String name;
//   int score;
//   double averageScore;
//   private static StudentThreaded studentThreaded = new StudentThreaded();
//
//   // prevents instantiation
//   private StudentThreaded() {}
//
//   public int getId() {
//      return id;
//   }
//
//   public void setAverageScore(double averageScore) {
//      this.averageScore = averageScore;
//   }
//
//   public void setId(int id) {
//      this.id = id;
//   }
//
//   public String getName() {
//      return name;
//   }
//
//   public void setName(String name) {
//      this.name = name;
//   }
//
//   public int getScore() {
//      return score;
//   }
//
//   public void setScore(int score) {
//      this.score = score;
//   }
//
//   public double getStanding() {
//      return (((double) score) / averageScore - 1.0) * 100.0;
//   }
//
//   // factory object
//   public static StudentThreaded getInstance() {
//      return studentThreaded;
//   }
//}
