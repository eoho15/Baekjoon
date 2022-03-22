import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arr[] = new int[10];
        int remainder[] = new int[10];
        int count = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt();
            remainder[i] = arr[i] % 42;
        }

        for(int j=0;j<remainder.length;j++){
            boolean b = false; // 서로 다른 값이라고 가정
            for(int k=j+1;k<remainder.length;k++){
                if(remainder[j]==remainder[k]){
                    b = true;
                    break;
                }
            }
            if(b==false)
                count++;
        }
        System.out.println(count);
    }
}
