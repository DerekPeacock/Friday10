package Week1;

import helpers.InputReader;
import helpers.ConsoleColours;

public class Week1 
{
    public static void main(String[] args )
    {
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Derek Peacock");
        System.out.println();

     
        calculateRectangle();

    }
    
    public static void calculateRectangle()
    {
        System.out.println("Calculate Rectangle");
        System.out.println("-------------------\n");

        int length = InputReader.getInt("Enter length of rectangle in cm > ");
        int width = InputReader.getInt("Enter width of rectangle in cm > ");        
        
        int area = length * width;

        System.out.println("\nArea = " + area + " sq cm\n");
    }
}
