import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int inputNum = scan.nextInt();

            if(inputNum < 10 && inputNum>0){
                inputNum = inputNum*10 + inputNum;
            }
            else if(inputNum <0){
                System.out.println("자연수만 입력해 주세요!");
            return;
            }

            int left = 0;
            int right = 0;
            int sum = inputNum;
            int count = 0;



        while(true){
                right = sum%10;
               //6
               left = sum/10;
               //2
               sum = right+left;
               //8
               sum = right*10 + sum%10;
               // 68
                count++;
               if(sum == inputNum)
                   break;
        }

        System.out.println(count);
    }
}
