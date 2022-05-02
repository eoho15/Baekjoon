import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int lcm = 0;
        int gcd = 0;
        int cnt = 1;

        for(int i=1;i<=a;i++){
            if(a%i==0 && b%i==0){
                if(gcd < i) {
                    gcd = i;
                }
            }
        }

        lcm = gcd * (a/gcd) * (b/gcd);
        
        System.out.println(gcd);
        System.out.println(lcm);


    }
}
