import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        int n = arr.size();
        
        // Calculate effective rotations
        k = k % n;

        // Create a new ArrayList to hold the rotated elements
        ArrayList<Integer> rotatedArray = new ArrayList<>();

        // Add the elements from index k to n
        for (int i = k; i < n; i++) {
            rotatedArray.add(arr.get(i));
        }

        // Add the elements from index 0 to k
        for (int i = 0; i < k; i++) {
            rotatedArray.add(arr.get(i));
        }

        return rotatedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        // Read the number of rotations
        int k = scanner.nextInt();

        // Rotate the array
        ArrayList<Integer> result = rotateArray(arr, k);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }

        // Close the scanner
        scanner.close();
    }
}
