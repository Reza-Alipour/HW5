package org.model;

import static org.junit.Assert.assertEquals;

public class ShapeTest {

    @org.junit.Test
    public void rectangleTest1() {
        System.out.println("Rectangle Test 1");
        Rectangle rectangle = new Rectangle(10, 20);
        assertEquals(200, rectangle.computeArea(), 0.0001);
        System.out.println("Test 1 passed");
    }


    @org.junit.Test
    public void rectangleTest2() {
        System.out.println("Rectangle Test 2");
        Rectangle rectangle = new Rectangle(8.8, 9.9);
        assertEquals(87.12, rectangle.computeArea(), 0.0001);
        System.out.println("Test 2 passed");
    }

    @org.junit.Test
    public void rectangleTest3() {
        System.out.println("Rectangle Test 3");
        Rectangle rectangle = new Rectangle(4.5, 9.1);
        assertEquals(40.95, rectangle.computeArea(), 0.0001);
        System.out.println("Test 3 passed");
    }

    @org.junit.Test
    public void rectangleTest4() {
        System.out.println("Rectangle Test 4");
        Rectangle rectangle = new Rectangle(4.5, 9.1);
        rectangle.setX(2.3);
        rectangle.setY(4.4);
        assertEquals(10.12, rectangle.computeArea(), 0.0001);
        System.out.println("Test 4 passed");
    }

    @org.junit.Test
    public void squareTest5() {
        System.out.println("Square Test 5");
        Square square = new Square(12);
        assertEquals(144, square.computeArea(), 0.0001);
        System.out.println("Test 5 passed");
    }

    @org.junit.Test
    public void squareTest6() {
        System.out.println("Square Test 6");
        Square square = new Square(8.8);
        square.setX(11.1);
        assertEquals(123.21, square.computeArea(), 0.0001);
        System.out.println("Test 6 passed");
    }
}
