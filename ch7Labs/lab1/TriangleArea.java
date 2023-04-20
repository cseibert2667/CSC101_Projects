package ch7Labs.lab1;

import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        Triangle triangle1 = new Triangle();
          Triangle triangle2 = new Triangle();

          triangle1.setBase(scnr.nextDouble());
          triangle1.setHeight(scnr.nextDouble());
          
          triangle2.setBase(scnr.nextDouble());
          triangle2.setHeight(scnr.nextDouble());
          
          System.out.println("Triangle with smaller area:");
          
          if (triangle1.getArea() < triangle2.getArea()) {
             triangle1.printInfo();
          }
          else {
             triangle2.printInfo();
          }
    }
      
   }
}
