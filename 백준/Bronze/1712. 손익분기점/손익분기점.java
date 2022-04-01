import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int result = 0;

        if(b>=c)
            result=-1;
            else{
                result = a/(c-b)+1;

        }

        System.out.println(result);
    }
}
