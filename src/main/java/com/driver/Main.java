package com.driver;

public class Main {

        // Task 3: Create an object of class RWOnly
        RWOnly obj = new RWOnly();

        // Task 4: Try setting a value to name by directly accessing it
        // obj.name = "John"; // Error: 'name' has private access in RWOnly
        // System.out.println(obj.name); // Error: 'name' has private access in RWOnly

        // Task 6: Set and get the value using setter and getter
        obj.setName("John"); // Setting the name using the setter method
        System.out.println("Name: " + obj.getName()); // Accessing the name using the getter method
  
}
