import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[9];
        int sum =0;
        for(int i=0;i<9;i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }


        int mafia1 = 0;
        int mafia2 = 0;

        for(int i=0;i<9;i++){
            for(int j=1;j<9;j++){
                if( sum-arr[i]-arr[j] == 100){
                   mafia1 = arr[i];
                    mafia2 = arr[j];
                    break;
                }
            }
        }


        Arrays.sort(arr);

         for(int i=0;i<9;i++){
             if(arr[i] == mafia1 || arr[i] == mafia2) {
                 continue;
             }
             else
                 System.out.println(arr[i]);
         }





    }
}
