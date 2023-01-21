package Chapter2;

import java.util.Scanner;

public class ex2_12_1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("연산 ");
        int a= scanner.nextInt();
        String b= scanner.next();
        int c= scanner.nextInt();
        if(b.equals("+")){
            System.out.println(a+"+"+c+"의 계산 결과는"+(a+c));
        }
        else if(b.equals("-")){
            System.out.println(a+"-"+c+"의 계산 결과는"+(a-c));
        }
        else if(b.equals("*")){
            System.out.println(a+"*"+c+"의 계산 결과는"+(a*c));
        }
        else if(b.equals("/")){
            if(c==0){
                System.out.println("0으로 나눌 수 없습니다.");
                scanner.close();
                return;
            }
            System.out.println(a+"/"+c+"의 계산 결과는"+(a/c));
        }
        else {
            System.out.println("잘못된 입력입니다");
        }
    }
}
