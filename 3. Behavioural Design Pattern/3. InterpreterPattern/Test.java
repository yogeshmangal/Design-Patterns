public class Test {
    public static void main(String[] args) {
        Expression num1 = new NumberExpression(9);
        Expression num2 = new NumberExpression(11);
        Expression exp1 = new AddExpression(num1, num2);
        Expression exp2 = new AddExpression(exp1, num1);
        System.out.println(exp1.interpret());
        System.out.println(exp2.interpret());
    }
}
