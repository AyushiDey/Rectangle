package com.thoughtworks.rectangle;


public class Rectangle {


     int length;
     int breadth;
     Rectangle(int length,int breadth)
     {
        if (length < 0 || breadth < 0) {
            throw new IllegalArgumentException("Length and breadth must be non-negative");
        }
        this.length=length;
        this.breadth=breadth;
       
     }
   
     public Rectangle(double length, double breadth) {
      throw new IllegalArgumentException("Length and breadth must be integers");
   }


   int area()
     {
        return length*breadth;
     }
}
