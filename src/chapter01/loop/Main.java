package chapter01.loop;

public class Main {
    public static void main(String[] args) {

        // for
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            if (i == 2) {
                continue;
            }
            System.out.println("안녕하세요! " + i);
        }

        // while
        int i = 1;
        while (i <= 10) {
            System.out.println("안녕하세요!" + i);
            i++;
        }

        // do-while
        int j = 1;
        do {
            System.out.println("안녕하세요!");
            j++;
        } while (j <= 10); {
            System.out.println("안녕하세요!" + j);
        }
    }
}
