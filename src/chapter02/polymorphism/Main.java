package chapter02.polymorphism;

public class Main {
    public static void main(String[] args) {

        // 다형성 활용 (업캐스팅 - 자식클래스의 고유한 기능을 사용할 수 없다.)
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        animal1.exist();
        animal1.makeSound();

        animal2.exist();
        animal2.makeSound();

        // 다운캐스팅
        Cat cat = (Cat)animal1;
        cat.scratch();

        Dog dog = (Dog)animal2;
        dog.wag();

        /* 잘못된 다운캐스팅 문제
        Cat cat2 = (Cat)animal2; // animal2 - Dog;
        cat2.scratch(); // 오류 발생
        */

        if (animal1 instanceof Cat) {
            Cat cat2 = (Cat)animal1;
            cat2.scratch();
        } else {
            System.out.println("이 객체는 고양이가 아닙니다.");
        }

        Animal[] animals = {new Cat(), new Dog(), new Cat()};
        System.out.println("=======");
        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
