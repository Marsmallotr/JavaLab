package Shape;


import Shape.Shape;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trungdbkhe140257
 */
public class Circle extends Shape{
    double radius = 0;
    double perimeter = 0;
    double area = 0;
    
     public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
      
    @Override
    public double getPerimeter() {
        return perimeter = Math.PI*2*radius;
    }

    @Override
    public double getArea() {
        return area = Math.PI*getRadius()*radius;
    }

    @Override
    public void printResult() {
        System.out.println("Triangle Perimeter = " +perimeter);
        System.out.println("Triangle Area = " +area);
    }
    
    public void input(){
        System.out.println("Please input radious of Circle: ");
        setRadius(Validate.inputDouble()); 
    }
   

    
    
    
    
    
}
