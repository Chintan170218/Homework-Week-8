package homeworkw8;

import java.util.Scanner;

public class DigitSumChallenge4 {

    public static void main(String[] args) {

        Addition();

    }



    public static void Addition() {

        int n, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        while (n > 0) {

            //Finding the last digit of the given number
            digit = n % 10;

            //Adding last digit to the variable sum
            sum = sum + digit;

            //Removing the last digit from the number
            n = n / 10;
        }

        //Printing the Sum
        System.out.println("Sum of Digits: " + sum);
    }
}

