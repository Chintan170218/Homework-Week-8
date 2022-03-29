package homeworkw8;

import java.util.Scanner;

public class FirstAndLastDigit7 {

    public static void main(String[] args) {

        sumFirstAndLastDigit(1);

    }

    public static int sumFirstAndLastDigit(int number){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number= ");
        number = obj.nextInt();

        int lastDigit = 0;
        if (number >= 0) {
            lastDigit = number % 10;

            while (number > 9) {
                number = number / 10;
            }

            System.out.print("First Digit= " + number + " Last Digit= " + lastDigit + " Total = "
                    + number + " + " + lastDigit + " = "  + (number + lastDigit));
            return 0;

        } else
            System.out.println("-1: Enter a Valid Number");
        return -1;
    }
}

