package com.example.chapter13;

public class Main {
    public static void main(String[] args) {
        // Тест на Circle
        Circle c = new Circle(3.0, "green", true);
        System.out.println("Circle area: " + c.getArea());

        // Тест на Rectangle
        ComparableRectangle rect = new ComparableRectangle(4.0, 5.0);
        System.out.println("Rectangle area: " + rect.getArea());

        // Тест на Rational
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);
        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));

        // Тест на House
        House h1 = new House(101, 120.5);
        House h2 = (House) h1.clone();
        System.out.println("Cloned house area: " + h2.getArea());
    }
}
