/*
Problem:Find the maximum element in an array
Approach: take first element as Max. Traverse the array and update max whenever a larger element is found.
Time Complexity: O(n)
Space Complexity:O(1)
*/

public class MaxElement {

    public static int findMax(int[] arr) {
        int max = arr[0];   // initial max

        for (int i = 1; i < arr.length; i++) {  // loop from index 1
            if (arr[i] > max) {                 // comparison
                max = arr[i];                   // update
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 2, 7};

        int result = findMax(arr);

        System.out.println("Maximum element: " + result);
    }
}
