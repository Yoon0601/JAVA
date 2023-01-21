package Chapter5.ex5_5__8;

class ColorPoint1 extends Point{
    private String color;
    public ColorPoint1(){
        super(0,0);
        this.color="BLACK";
    }
    public ColorPoint1(int x, int y){
        super(x,y);
    }
    public String toString(){
        return color+"색의 "+ "("+getX()+", "+getY()+")의 점";
    }
    public void setXY(int x,int y){
        move(x,y);
    }
    public void setColor(String color){
        this.color=color;
    }
}
public class ex5_6 {
    public static void main(String[] args) {
        ColorPoint1 zeroPoint = new ColorPoint1(); // (0,0) 위치의 BLACK 색 점
        System.out.println(zeroPoint.toString() + "입니다.");
        ColorPoint1 cp1 = new ColorPoint1(10, 10); // (10,10) 위치의 BLACK 색 점
        cp1.setXY(5,5);
        cp1.setColor("RED");
        System.out.println(cp1.toString()+"입니다.");
    }
}
