package Chapter3;

import java.util.Scanner;

public class ex3_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("정수 몇개?");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            int rand=(int)(Math.random()*100);
            System.out.print(rand+" ");
            if(i%10==0) {
                System.out.println();
            }
        }
    }
}
