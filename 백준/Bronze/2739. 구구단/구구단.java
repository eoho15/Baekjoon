import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for(int i=0;i<9;i++)

            System.out.printf("%d * %d = %d\n", num,i+1,num*(i+1));
    }
}
