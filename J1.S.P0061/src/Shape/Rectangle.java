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
public class Rectangle extends Shape{
    double width = 0;
    double length = 0;
    double perimeter = 0;
    double area = 0;

    @Override
    public double getPerimeter() {
        return perimeter = 2*(width+length);
    }

    @Override
    public double getArea() {
        return area = width*length;
    }

    @Override
    public void printResult() {
        System.out.println("Triangle Perimeter = " +perimeter);
        System.out.println("Triangle Area = " +area);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void input(){
        while(true){
        System.out.println("Please input side width of Rectangle: ");
        setWidth(Validate.inputDouble());
        System.out.println("Please input side length of Rectangle: ");
        setLength(Validate.inputDouble());
            if(width < length){
                break;
            }else{
                System.out.println("Please input length greater than width !!!\n");            
            }
        }
    }
    
    
}
