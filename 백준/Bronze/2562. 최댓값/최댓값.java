import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp = 0;

        int arr[] = new int[9];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scan.nextInt();

        int Max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= Max)
                Max = arr[i];
        }
        System.out.println(Max);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == Max)
                temp = i;
        }
        System.out.println(temp + 1);

    }
}
