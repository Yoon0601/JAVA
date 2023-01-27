package Chapter6.ex6_11;

import java.util.Scanner;

//[6장 11번]
//StringBuffer 클래스를 활용하여 명령처럼 문자열을 수정하라. 아래 실행 예시에서 love!LOVE는 love를 찾아 LOVE로 수정하라는 명령이다. 첫 번째 만난 문자열만 수정한다.
//>>우리는 love Java Programming.
//명령: 우리는!We
//We love Java Programming.
//명령: LOV!사랑
//찾을 수 없습니다!
//명령: !Java
//찾을 수 없습니다!
//명령: love!LOVE
//We LOVE Java Programming.
//명령: 그만
//종료합니다
public class WordReplace {
    public static void main(String[] args) {
        System.out.print(">>");
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        StringBuffer stringBuffer=new StringBuffer(text);
        while(true){
            System.out.print("명령 : ");
            String cmd = sc.nextLine();
            if(cmd.equals("그만")){
                System.out.println("종료합니다.");
                break;
            }
            String token[]=cmd.split("!");
            if(token.length !=2){
                System.out.println("잘못된 명령입니다.");
            }
            else{
                if(token[0].length()==0 || token[1].length()==0){
                    System.out.println("잘못된 명령입니다.");
                    continue;
                }
                int index=stringBuffer.indexOf(token[0]);
                if(index == -1){
                    System.out.println("찾을 수 없습니다.");
                    continue;
                }
                stringBuffer.replace(index,index+token[0].length(),token[1]);
                System.out.println(stringBuffer.toString());
            }
        }
    }
}
