package Chapter7.ex7_3;

import java.util.HashMap;
import java.util.Scanner;

//"그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고, 다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라. 다음 해시맵을 이용하라.
//나라 이름과 인구를 입력하세요.(예: Korea 5000)
//나라 이름, 인구 >> Korea 5000
//나라 이름, 인구 >> USA 1000000
//나라 이름, 인구 >> Swiss 2000
//나라 이름, 인구 >> France 3000
//나라 이름, 인구 >> 그만
//인구 검색 >> France
//France의 인구는 3000
//인구 검색 >> 스위스
//스위스 나라는 없습니다.
//인구 검색 >> 그만
public class HashMapNation {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 입력하세요.(예 : Korea 5000)");
        while(true){
            System.out.print("나라 이름, 인구 >> ");
            String nation = sc.next();
            if(nation.equals("그만")){
                break;
            }
            int population = sc.nextInt();
            hashMap.put(nation,population);
        }
        while(true){
            System.out.print("인구 검색 >> ");
            String nation =sc.next();
            if(nation.equals("그만")){
                break;
            }
            Integer n = hashMap.get(nation);
            if(n==null){
                System.out.println(nation+" 나라는 없습니다.");
            }
            else{
                System.out.println(nation+"의 인구는 "+n);
            }
        }
    }
}
