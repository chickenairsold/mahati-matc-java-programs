import java.util.Scanner;
import java.util.Arrays;

20public class AddNumbers {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c;
        int d; // difference (a - b)

        a = scnr.nextInt();
        b = scnr.nextInt();

        if (a <= b) {
            System.out.println("a is less than b ");
        }

        c = a + b;
        System.out.println("The value of c ==>" + c);

        d = a - b;
        System.out.println("The value of subtraction ==>" + d);

        int[] arr = new int[] { a, b, c, d };

        // Print elements using an indexed for-loop
        System.out.println("Printing with indexed for-loop:");
        for (int i = 1; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        scnr.close();
    }

}