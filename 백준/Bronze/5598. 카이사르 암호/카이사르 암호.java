import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        char[] arr = new char[input.length()];

        for(int i=0;i<input.length();i++){
            if (input.charAt(i) == 'A')
                arr[i] = 'X';
            else if(input.charAt(i) == 'B')
                arr[i] = 'Y';
            else if(input.charAt(i) == 'C')
                arr[i] = 'Z';
            else
                arr[i] = (char) (input.charAt(i)-3);
        }

        for(int i=0;i<input.length();i++)
            System.out.print(arr[i]);


    }
}
