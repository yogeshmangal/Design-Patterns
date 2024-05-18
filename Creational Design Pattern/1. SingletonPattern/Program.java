public class Program {
    private static Program program;

    private Program() {

    }

    //Creates the object only first time because first time program object is null.
    public static Program getProgram() {
        if (program == null)
            program = new Program();
        return program;
    }
}
