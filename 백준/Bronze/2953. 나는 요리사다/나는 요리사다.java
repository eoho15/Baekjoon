import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[5][4];
        int[] sum = new int[5];
        int max = sum[0];
        int maxIndex = 0;

        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                arr[i][j]= scan.nextInt();
                sum[i] += arr[i][j];
            }
            if(sum[i]>max) {
                max = sum[i];
                maxIndex = i;
            }
        }

        System.out.print((maxIndex+1) +" ");
        System.out.print(Arrays.stream(sum).max().getAsInt());



    }
}
