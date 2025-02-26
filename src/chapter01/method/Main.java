package chapter01.method;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        
        int result = calculator.sum1(10, 25);

        System.out.println("result = " + result);

        calculator.sum2(55, 70);
        
    }
}
