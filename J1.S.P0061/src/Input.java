
import Shape.Validate;
import Shape.Circle;
import Shape.Rectangle;
import Shape.Triangle;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trungdbkhe140257
 */
public class Input {
    
    
    public void calculateInterface(){
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        
        System.out.println("=====Calculator Shape Program=====");
        rectangle.input();
        circle.input();
        triangle.input();
        
        System.out.println("-----Rectangle-----");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        
        System.out.println("-----Circle-----");
        System.out.println("Radious: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        
        System.out.println("-----Triangle-----");
        System.out.println("Side A: " + triangle.getSideA());
        System.out.println("Side B: " + triangle.getSideB());
        System.out.println("Side C: " + triangle.getSideC());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        
    }
}
