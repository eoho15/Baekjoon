import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        int maxNum = scan.nextInt();

        int arr[] = new int[count];

        for(int i=0;i<count;i++){
            arr[i]= scan.nextInt();
        }

        for(int i=0;i<count;i++){
            if(arr[i]<maxNum)
                System.out.print(arr[i]+" ");

        }


    }
}
