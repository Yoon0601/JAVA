package Chapter3;

import java.util.Random;
import java.util.Scanner;

public class updownGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int decision= (int)(Math.random()*100);
        int i=1;
        int min=0;
        int max=99;
        System.out.println(decision);
        System.out.println("수를 결정하였습니다. 맞추어보세요");
        System.out.println("0-99");
        while(true){
            System.out.print(i+">>");
            int n = scanner.nextInt();
            if(decision>n){
                System.out.println("더 높게");
                min=n;
            }
            else if(decision<n){
                System.out.println("더 낮게");
                max=n;
            }
            else{
                System.out.println("맞았습니다");
                System.out.print("다시 하시겠습니까(y/n) >>");
                String reset=scanner.next();
                if(reset.equals("n"))
                    break;
                else i=0; continue;
            }
            System.out.println(min+"-"+max);
            i++;
        }

    }
}
