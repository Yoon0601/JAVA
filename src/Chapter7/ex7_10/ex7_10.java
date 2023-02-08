package Chapter7.ex7_10;
//Vector<Shape>의 벡터를 이용하여 그래픽 편집기를 만들어보자. \
// 본문 5.6절과 5.7절에서 사례로 든 추상 클래스 Shape과 Line, Rect, Circle 클래스 코드를
// 잘 완성하고 이를 활용하여 "삽입", "삭제", "모두 보기", "종료"의 4가지 그래픽 편집 기능을
// 프로그램을 작성하라. 6장 실습문제 6번을 Vector<Shape>을 이용하여 재작성하는 연습이다.
// Vector를 이용하면 6장 실습문제 6번보다 훨씬 간단히 작성됨을 경험할 수 있다.
//
//그래픽 에디터 beauty을 실행합니다.
//
//삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> 1
//
//Line(1), Rect(2), Circle(3) >> 2
//
//삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> 1
//
//Line(1), Rect(2), Circle(3) >> 3
//
//삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> 2
//
//삭제할 도형의 위치 >> 3
//
//삭제할 수 없습니다.
//
//삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> 4
//
//beauty을 종료합니다.

import java.util.Scanner;
import java.util.Vector;

abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; } //링크 연결
    public Shape getNext() { return next; }
    public abstract void draw();
}
class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class ex7_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Shape> v = new Vector<>();
        Shape shape=null;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            int button= sc.nextInt();
            if(button==4)
                break;
            switch (button){
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3) >> ");
                    int select = sc.nextInt();
                    switch (select){
                        case 1:
                            shape = new Line();
                            break;
                        case 2:
                            shape = new Rect();
                            break;
                        case 3:
                            shape =new Circle();
                            break;
                        default :
                            System.out.println("번호를 제대로 입력하세요");
                    }
                    v.add(shape);

            }
        }
    }
}
