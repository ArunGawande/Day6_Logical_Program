package Day6_Logical_Program;

public class FibonacciSeries
{
    public static void main(String[] args)
    {

        int fibonacciLimit = 15;
        int previousNumber = 0, currentNumber = 1;
        System.out.print(previousNumber + " " + currentNumber);

        for (int index = 2; index <= fibonacciLimit; index++)
        {
            int nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
            System.out.print(" " + nextNumber);
        }
    }
}
