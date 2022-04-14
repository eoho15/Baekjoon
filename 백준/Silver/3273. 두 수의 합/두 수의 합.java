import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int arr[] = new int[T];

        for(int i=0;i<arr.length;i++)
            arr[i] = scan.nextInt();

        Arrays.sort(arr);
        //Arrays 클래스의 sort메소드..(정렬을 해준다)

        int result = scan.nextInt();
        int sum = 0;
        int count = 0;
        int end = T-1;
        int start = 0;

        while(start<end) {
            if (arr[start] + arr[end] == result) {
                count++;
                start++;
                end--;
            } else if (arr[start] + arr[end] < result)
                start++;

            else
                end--;

        }
        System.out.println(count);
        }

    }