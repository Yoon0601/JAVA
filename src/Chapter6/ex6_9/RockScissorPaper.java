package Chapter6.ex6_9;

import java.util.Scanner;

//철수와 컴퓨터의 가위바위보 게임을 만들어보자. 가위, 바위, 보는 각각 1, 2, 3 키이다.
// 철수가 키를 입력하면, 동시에 프로그램도 Math.Random()을 이용하여 1, 2, 3 중에 한 수를 발생시키고 이것을 컴퓨터가 낸 것으로 한다.
// 그런 다음 철수와 컴퓨터 중 누가 이겼는지 판별하여 승자를 출력하라.
//
//철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>1
//철수(가위) : 컴퓨터(바위)
//컴퓨터가 이겼습니다.
//철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>3
//철수(보) : 컴퓨터(바위)
//철수가 이겼습니다.
//철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>4
class Person{
    private String name;
    private Scanner sc=new Scanner(System.in);
    public Person(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int turn(){
        System.out.print(name+"[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
        return sc.nextInt();
    }
}
class Computer extends Person{
    public Computer(String name){
        super(name);
    }
    public int turn(){
        return (int)(Math.random()*3+1);
    }
}
public class RockScissorPaper {
    private String s[]={"가위","바위","보"};
    private Person[] p=new Person[2];
    public RockScissorPaper(){
        p[0]=new Person("철수");
        p[1]=new Computer("컴퓨터");
    }
    public void run(){
        int userChoice,comChoice;
        while(true){
            userChoice=p[0].turn();
            if(userChoice==4)
                break;
            comChoice=p[1].turn();
            if(userChoice<1 || comChoice>3){
                System.out.println("잘못 입력하셨습니다.");
            }
            else{
                System.out.print(p[0].getName()+"("+s[userChoice-1]+") : ");
                System.out.println(p[1].getName()+"("+s[comChoice-1]+") : ");
                int diff=userChoice - comChoice;
                switch(diff){
                    case 0:
                        System.out.println("비겼습니다.");
                        break;
                    case 1:
                    case -2:
                        System.out.println(p[0].getName()+"가 이겼습니다");
                        break;
                    case 2:
                    case -1:
                        System.out.println(p[1].getName()+"가 이겼습니다.");
                        break;
                }
            }
        }
    }
    public static void main(String[] args) {
        RockScissorPaper rcp=new RockScissorPaper();
        rcp.run();
    }
}
