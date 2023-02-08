package Chapter7.ex7_2;

import java.util.ArrayList;
import java.util.Scanner;

//Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 ArrayList에 저장하고,
//ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여 평균을 출력하는 프로그램을 작성하라.
//
//6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >> A C A B F D
//
//2.3333333333333335
public class ex7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arrayList = new ArrayList<>();
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F) >>");
        for(int i=0;i<6;i++){
            char grade =sc.next().charAt(0);
            arrayList.add(grade);
        }
        int sum = 0;
        for(int i=0;i<arrayList.size();i++){
            char grade = arrayList.get(i);
            switch (grade){
                case 'A' :
                    sum+=4;
                    break;
                case 'B':
                    sum+=3;
                    break;
                case 'C':
                    sum+=2;
                    break;
                case 'D':
                    sum+=1;
                    break;
                case 'F':
                    sum+=0;
                    break;
            }
        }
        double avg=(double)sum/ arrayList.size();
        System.out.println(avg);
    }
}
