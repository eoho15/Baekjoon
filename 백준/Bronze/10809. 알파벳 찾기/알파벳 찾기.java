import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        int[] array = new int[26];
        for(int i=0;i<array.length;i++){
            array[i] = -1;
        }

        for(int i=0;i<input.length();i++){
            char a = input.charAt(i);
            // 알파벳을 입력했을 때, 아스키코드 값에서 97을 빼면
            // a = 0 , b b = 1 , c = 2, d =3 , e = 4 ,...가 된다.
            if(array[a - 'a']==-1)
            array[a - 'a'] = i;
        }
        // 비어있는 문자열은 모두 -1에 대입한다.
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");

    }
}
