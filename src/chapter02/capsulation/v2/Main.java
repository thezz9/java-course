package chapter02.capsulation.v2;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();

        /* 무분별한 Setter
        robot.setLeftLeg(true);
        robot.setRightLeg(true);
        robot.setLeftArm(true);
        robot.setRightArm(true);
         */

        // 의미있는 Setter
        robot.walk(true);

    }


}
