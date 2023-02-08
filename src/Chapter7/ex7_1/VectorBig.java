package Chapter7.ex7_1;

import java.util.Scanner;
import java.util.Vector;

//[7장 1번]
//
//Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 벡터에 저장하고 벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.
//
//정수(-1이 입력될 때까지)>> 10 6 22 6 88 77 -1
//
//가장 큰 수는 88
public class VectorBig {
    public static void printBig(Vector<Integer> v) {
        int big = v.get(0);
        for (int i = 1; i < v.size(); i++) {
            if (big < v.get(i)) {
                big = v.get(i);
            }
        }
        System.out.println("가장 큰 수는 " + big);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        System.out.print("정수(-1이 입력될 때까지) >> ");
        while (true) {
            int num = sc.nextInt();
            if (num == -1){
                break;
            }
            v.add(num);
        }
        if(v.size()==0){
            System.out.println("수가 하나도 없음");
            return;
        }
        printBig(v);
    }
}
