public class AreaVisitor implements Visitor {

    @Override
    public void visit(Circle circle) {
        double area = Math.PI * circle.radius * circle.radius;
        System.out.println("Area of Circle is: " + area);
    }

    @Override
    public void visit(Square square) {
        double area = square.side * square.side;
        System.out.println("Area of Square is: " + area);
    }
}
