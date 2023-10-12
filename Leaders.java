import java.util.Scanner;
import java.util.*;

class leader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int[] Arr = new int[size];

        System.out.println("Enter Array:");
        for (int i = 0; i < size; i++) {
            Arr[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<>();
        list = findLader(Arr, size);
        System.out.println(list);
    }

    static ArrayList<Integer> findLader(int arr[], int n) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int maxRight = arr[n - 1];
        leaders.add(maxRight);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leaders.add(maxRight);
            }
        }
        Collections.reverse(leaders);
        return leaders;

    }
}