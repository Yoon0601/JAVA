package Chapter3;

import java.util.Scanner;

public class RockScissorPaper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str[]={"가위","바위","보"};
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        while(true){
            int n=(int)(Math.random()*3);
            System.out.print("가위 바위 보!>>");
            String user=sc.next();
            if(user.equals("그만")){
                System.out.println("게임을 종료합니다.....");
                break;
            }
            if(str[n].equals(user)){
                System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 비겼습니다.");
            }
            else{
                if(str[n].equals("가위")){
                    if(user.equals("바위")){
                        System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 이겼습니다.");
                    }
                    else if(user.equals("보")){
                        System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 졌습니다.");
                    }
                    else{
                        System.out.println("제대로 가위바위보 하세요");
                    }
                }
                else if(str[n].equals("바위")){
                    if(user.equals("보")){
                        System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 이겼습니다.");
                    }
                    else if(user.equals("가위")){
                        System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 졌습니다.");
                    }
                    else{
                        System.out.println("제대로 가위바위보 하세요");
                    }
                }
                else if(str[n].equals("보")){
                    if(user.equals("가위")){
                        System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 이겼습니다.");
                    }
                    else if(user.equals("바위")){
                        System.out.println("사용자 = "+user+" , 컴퓨터 = "+str[n]+", 졌습니다.");
                    }
                    else{
                        System.out.println("제대로 가위바위보 하세요");
                    }
                }
            }
        }
    }
}
