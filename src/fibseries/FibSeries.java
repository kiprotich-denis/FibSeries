package fibseries;

import java.util.Scanner;

public class FibSeries {

    public static void main(String[] args) {
        int count, num1 = 0, num2 = 1;
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the length of the series");
        count = c.nextInt();
        System.out.println("The length of the series is: " + count);
        System.out.println("Fibonacci Series are: ");
        for (int i = 0; i <= count; i++) {
            System.out.println(num1 + "");
            int sumOfPrev = num1 + num2;
            num1 = num2;
            num2 = sumOfPrev;
        }
    }

}
