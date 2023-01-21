package Chapter6.ex6_2;
//중심을 나타내는 정수 x, y와 반지름 radius 필드를 가지는 Circle 클래스를 작성하고자 한다.
// 생성자는 3개의 인자(x, y, raidus)를 받아 해당 필드를 초기화하고,
// equals() 메소드는 두 개의 Circle 객체의 중심이 같으면 같은 것으로 판별하도록 한다.
//
//원 a : Circle(2,3)반지름5
//원 b : Circle(2,3)반지름30
//같은 원

public class Circle {
    private int x,y,radius;
    public Circle(int x, int y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public String toString(){
        return "Circle("+x+","+y+")반지름"+radius;
    }
    @Override
    public boolean equals(Object obj) {
        Circle c=(Circle) obj;
        if(x==c.x&&y==c.y){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
	Circle a = new Circle(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
	Circle b = new Circle(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
	System.out.println("원 a : " + a);
	System.out.println("원 b : " + b);
	if(a.equals(b))
		System.out.println("같은 원");
	else
		System.out.println("서로 다른 원");
}
}
