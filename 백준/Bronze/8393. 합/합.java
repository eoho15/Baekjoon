import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int sum = 0;

        for(int i=0;i<a;i++)
            sum += i+1;

        System.out.println(sum);
    }
}
