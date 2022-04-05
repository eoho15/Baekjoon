import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inputNumb = scan.nextInt();
        System.out.println(fibo(inputNumb));
    }

    static int fibo(int number){
        if(number >2)
            return fibo(number-1)+fibo(number-2);
        else if(number ==0)
            return 0;
        else
            return 1;
    }
}
