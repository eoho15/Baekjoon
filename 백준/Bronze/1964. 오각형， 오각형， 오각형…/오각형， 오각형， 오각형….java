import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        long result = 5;

        if(a==1){
            System.out.println(result%45678);
        }else {
            for (int i = 1; i < a; i++){
                    result = result + ((i + 2) * 3 - 2);
            }
            System.out.println(result%45678);
        }

    }
}

