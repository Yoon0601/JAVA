package Chapter2;

import java.util.Scanner;

public class ex2_9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력 ");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double r= scanner.nextDouble();
        System.out.print("점 입력 ");
        double x= scanner.nextDouble();
        double y= scanner.nextDouble();
        double distance=Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
        if(distance<=r){
            System.out.println("원의 내부에 있습니다.");
        }
        else {
            System.out.println("원의 외부에 있습니다.");
        }
    }
}
