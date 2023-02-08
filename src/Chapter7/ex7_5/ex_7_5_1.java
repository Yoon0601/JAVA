package Chapter7.ex7_5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//하나의 학생 정보를 나타내는 Student 클래스에는 이름, 학과, 학번, 학점 평균을 저장하는 필드가 있다.
//(1) 학생마다 Student 객체를 생성하고 4명의 학생 정보를 ArrayList<Student> 컬렉션에 저장한 후에,
// ArrayList<Student>의 모든 학생(4명) 정보를 출력하고 학생 이름을 입력받아 해당 학생의 학점 평균을 출력하는 프로그램을 작성하라.
//학생 이름, 학과, 학번, 학점평균 입력하세요.
//>> 황기태, 모바일, 1, 4.1
//>> 이재문, 안드로이드, 2, 3.9
//>> 김남윤, 웹공학, 3, 3.5
//>> 최찬미, 빅데이터, 4, 4.25
//----------------------------------
//이름: 황기태
//학과: 모바일
//학번: 1
//학점평균: 4.1
//----------------------------------
//이름: 이재문
//학과: 안드로이드
//학번: 2
//학점평균: 3.9
//----------------------------------
//이름: 김남윤
//학과: 웹공학
//학번: 3
//학점평균: 3.5
//----------------------------------
//이름: 최찬미
//학과: 빅데이터
//학번: 4
//학점평균: 4.25
//----------------------------------
//학생 이름 >> 최찬미
//최찬미, 빅데이터, 4, 4.25
//학생 이름 >> 이재문
//이재문, 안드로이드, 2, 3.9
//학생 이름 >> 그만
public class ex_7_5_1 {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        for(int i=0;i< student.length;i++){
            try{
                System.out.print(">> ");
                String text=sc.nextLine();
                StringTokenizer st =new StringTokenizer(text,", ");
                String name=st.nextToken().trim();
                String dept=st.nextToken().trim();
                String code=st.nextToken().trim();
                double grade = Double.parseDouble(st.nextToken().trim());
                student[i]=new Student(name,dept,code,grade);
                students.add(student[i]);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
        for(int i=0;i< students.size();i++){
            System.out.println("----------------------------");
            Student s = students.get(i);
            System.out.println("이름: "+s.getName());
            System.out.println("학과: "+s.getDept());
            System.out.println("학번: "+s.getCode());
            System.out.println("학점 평균: "+s.getGrade());
        }
        System.out.println("--------------------------------");
        while(true){
            try{
                System.out.print("학생 이름 >>");
                String name=sc.next();
                if(name.equals("그만")){
                    break;
                }
                for(int i=0;i< students.size();i++){
                    Student s=students.get(i);
                    s.findStudent(name);
                }
            }catch(NullPointerException e){
                System.out.println(e.getMessage());
            }

        }
    }
}
