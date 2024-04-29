public class Program {
    private static Program program;

    private Program() {

    }

    public static Program getProgram() {
        if (program == null)
            program = new Program();
        return program;
    }
}
