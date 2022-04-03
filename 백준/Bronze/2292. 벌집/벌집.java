import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        // 1 - 6 - 12 - 18

        int count = 1;
        int sum = 1;
        while(true){
            if(N <= sum){
                break;
            }
            sum += count *6;
            count++;
        }

        System.out.println(count);
    }
}
