public class Square implements Shape {
    public double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
