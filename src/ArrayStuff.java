import java.util.Random;
import java.util.Scanner;

public class ArrayStuff
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[] dataPoints = new int[100];
        for(int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = random.nextInt(100);
        }
        for(int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println();

        int sum = 0;
        for(int i = 0; i < dataPoints.length; i++)
        {
            sum += dataPoints[i];
        }
        double average = (double)sum / dataPoints.length;
        System.out.println("The sum of dataPoints is: " + sum);
        System.out.println("The average of dataPoints is: " + average);
    }
}
