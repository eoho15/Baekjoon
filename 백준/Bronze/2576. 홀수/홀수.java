import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int min = 100;

        for(int i=0;i<7;i++){
            int number = scan.nextInt();
            if(number%2!=0){
                sum += number;
                min = Math.min(number,min);
            }

        }

        if(sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
        }
}
