package io.turntabl.flyweight;

public class Student implements Person {
   private int id;
   private String name;

   public Student(int id, String name) {
      this.id = id;
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public void printInfo() {
      System.out.println("---------STUDENT: " + id + " -----------");
      System.out.println("ID: " + id + "\nName: " + name);
   }
}
