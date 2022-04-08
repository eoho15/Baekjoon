import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int yongsik = 0;
        int sum1 = 0;
        int sum2 = 0;
        int minsik = 0;
        for(int i=0;i<T;i++) {
            int minute = scan.nextInt();

                yongsik = ((minute/30)+1) * 10;

                minsik = ((minute/60)+1)*15;


            sum1 += yongsik;
            sum2 += minsik;
            }


        int result = Math.min(sum1,sum2);
        if(sum1>sum2)
            System.out.println("M "+result);
        else if(sum1<sum2)
            System.out.println("Y "+result);
        else
            System.out.println("Y M "+result);



    }
}
