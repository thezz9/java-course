package chapter03.generic;

public class Main {
    public static void main(String[] args) {

        // 1. 재사용 불가
        Box box1 = new Box(100);
        // Box box2 = new Box("ABC");
        // Box box3 = new Box(0.1);

        // 2. 낮은 타입 안정성
        ObjectBox strBox = new ObjectBox("ABC");
        ObjectBox intBox = new ObjectBox(100);

        // item을 활용하기 위해서는 다운캐스팅 필요
        String item = (String) strBox.getItem();
        System.out.println("item = " + item);
        System.out.println("===========================================");

        // 제네릭 활용
        // 1. 재사용성 보장 (타입 소거 : T -> Object)
        GenericBox<String> strGBox = new GenericBox<String>("ABC");
        GenericBox<Integer> intGBox = new GenericBox<Integer>(100);
        GenericBox<Double> doubleGBox = new GenericBox<Double>(100.0);

        // 2. 타입 안정성 보장 (타입 소거 : 자동으로 다운캐스팅 삽입)
        String strGBoxItem = strGBox.getItem();
        System.out.println("strGBoxItem = " + strGBoxItem);

        Integer intGBoxItem = intGBox.getItem();
        System.out.println("intGBoxItem = " + intGBoxItem);

        Double doubleGBoxItem = doubleGBox.getItem();
        System.out.println("doubleGBoxItem = " + doubleGBoxItem);
        System.out.println("===========================================");

        // 일반 메서드 (String 기준으로 타입 소거 발생)
        strGBox.printItem("ABC");

        // 제네릭 메서드 (String과 상관 없음)
        strGBox.printBoxItem("ABC");
        strGBox.printBoxItem(100);
        strGBox.printBoxItem(3.14);

    }
}
