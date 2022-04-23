
import java.io.*;

class Stack{
    private int top;  // 원소의 위치 관리할 top변수
    private int stackArr[]; // 배열을 이용한 스택

    public Stack(int size){
        this.top = -1;
        this.stackArr = new int[size];
    }

    // push메소드
    public void push(int x){
        this.stackArr[++top] = x;
    }

    // pop메소드
    public int pop(){
        if(top == -1) return -1;
        return this.stackArr[top--];
    }

    // size메소드
    public int size(){
        return this.top +1;
    }

    // empty 메소드
    public int empty(){
        if(top == -1) return 1;
        return 0;
    }

    public int top(){
        if(top == -1) return -1;
        else return this.stackArr[top];
    }
}



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 명령어 수.
        int n = Integer.parseInt(br.readLine());

        Stack stack = new Stack(n);

        for(int i=0;i<n;i++){
            String cons = br.readLine();

            if(cons.contains("push")) { // push 명령어
                String spt[] = cons.split(" "); // 공백 기준 분할.
                stack.push(Integer.parseInt(spt[1])); // 분할된 정수를 push.
            }else if(cons.contains("pop")) { // pop 명령어
                bw.write(String.valueOf(stack.pop())+"\n");
            }else if(cons.contains("size")) { // size 명령어
                bw.write(String.valueOf(stack.size())+"\n");
            }else if(cons.contains("empty")) { // empty 명렁어
                bw.write(String.valueOf(stack.empty())+"\n");
            }else if(cons.contains("top")) { // top 명령어
                bw.write(String.valueOf(stack.top())+"\n");
            }
        }
        bw.flush();
        bw.close();


    }
}
