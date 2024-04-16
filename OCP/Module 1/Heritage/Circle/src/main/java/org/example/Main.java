package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle!");
        Circle circle = new Circle(5);
        System.out.printf("The area of the circle with radius %.2f is %.2f%n", circle.getR(), circle.area());
    }
}