import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class SubArraySum {

    static int getCountOfSubArray(int[] nums, int k) {
        /* Naive Approach */
//        int len = nums.length;
//        int[] tempArray = new int[len];
//        tempArray[0] = nums[0];
//        int count = 0;
//        for(int i = 1; i < len; i++) {
//            tempArray[i] = tempArray[i-1] + nums[i];
//        }
//        for(int i = 0; i < tempArray.length; i++) {
//            if(tempArray[i] == k) count++;
//            for(int j = i+1; j < tempArray.length; j++) {
//                if(tempArray[j] - tempArray[i] == k) count++;
//            }
//        }
//        return count;

        /* HashMap Approach */
        int count = 0, sum = 0;
        int len = nums.length;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        hashmap.put(0, 1);
        for(int i = 0; i < len; i++) {
            sum += nums[i];
            if(hashmap.containsKey(sum - k)) {
                count += hashmap.get(sum - k);
            }
            hashmap.put(sum, hashmap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = getCountOfSubArray(arr, target);
        System.out.println(result);
    }
}
