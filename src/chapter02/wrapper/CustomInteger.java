package chapter02.wrapper;

public class CustomInteger {

    // 속성
    int value;

    // 생성자
    CustomInteger(int value) {
        this.value = value;
    }

    // 기능 - 자동 문자열 변환
    // toString() 오버라이딩 (값 출력)
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
