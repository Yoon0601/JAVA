package Chapter7.ex7_9;

import java.util.Vector;

//    IStack<T> 인터페이스를 구현(implements)하는 MyStack<T> 클래스를 작성하라.
//    스택의 원소는 Vector<E>를 이용하여 저장하라.
//    다음은 MyStack<Integer>로 구체화한 정수 스택을 생성하고 활용하는 코드와 실행 결과이다.

public class StackManager {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i=0; i<10; i++) stack.push(i);
        while(true) {
            Integer  n = stack.pop();
            if(n == null) break;
            System.out.print(n+" ");
        }
    }
}