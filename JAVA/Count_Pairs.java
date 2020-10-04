import java.util.Scanner;

public class Count_Pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k, i, j, count, num_cnt = 0;
        n = sc.nextInt();
        k = sc.nextInt();
        int[] arr = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        for(i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(i = 0; i < n; i++) {
            x[i] = arr[i] - k;
            y[i] = arr[i] + k;
            count = 0;
            if(count > 0) {
                num_cnt++;
            }
        }
        System.out.println(num_cnt);
    }
}
