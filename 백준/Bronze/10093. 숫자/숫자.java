import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long a = scan.nextLong();
        Long b = scan.nextLong();


        if(a>b) {
            System.out.println(a-b-1);
            for (Long i = b + 1; i < a; i++)
                System.out.print(i + " ");
        }
        else if(a<b){
            System.out.println(b-a-1);
            for(Long i = a+1; i<b;i++)
                System.out.print(i + " ");
        }
        else
        System.out.print(0);
        }
}
