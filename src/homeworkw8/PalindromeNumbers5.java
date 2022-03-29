package homeworkw8;

import java.util.Scanner;

public class PalindromeNumbers5 {


    public static void main(String[] args) {

        isPalindrome(0);

    }

    public static boolean isPalindrome(int number) {
        // variable declaration
        int reverse = 0, remainder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = sc.nextInt();
        int num = input;

        //get the reverse of num
        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        // check if reversed number and original number ara equal
        if (input == reverse) {

            System.out.println(input + " is a Palindrome Number.");
            return true;
        } else {
            System.out.println(input + " is not a Palindrome Number.");
        }
        return false;
    }
}


