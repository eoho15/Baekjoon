import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Boolean going = true;

        while(going){
            int a = scan.nextInt();
            int b = scan.nextInt();
            if(a+b==0) {
                System.out.println();
                going = false;
            }
            else 
                System.out.println(a+b);
        }
    }
}
