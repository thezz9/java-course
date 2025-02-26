package chapter02.staticexample;

public class Main {
    public static void main(String[] args) {

        // 클래스 멤버
        // static 변수, 메서드 활용
        System.out.println("static 변수 활용: " + Person.population);
        Person.printPopulation();

        // 인스턴스 멤버 활용
        Person person1 = new Person();
        Person person2 = new Person();

        // 인스턴스 변수 활용
        person1.name = "steve";
        person2.name = "John";

        // 인스턴스 메서드 활용
        person1.printName();
        person2.printName();

        Person.printPopulation();

    }
}
