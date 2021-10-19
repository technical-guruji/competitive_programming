// https://leetcode.com/problems/intersection-of-two-arrays-ii/

import java.util.*;

public class IntersectionofTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] arr1 = new int[m];
        int[] arr2 = new int[n];

        for(int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        /* Naive Approach */
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        int top = 0, bottom = 0;
//        List<Integer> array = new ArrayList<>();
//
//        while(true) {
//            if(top >= arr1.length || bottom >= arr2.length) {
//                break;
//            }
//
//            if(arr1[top] == arr2[bottom]) {
//                array.add(arr1[top]);
//                top++;
//                bottom++;
//            } else if(arr1[top] < arr2[bottom]) {
//                top++;
//            } else if(arr1[top] > arr2[bottom]) {
//                bottom++;
//            }
//        }
//
//        int[] res = new int[array.size()];
//
//        for(int i = 0; i < array.size(); i++) {
//            res[i] = array.get(i);
//            System.out.print(res[i] + " ");
//        }

        /* Best Approach - Using HashMap */
        Map<Integer, Integer> hmap = new HashMap<>();
        int k = 0;

        for(int i = 0; i < arr1.length; i++) {
            hmap.put(arr1[i], hmap.getOrDefault(arr1[i], 0)+1);
        }

        for(int i = 0; i < arr2.length; i++) {
            if(hmap.containsKey(arr2[i]) && hmap.get(arr2[i]) > 0) {
                arr1[k] = arr2[i];
                k++;
            }
            hmap.put(arr2[i], hmap.getOrDefault(arr2[i], 0)-1);
        }

        int[] result = Arrays.copyOfRange(arr1, 0, k);

        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
