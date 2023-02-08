package Chapter7.ex7_8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//고객의 이름과 포인트 점수를 관리하는 프로그램을 해시맵을 이용하여 작성하라.
// 프로그램은 고객의 이름과 포인트를 함께 저장 관리하는데, 포인트는 추가될 때마다 누적하여 저장된다.
//
//** 포인트 관리 프로그램입니다 **
//
//이름과 포인트 입력 >> 이재문 40
//
//(이재문,40)
//
//이름과 포인트 입력 >> 황기태 50
//
//(이재문,40)(황기태,50)
//
//이름과 포인트 입력 >> 황기태 60
//
//(이재문,40)(황기태,110)
//
//이름과 포인트 입력 >> 김남윤 30
//
//(이재문,40)(김남윤,30)(황기태,110)
//
//이름과 포인트 입력 >> 이재문 20
//
//(이재문,60)(김남윤,30)(황기태,110)
//
//이름과 포인트 입력 >> 그만
public class ex7_8 {
    public static void main(String[] args) {
        HashMap<String,Integer> info = new HashMap<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("*포인트 관리 프로그램입니다.*");
        while(true){
            System.out.print("이름과 포인트 입력 >> ");
            String name = sc.next();
            if(name.equals("그만"))
                break;
            int point = sc.nextInt();
            if(info.get(name)==null){
                info.put(name,point);
            }
            else{
                info.put(name,info.get(name)+point);
            }
            Set<String> key =info.keySet();
            Iterator<String> it = key.iterator();
            while(it.hasNext()){
                String people = it.next();
                Integer num = info.get(people);
                System.out.print("("+people+","+num+")");
            }
            System.out.println();
        }

    }
}
