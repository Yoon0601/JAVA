package Chapter7.ex7_5;

import java.util.*;

//(2) ArrayList<Student> 대신, HashMap<String, Studnet> 해시맵을 이용하여 다시 작성하라.
//해시맵에서 키는 학생 이름으로 한다.
public class ex7_5_2 {
    public static void main(String[] args) {
        Student[] student = new Student[4];
        HashMap<String,Student> students = new HashMap<>();
        Scanner sc= new Scanner(System.in);
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
                students.put(name,student[i]);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
        Set<String> key = students.keySet();
        Iterator<String> it = key.iterator();
        while(it.hasNext()){
            String name=it.next();
            System.out.println("----------------------------");
            Student s = students.get(name);
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
                Student s= students.get(name);
                s.findStudent(name);
            }catch(NullPointerException n){
                System.out.println(n.getMessage());
            }

        }

    }
}
