package io.turntabl.flyweight;

public class Student implements Person {
   // intrinsic state: immutable and shared
   private final String institution = "JustLearn Academy";

   // extrinsic: mutable and varies
   private int id;
   private String name;

   public Student(int id, String name) {
      this.id = id;
      this.name = name;
   }

   public String getInstitution() {
      return institution;
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
      System.out.println("ID: " + id + "\nName: " + name + "\nSchool: " + institution);
   }
}
