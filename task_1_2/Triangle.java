package Seminar_1;

public class Triangle extends Shape{

    public Triangle(double wight, double hight) {
        super(wight, hight);
    }

    double calculateArea(){
        return getWight() * getHight();
    }

    double calculatePerimeter() {
        return (getWight() + getHight()) * 2;
    }

    void ShowArea() {
        System.out.println("Area = " + calculateArea());
    }

    void ShowPerimetr() {
        System.out.println("Perimeter = " + calculatePerimeter());
    }
}
