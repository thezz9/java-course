package chapter02.clazz;

public class Main {
    public static void main(String[] args) {

        // 객체 생성 (인스턴스화)
        Person personA = new Person("John", 20, "서울");
        Person personB = new Person("steve", 25, "제주");

        /*
        System.out.println("설정 전 personA 이름: " + personA.name);
        System.out.println("설정 전 personB 이름: " + personB.name);

         속성에 직접 접근
        personA.name = "John";
        personB.name = "steve";


        System.out.println("설정 후 personA 이름: " + personA.name);
        System.out.println("설정 후 personB 이름: " + personB.name);

        int result1 = personA.sum(1, 2);
        int result2 = personB.sum(3, 4);


        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        */

        String name = personA.getName();
        System.out.println("name = " + personA.name);

        personA.setAddress("대구");
        System.out.println("address = " + personA.address);
    }
}
