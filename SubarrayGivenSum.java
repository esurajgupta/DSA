import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayGivenSum {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of  array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter sum of  array: ");
        int sum = sc.nextInt();

        System.out.println("Enter array: ");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> l = subarraySum(arr, size, sum);
        System.out.println(l);

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {

        ArrayList<Integer> l = new ArrayList<>();
        int last = 0;
        int first = 0;
        int sum = 0;

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            while (sum > s) {
                sum -= arr[first];
                first++;
            }
            if (sum == s && s != 0) {
                l.add(first + 1);
                l.add(i + 1);
                flag = true;
                break;
            }
        }
        if (!flag)
            l.add(-1);
        return l;
    }

}
