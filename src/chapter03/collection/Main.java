package chapter03.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 배열의 한계 (정적)
        // 선언과 동시에 길이 설정 필요
        int[] numbers = new int[3];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        // numbers[3] = 40; 에러 발생

        // 컬렉션 (길이 제한 없음)
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);

        // ArrayList 활용
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");

        // 순서 보장
        System.out.println("names = " + names);

        // 중복 데이터 허용
        names.add("Mary");
        System.out.println("names = " + names);

        // 데이터 단건 조회
        System.out.println(names.get(0));

        // 데이터 삭제
        names.remove("Mary");
        System.out.println("names = " + names);

        System.out.println("================================");

        // HashSet 활용
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("John");
        uniqueNames.add("Jane");
        uniqueNames.add("Bob");
        uniqueNames.add("Mary");

        // 순서 보장 X
        System.out.println("uniqueNames = " + uniqueNames);

        // get() 활용 불가
        // uniqueNames.get();

        // 중복 데이터 불가 (적용 X)
        uniqueNames.add("John");

        // 데이터 제거
        uniqueNames.remove("John");
        System.out.println("uniqueNames = " + uniqueNames);

        // HashMap 활용
        // <키, 값>
        HashMap<String, Integer> memberMap = new HashMap<>();

        // 데이터 추가
        memberMap.put("John", 10);
        memberMap.put("Jane", 20);
        memberMap.put("Bob", 30);
        memberMap.put("Mary", 40);

        // 순서 보장 X
        System.out.println("memberMap = " + memberMap);

        // 키 중복 불가
        memberMap.put("John", 20);
        System.out.println("memberMap = " + memberMap);

        // 단건 조회
        Integer num = memberMap.get("Mary");
        System.out.println("num = " + num);

        // 삭제
        memberMap.remove("John");
        System.out.println("memberMap = " + memberMap);

        // 키 확인
        Set<String> keySet = memberMap.keySet();
        System.out.println("keySet = " + keySet);
        
        // 값 확인
        Collection<Integer> values = memberMap.values();
        System.out.println("values = " + values);

    }
}
