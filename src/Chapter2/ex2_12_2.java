package Chapter2;

import java.util.Scanner;

public class ex2_12_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("연산 ");
        int a= scanner.nextInt();
        String b= scanner.next();
        int c= scanner.nextInt();
        int result = 0;
        switch (b){
            case "+": result=a+c; break;
            case "-" : result=a-c; break;
            case "*" : result=a*c; break;
            case "/" :
                if(c==0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    scanner.close();
                    return;
            }
                result=a/c; break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }
        System.out.println(a+b+c+"의 계산 결과는 "+result);
    }
}
