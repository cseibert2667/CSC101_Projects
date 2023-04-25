package ch7Labs.lab2;

import java.lang.Math;

public class Car {
    private int modelYear; 
    private int purchasePrice;
 
    private int currentValue;
    
    public void setModelYear(int userYear){
       modelYear = userYear;
    }
    
    public int getModelYear() {
       return modelYear;
    }
    
    public void setPurchasePrice(int userPrice){
        purchasePrice = userPrice;
    }
    
    public int getPurchasePrice() {
        return purchasePrice;
    }
    
    public void calcCurrentValue(int currentYear) {
       double depreciationRate = 0.15;
       int carAge = currentYear - modelYear;
       
       // Car depreciation formula
       currentValue = (int) 
          Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
    }
    
    public void printInfo(){
        System.out.println("Car's infortmation:");
        System.out.println("Model year: " + this.getModelYear());
        System.out.println("Purchase price: " + this.getPurchasePrice());
        System.out.println("Current value: " + currentValue);
    }
    
 }
