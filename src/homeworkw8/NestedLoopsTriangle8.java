package homeworkw8;

import java.util.Scanner;

public class NestedLoopsTriangle8 {

    public static void main(String[] args) {
        M1();
    }

    public static void M1(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows = ");
        int rows = sc.nextInt();


        for (int i = 1 ; i <= rows; i++ )
        {
            for (int j = 1 ; j <= i; j++ )
            {
                System.out.print("@");
            }
            System.out.println();
        }



    }

}
