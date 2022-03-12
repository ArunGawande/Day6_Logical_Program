package Day6_Logical_Program;

import java.util.Scanner;

public class ReverseTheNumber
{
    public static void main(String[] args) {

        Scanner scannerObject = new Scanner(System.in);
        int remainder, reversedNumber = 0;
        System.out.println("Enter the number to be reversed:");
        int numberToReverse = scannerObject.nextInt();
        scannerObject.close();

        while (numberToReverse > 0) {

            remainder = numberToReverse % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            numberToReverse = numberToReverse / 10;
        }

        System.out.println("The reversed Number is: " + reversedNumber);
    }
}
