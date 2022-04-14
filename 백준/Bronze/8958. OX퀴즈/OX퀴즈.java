import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();


        for(int i=0;i<T;i++){
            char[] str = scan.next().toCharArray();
            int sum = 0;
            int cnt = 0;
            for(int j=0;j<str.length;j++){
                if(str[j] == 'O') {
                    cnt++;
                }
                else {
                    cnt = 0;
                }
                sum = cnt + sum;
            }

            System.out.println(sum);

        }
    }
}
