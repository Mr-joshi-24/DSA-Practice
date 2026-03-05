/*
Problem: Two Sum
Given an array of integers and a target value, return the indices of two numbers
such that they add up to the target.

Example:
Input: arr = [2,7,11,15], target = 9
Output: [0,1]

Approach:Use a HashMap to store numbers and their indices.For each element, check if (target - current element) exists in the map.

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int needed = target - arr[i];

            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
