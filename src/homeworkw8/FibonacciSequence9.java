package homeworkw8;

public class FibonacciSequence9 {

    public static void main(String[] args) {

        fibonacci();

    }

    public static void fibonacci() {

        int a = 0, b = 1, c, count = 20;

        //printing 0 and 1
        System.out.print(a + " " + b);

        int i;

        for (i = 2; i < count; i++) {
            a = b;
            c = a + b;
            b = c;
            System.out.print(" " + c);
        }

    }


}
