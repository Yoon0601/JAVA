package Chapter7.ex7_7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//이름과 학점(4.5만점)을 5개 입력받아 해시맵에 저장하고,
//장학생 선발 기준을 입력 받아 장학생 명단을 출력하라.
//미래장학금관리시스템입니다.
//
//이름과 학점 >> 적당히 3.1
//
//이름과 학점 >> 나탈락 2.4
//
//이름과 학점 >> 최고조 4.3
//
//이름과 학점 >> 상당히 3.9
//
//이름과 학점 >> 고득점 4.0
//
//장학생 선발 학점 기준 입력 >> 3.2
//
//장학생 명단 : 최고조 상당히 고득점
//
//[Hint] HashMap의 전체 요소를 검색하여 학점이 3.2 이상인 학생을 알아내야 한다.
// 예제 7-6은 해시맵 전체를 검색하는 코드 사례를 보여준다.
public class ex7_7 {
    public static void main(String[] args) {
        HashMap<String,Double> info = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("미래장학금관리시스템입니다");
        for(int i=0;i<5;i++){
            System.out.print("이름과 학점 >> ");
            String name = sc.next();
            Double grade = sc.nextDouble();
            info.put(name,grade);
        }
        System.out.print("장학생 선발 학점 기준 입력 >> ");
        double standard = sc.nextDouble();
        System.out.print("장학생 명단 : ");
        Set<String> key = info.keySet();
        Iterator<String> it = key.iterator();
        while(it.hasNext()){
            String name = it.next();
            double grade = info.get(name);
            if(grade>standard){
                System.out.print(name+" ");
            }
        }
        System.out.println();
    }
}
