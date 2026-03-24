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
            dataPoints[i] = random.nextInt(100) + 1;
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

        int userValue = SafeInput.getRangedInt(in, "Enter value to search", 1, 100);

        int count = 0;
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == userValue) count++;
        }
        System.out.println("The value " + userValue + " appears " + count + " times.");

        int searchValue = SafeInput.getRangedInt(in, "Enter value to search for", 1, 100);
        int index = -1;
        boolean found = false;
        for(int i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == searchValue)
            {
                index = i;
                found = true;
                break;
            }
        }
        if(found) System.out.println("The value " + searchValue + " was found at array index " + index);
        else System.out.println("The value " + searchValue + " was not found.");

        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int i = 1; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min) min = dataPoints[i];
            if(dataPoints[i] > max) max = dataPoints[i];
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        int sum = 0;
        for(int i = 0; i < values.length; i++)
        {
            sum += values[i];
        }
        return (double)sum / values.length;
    }
}
