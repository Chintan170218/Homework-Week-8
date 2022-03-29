package homeworkw8;

import java.util.Scanner;

public class ArmstrongNumber10 {

    public static void main(String[] args) {

        isArmstrong();

    }

    public static void isArmstrong() {

        int num, number, temp, total = 0;
        System.out.print("Enter a 3 Digit Number = ");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        scanner.close();
        number = num;

        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }

        if (total == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");
    }
}



