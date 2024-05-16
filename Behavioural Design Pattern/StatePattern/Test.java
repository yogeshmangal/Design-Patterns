public class Test {
    public static void main(String[] args) {
        Context ctx = new Context(new RedLight());
        ctx.handle();

        ctx.setState(new YellowLight());
        ctx.handle();

        ctx.setState(new GreenLight());
        ctx.handle();
    }
}
