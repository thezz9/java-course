package chapter02.finalexample;

public class Circle {

    // 속성
    final static double PI = 3.14159;
    final double radius; // final로 선언되어 있지 않으면 외부에서 변경 가능

    // 생성자
    Circle(double radius) {
        this.radius = radius;
    }

    // 기능
    Circle changeRadius(double radius) {
        return new Circle(radius);
    }

}
