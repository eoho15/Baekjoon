import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt();
        int[] arr2 = new int[cnt];
        int result = 0;
        for(int i=0;i<cnt;i++) {
            arr2[i] = scan.nextInt();
        }
        Arrays.sort(arr2);


        result = arr2[0]*arr2[cnt-1];

        System.out.print(result);
    }
}
