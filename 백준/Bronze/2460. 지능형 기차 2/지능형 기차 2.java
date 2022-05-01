import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[10][2];
        int Max1 = 0;
        int result = 0;

        for(int i=0;i<10;i++){
            arr[i][0] = scan.nextInt();
            arr[i][1] = scan.nextInt();

            Max1 = (arr[i][1] - arr[i][0]) + Max1;
            if(Max1 > result)
                result = Max1;
        }

        System.out.println(result);

    }
}
