package Chapter2;

import java.util.Scanner;

public class ex2_10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력 ");
        int x= scanner.nextInt();
        int x1= scanner.nextInt();
        double r= scanner.nextDouble();
        System.out.print("두번째 원의 중심과 반지름 입력 ");
        int y= scanner.nextInt();
        int y1= scanner.nextInt();
        double r1= scanner.nextDouble();
        double distance=Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
        if(distance<=r+r1){
            System.out.println("두 원은 서로 겹친다.");
        }
        else {
            System.out.println("두 원은 서로 겹치지 않는다");
        }
    }
}
