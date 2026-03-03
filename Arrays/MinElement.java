/*
Problem:Find the minimum element in an array
Approach:Initialize min as first element. Traverse the array and update min whenever a smaller element is found.
Time Complexity:O(n)
Space Complexity:O(1)
*/

public class MinElement {

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 2, 7};

        int result = findMin(arr);

        System.out.println("Minimum element: " + result);
    }
}
