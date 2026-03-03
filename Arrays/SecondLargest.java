/*
Problem:Find the second largest element in an array
Approach:Maintain two variables: largest and secondLargest.Update them while traversing the array in one pass.
Time Complexity:O(n)
Space Complexity:O(1)
*/

public class SecondLargest {

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 2, 7};

        int result = findSecondLargest(arr);

        System.out.println("Second Largest element: " + result);
    }
}
