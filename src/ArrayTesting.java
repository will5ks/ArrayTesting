import java.util.Random;

public class ArrayTesting {
    public static void main(String[] args) {
        //Declarations
        Random rnd = new Random();
        int [] dataPoints = new int[50];
        int sum = 0;
        int average;

        //Initialize elements of array
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(50);
        }

        //Display all elements
        for (int element : dataPoints)
        {
            System.out.print(element + " | ");
        }

        //Calculate sum and average
        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }
        average = sum / dataPoints.length;

        //Print out sum and average
        System.out.println("\nThe sum of the random array dataPoints is " + sum + ".");
        System.out.println("The average of the random array dataPoints is " + average + ".");
    }
}
