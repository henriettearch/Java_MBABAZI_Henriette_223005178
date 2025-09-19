package com.Entities;

import java.util.Scanner;

public class SelectShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Square");
            System.out.print("Enter your choice: ");
            int c = input.nextInt();

            System.out.println("What would you like to calculate?");
            System.out.println("A. Area");
            System.out.println("B. Perimeter");
            System.out.print("Enter your choice (A/B): ");
            char calcChoice = input.next().toUpperCase().charAt(0);

            switch (c) {
                case 1: 
                    Rectangle rect = new Rectangle();
                    System.out.print("Enter length of rectangle: ");
                    rect.setL(input.nextDouble());
                    System.out.print("Enter width of rectangle: ");
                    rect.setW(input.nextDouble());

                    if (calcChoice == 'A') {
                        System.out.println("Area of Rectangle: " + rect.CalculateArea());
                    } else {
                        System.out.println("Perimeter of Rectangle: " + rect.CalculatePerimeter());
                    }
                    break;

                case 2: 
                    Triangle t = new Triangle(0, 0, 0);
                    if (calcChoice == 'A') {
                        System.out.print("Enter the base of Triangle: ");
                        t.setB(input.nextDouble());
                        System.out.print("Enter the height of Triangle: ");
                        t.setH(input.nextDouble());
                        System.out.println("Area of Triangle: " + t.CalculateArea());
                    } else {
                        System.out.print("Enter side 1: ");
                        t.setB(input.nextDouble());
                        System.out.print("Enter side 2: ");
                        t.setH(input.nextDouble());
                        System.out.print(t.getHy());
                        System.out.println("Perimeter of Triangle: " + t.CalculatePerimeter());
                    }
                    break;

                case 3: 
                    Circle circle = new Circle();
                    System.out.print("Enter radius of circle: ");
                    circle.r = input.nextDouble();

                    if (calcChoice == 'A') {
                        System.out.println("Area of Circle: " + circle.CalculateArea());
                    } else {
                        System.out.println("Perimeter (Circumference) of Circle: " + circle.CalculateCirc());
                    }
                    break;

                case 4: 
                    Square s = new Square();
                    System.out.print("Enter side of square: ");
                    s.s = input.nextDouble();

                    if (calcChoice == 'A') {
                        System.out.println("Area of Square: " + s.CalculateArea());
                    } else {
                        System.out.println("Perimeter of Square: " + s.CalculatePerimeter());
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            
            System.out.println("Would you like to continue? (Yes/No): ");
            continueChoice = input.next();

        } while (continueChoice.equalsIgnoreCase("Yes"));

        System.out.println("Thank you for using the system!");
        input.close();
    }
}
