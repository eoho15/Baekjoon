import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        for(int i=0;i<inputNum;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(a+b);
        }

    }
}
