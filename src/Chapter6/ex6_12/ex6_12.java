package Chapter6.ex6_12;

import java.util.Scanner;

//문제 10의 갬블링 게임을 n명이 하도록 수정하라. 실행 예시와 같이 게임에 참여하는 선수의 수를 입력받고 각 선수의 이름을 입력받도록 수정하라.
//
//겜블링 게임에 참여할 선수 숫자>>3
//1번째 선수 이름>>황
//2번째 선수 이름>>이
//3번째 선수 이름>>김
//[황]:
//	2  3  3  아쉽군요!
//[이]:
//	1  2  2  아쉽군요!
//[김]:
//	2  2  3  아쉽군요!
//[황]:
//	3  2  2  아쉽군요!
//[이]:
//	1  1  3  아쉽군요!
//[김]:
//	2  2  1  아쉽군요!
//[황]:
//	2  2  2  황님이 이겼습니다!
class Person{
    public String name;
    private int num1,num2,num3;
    public Person(String name){
        this.name=name;
    }
    public boolean game(){
        num1=(int)((Math.random()*3)+1);
        num2=(int)((Math.random()*3)+1);
        num3=(int)((Math.random()*3)+1);
        System.out.print("\t"+num1+" "+num2+" "+num3+" ");
        if(num1==num2 && num2==num3){
            return true;
        }
        else{
            return false;
        }
    }
}

public class ex6_12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("겜블링 게임에 참여할 선수 숫자 >>");
        int num = sc.nextInt();
        Person[] p=new Person[num];
        for(int i=0;i<num;i++){
            System.out.print((i+1)+"번째 선수 이름 : ");
            String name=sc.next();
            p[i]=new Person(name);
        }
        String buffer =sc.nextLine();
        while(true){
            for(int i=0;i<num;i++){
                System.out.print("["+p[i].name+"] : <Enter>");
                buffer=sc.nextLine();
                if(p[i].game()){
                    System.out.println(p[i].name+"님이 이겼습니다.");
                    return;
                }
                System.out.println("아쉽군요");


            }
        }
    }
}
