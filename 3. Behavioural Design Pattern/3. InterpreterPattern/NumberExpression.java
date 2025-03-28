public class NumberExpression implements Expression {

    private int num;

    public NumberExpression(int numb) {
        this.num = numb;
    }

    @Override
    public int interpret() {
        return num;
    }
}
