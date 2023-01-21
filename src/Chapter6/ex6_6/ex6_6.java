package Chapter6.ex6_6;

import Chapter6.ex6_3.etc.Calc;

import java.util.Calendar;
import java.util.Scanner;

//경과시간을 맞추는 게임을 작성하라. 다음 예시를 참고하면, <Enter> 키를 입력하면 현재 초 시간을 보여주고
// 여기서 10초에 더 근접하도록 다음 <Enter> 키를 입력한 사람이 이기는 게임이다.
//
//10초에 가까운 사람이 이기는 게임입니다.
//황기태 시작 키  >>
//	현재 초 시간 = 42
//10초 예상 후 키  >>
//	현재 초 시간 = 50
//이재문 시작 키  >>
//	현재 초 시간 = 51
//10초 예상 후 키  >>
//	현재 초 시간 = 4
//황기태의 결과 8, 이재문의 결과 13, 승자는 황기태
class Person{
    Calendar now =Calendar.getInstance();
    Scanner sc=new Scanner(System.in);
    private String name,buffer;
    private int sec1,sec2;
    public Person(String name){
        this.name=name;
    }
    public int game(){
        System.out.print(name+" 시작 키 >>");
        sec1=enter();
        System.out.print("10초 예상 후 <Enter> 키 >>");
        sec2=enter();
        if(sec1<sec2){
            return sec2-sec1;
        }
        else{
            return (60-sec1)+sec2;
        }
    }
    public int enter(){
        buffer=sc.nextLine();
        now=Calendar.getInstance();
        System.out.println("\t현재 초 시간 = "+now.get(Calendar.SECOND));
        return now.get(Calendar.SECOND);
    }
}
public class ex6_6 {
    public static void main(String[] args) {
        Person p1=new Person("황기태");
        Person p2=new Person("이재문");
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        int result1=p1.game();
        int result2=p2.game();

        if(Math.abs(result1-10)<Math.abs(result2-10)){
            System.out.println("황기태의 결과 "+result1+", 이재문의 결과 "+result2+", 승자는 황기태");
        }
        else{
            System.out.println("황기태의 결과 "+result1+", 이재문의 결과 "+result2+", 승자는 이재문");
        }
    }

}
