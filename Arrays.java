import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of integers
        System.out.print("How many numbers will you enter? ");
        int count = scanner.nextInt();
        int[] numbers = new int[count];

        // Read the numbers into the array
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Print the numbers entered
        System.out.println("The numbers you entered are:");
        printArray(numbers);

        // Get the interval size
        System.out.print("How many numbers per group? ");
        int interval = scanner.nextInt();

        // Display the numbers in groups with their sums
        System.out.println("\nGrouped Output:");
        displayGroupsWithSums(numbers, interval);
    }

    // Print all elements of the array on a single line
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Display the array in groups and show the sum for each group
    public static void displayGroupsWithSums(int[] array, int groupSize) {
        for (int i = 0; i < array.length; i += groupSize) {
            int sum = 0;

            for (int j = i; j < i + groupSize && j < array.length; j++) {
                System.out.print(array[j] + " ");
                sum += array[j];
            }

            System.out.println("Sum: " + sum);
        }
    }
}
