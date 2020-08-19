package Shape;


import Shape.Shape;
import static java.lang.Math.sqrt;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trungdbkhe140257
 */
public class Triangle extends Shape{
    double sideA = 0;
    double sideB = 0;
    double sideC = 0;
    double perimeter = 0;
    double area = 0;
    
    
    @Override
    public double getPerimeter() {    
        perimeter = sideA + sideB + sideC;
        return perimeter ;
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        double a = sideA;
        double b = sideB;
        double c = sideC;
        area = Math.sqrt(p* (p - a) * (p - b) * (p - c));
        return area;
    }

    @Override
    public void printResult() {
        System.out.println("Triangle Perimeter = " +perimeter);
        System.out.println("Triangle Area = " +area);
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    
    public void input(){
        while(true){
        System.out.println("Please input side A of Triangle: ");
        setSideA(Validate.inputDouble()); 
        System.out.println("Please input side B of Triangle: ");
        setSideB(Validate.inputDouble()); 
        System.out.println("Please input side C of Triangle: ");
        setSideC(Validate.inputDouble());
        double a = getSideA();
        double b = getSideB();
        double c = getSideC();
            //sum of 2 random side must be greater than the other
            if(a + b > c && a + c > b && b + c > a){
                break;
            }else{
                System.out.println("Please input valid triangle!!!\n");
            }
        } 
    }
    
    
}
