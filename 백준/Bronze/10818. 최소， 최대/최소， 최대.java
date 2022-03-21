import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numCnt = scan.nextInt();
        int[] arr = new int[numCnt];

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        scan.close();

        int Min = arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] <= Min) {
                Min = arr[i];
            }
        }

            int Max = arr[0];
            for(int i=0;i<arr.length;i++) {
                if (arr[i] >= Max) {
                    Max = arr[i];
                }
            }

        System.out.printf("%d %d",Min,Max);
    }
}
