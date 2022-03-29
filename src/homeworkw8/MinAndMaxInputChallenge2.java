package homeworkw8;

import java.util.Scanner;

public class MinAndMaxInputChallenge2 {

    public static void main(String[] args) {

        minMax();

            }

    public static void minMax() {

        Scanner obj = new Scanner(System.in);

        boolean a, b;
        System.out.println("Enter two values: ");
        a = obj.hasNextInt();
        b = obj.hasNextInt();
        while (a && b) {
            int num1 = obj.nextInt();
            int num2 = obj.nextInt();

            if (num1 > num2) {
                System.out.println("Minimum Number Entered: " + num1);
                System.out.println("Maximum Number Entered: " + num2);
            } else {
                System.out.println("Minimum Number Entered: " + num1);
                System.out.println("Maximum Number Entered: " + num2);
            }
            break;
        }
        obj.close();

    }
}
