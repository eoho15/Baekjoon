import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int bulgiyear = scan.nextInt();
        int chrisyear = bulgiyear - 543;

        System.out.println(chrisyear);

    }
}
