// https://leetcode.com/problems/contains-duplicate/

import java.util.*;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        /* Naive Approach */
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    flag += 1;
                }
            }
        }

        if(flag > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /* Better Approach */
        Arrays.sort(arr);
        for(int i = 1; i < n; i++) {
            if(arr[i-1] == arr[i]) {
                flag += 1;
            }
        }

        if(flag > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /* Best Approach */
        if(arr == null || arr.length == 0) {
            System.out.println("false");
        }

        HashSet<Integer> arrSet = new HashSet<>();

        for(int i : arr) {
            if(!arrSet.add(i)) {
                flag += 1;
            }
        }

        if(flag > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
