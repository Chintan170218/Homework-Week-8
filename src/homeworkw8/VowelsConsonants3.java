package homeworkw8;

import java.util.Locale;
import java.util.Scanner;

public class VowelsConsonants3 {

    public static void main(String[] args) {

        VowelsConsonants3 obj = new VowelsConsonants3();
        obj.letter();

    }

    public void letter() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character of the alphabet: ");
        String letter = sc.next().toLowerCase(Locale.ROOT);


        boolean uppercase = letter.charAt(0) >= 65 && letter.charAt(0) <= 90;
        boolean lowercase = letter.charAt(0) >= 97 && letter.charAt(0) <= 122;
        boolean vowels = letter.equals("a") || letter.equals("e") || letter.equals("i")
                || letter.equals("o") || letter.equals("u");

        if (letter.length() > 1) {
            System.out.println("Error. Not a single character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
}
