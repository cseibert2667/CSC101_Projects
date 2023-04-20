package ch7Labs.lab2;

import java.util.Scanner;


public class CarValue {
   public static void main(String[] args) {
      try (Scanner scnr = new Scanner(System.in)) {
        Car myCar = new Car();
          
          int userYear = scnr.nextInt();
          int userPrice = scnr.nextInt();
          int userCurrentYear = scnr.nextInt();
          
          myCar.setModelYear(userYear);
          myCar.setPurchasePrice(userPrice);
          myCar.calcCurrentValue(userCurrentYear);
          
          myCar.printInfo();
    }
   }
}

