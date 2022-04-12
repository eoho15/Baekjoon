
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b =scan.nextInt();
        int c =scan.nextInt();
        int result = a*b*c;

        int[] remainder = new int[10];

        while(result != 0){
            remainder[result%10]++;
            result /=10;

        }

        for(int i=0;i<10;i++)
            System.out.println(remainder[i]);

    }
}
