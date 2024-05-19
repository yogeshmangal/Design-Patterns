public class EnglishCommandExpression implements Expression {
    @Override
    public String interpret(String expression) {
        switch (expression.toLowerCase()) {
            case "add":
                return "result = num1 + num2;";
            case "subtract":
                return "result = num1 - num2;";
            case "multiply":
                return "result = num1 * num2;";
            case "divide":
                return "result = num1 / num2;";
            default:
                return "Unsupported expression;";
        }
    }
}
