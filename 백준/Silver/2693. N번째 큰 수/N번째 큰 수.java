import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int testNum = scan.nextInt();

        int[] arr = new int[10];
        int[] results = new int[testNum];

        for(int i=0;i<testNum;i++){
            for(int j=0;j<10;j++){
                arr[j] = scan.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[7]);
        }

    }
}
