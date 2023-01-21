package Chapter2;

import java.util.Scanner;

public class ex2_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("2자리수 정수 입력 : ");
        int number=scanner.nextInt();
        int number1=number/10;
        int number2=number%10;
        if(number1==number2){
            System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        }
        else{
            System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        }
        scanner.close();
    }
}
