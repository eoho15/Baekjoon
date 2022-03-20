import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();

        for (int i = 1; i <= inputNum; i++) {
            for(int j=inputNum;j>0;j--){
                if(j>i)
                System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}