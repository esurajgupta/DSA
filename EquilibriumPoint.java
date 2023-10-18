/*
 * Given an array A of n positive numbers. The task is to find the first
 * equilibrium point in an array. Equilibrium point in an array is an index (or
 * position) such that the sum of all elements before that index is same as sum
 * of elements after it.
 * 
 * Note: Return equilibrium point in 1-based indexing. Return -1 if no such
 * point exists.
 * 
 * Example 1:
 * 
 * Input:
 * n = 5
 * A[] = {1,3,5,2,2}
 * Output:
 * 3
 * Explanation:
 * equilibrium point is at position 3 as sum of elements before it (1+3) = sum
 * of elements after it (2+2).
 * Example 2:
 * 
 * Input:
 * n = 1
 * A[] = {1}
 * Output:
 * 1
 * Explanation:
 * Since there's only element hence its only the equilibrium point.
 */

import java.util.*;

/**
 * EquilibriumPoint
 */

public class EquilibriumPoint {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of  array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int EB_POINT = FindEquilibriumPoint(arr, size);
        System.out.println(EB_POINT);

    }

    public static int FindEquilibriumPoint(int arr[], int size) {

        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        int curSum = 0;
        for (int i = 0; i < size; i++) {

            if (sum - curSum - arr[i] == curSum) {
                return i + 1;
            }
            curSum += arr[i];
        }

        return -1;

    }
}
