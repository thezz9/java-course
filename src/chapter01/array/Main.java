package chapter01.array;

public class Main {
    public static void main(String[] args) {

        int[] intArr = {10, 20, 30, 40, 50};

        System.out.println(intArr.length);

        String[] strArr = new String[5];

        boolean[] boolArr = new boolean[3];

        System.out.println("배열의 1번째 요소 접근: " + intArr[0]);
        System.out.println("배열의 2번째 요소 접근: " + intArr[1]);
        System.out.println("배열의 3번째 요소 접근: " + intArr[2]);
        System.out.println("배열의 4번째 요소 접근: " + intArr[3]);
        System.out.println("배열의 5번째 요소 접근: " + intArr[4]);

        intArr[0] = 100;
        intArr[1] = 200;
        intArr[2] = 300;
        intArr[3] = 400;
        intArr[4] = 500;

        for (int i = 0; i < intArr.length; i++) {
            System.out.println("배열의 인덱스: " + i + ", 값: " + intArr[i]);
        }

        // 향상된 for문
        for (int j : intArr) {
            System.out.println("값: " + j);
        }

        // 2차원 배열
        boolean[][] board = {
                {true, false},
                {false, true}
        };

        System.out.println(board[0][0]);
        System.out.println(board[0][1]);
    }
}
