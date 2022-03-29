package homeworkw8;

import java.util.Scanner;

//Make a right angle triangle with numbers in the console.

public class RightAngleTriangleNumbers6 {


    public static void main(String[] args) {

        RightAngleTriangleNumbers6 obj = new RightAngleTriangleNumbers6();
        obj.num();

    }

    //Method to make a right angle triangle
    public void num(){
        int i, j, n;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for (i=1; i<=n; i++){
            for (j=1; j<=i; j++)

                System.out.print(j);

            System.out.println(" ");
        }
    }
}
