package Chapter6.ex6_4.app;
import Chapter6.ex6_4.derived.Circle;
import Chapter6.ex6_4.base.Shape;
public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}

