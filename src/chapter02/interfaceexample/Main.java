package chapter02.interfaceexample;

public class Main {
    public static void main(String[] args) {

        LuxuryCar luxuryCar = new LuxuryCar();
        SpeedCar speedCar = new SpeedCar();

        // 활용
        luxuryCar.drive();
        luxuryCar.stop();

        speedCar.drive();
        speedCar.stop();
        
        luxuryCar.charge();
        speedCar.autoParking();

    }
}
