package Chapter2;

import java.util.Scanner;

public class ex2_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오. ");
        int num= scanner.nextInt();
        int num1=num/10;
        int num2=num%10;

        if(((num1==3) || (num1==6) || (num1==9)) && ((num2== 3) || (num2 == 6) || (num2 == 9))) {
            System.out.println("박수짝짝");
        }
        else if (((num1==3) || (num1==6) || (num1==9)) || ((num2== 3) || (num2 == 6) || (num2 == 9))) {
            System.out.println("박수짝");
        }
        else{
            System.out.println("범위에 벋어납니다!");
        }
    }
}
