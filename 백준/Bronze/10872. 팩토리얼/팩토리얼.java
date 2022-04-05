import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(fact(scan.nextInt()));

    }

    public static int fact(int n){
        if(n>0)
            return n*fact(n-1);
        else
            return 1;
    }


}
