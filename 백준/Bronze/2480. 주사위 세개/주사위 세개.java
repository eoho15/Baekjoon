import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max;
        int result;

        if(a >= b && a >=c)
            max = a;
        else if(b>=a && b>=c)
            max = b;
        else
            max = c;

        if(a==b && b==c){
            result = 10000 + a*1000;
            System.out.println(result);
        }

        else if(a==b && b!=c && a!=c){
            result = 1000+a*100;
            System.out.println(result);
        }

        else if(b==c && a!=c && a!=b){
            result = 1000+b*100;
            System.out.println(result);
        }

        else if(a==c && b!=c && a!=b){
            result = 1000+a*100;
            System.out.println(result);
        }

        else{
            result = max*100;
            System.out.println(result);
        }


    }
}