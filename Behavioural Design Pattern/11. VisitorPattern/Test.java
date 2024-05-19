public class Test {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(5), new Square(4)};
        Visitor visitor = new AreaVisitor();
        for (Shape shape : shapes) {
            shape.accept(visitor);
        }
    }
}
