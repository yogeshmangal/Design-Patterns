public class Test {
    public static void main(String[] args) {
        Expression expression = new EnglishCommandExpression();
        String javaCode = expression.interpret("divide");
        System.out.println(javaCode);
    }
}
