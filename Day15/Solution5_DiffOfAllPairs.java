package Day15;

import java.util.*;

public class Solution5_DiffOfAllPairs {

    public static void findPairs(int arr[], int n, int target) {
        Arrays.sort(arr);

        int i = 0;
        int j = 1;

        while (j < n) {
            if (i == j) {
                j++;
                continue;
            }

            int diff = arr[j] - arr[i];

            if (diff == target) {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j++;

                while (i < n && j < n && arr[i] == arr[i - 1]) i++;
                while (j < n && arr[j] == arr[j - 1]) j++;
            } else if (diff < target) {
                j++;
            } else {
                i++;
                if (i == j) j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        findPairs(arr, n, target);

        sc.close();
    }
}