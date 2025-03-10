public class Program {
    private static Program program;

    private Program() {   //Here we made the constructor as private so that no one from outside can create the Object of this class.

    }

    //Creates the object only first time because first time program object is null.
    public static Program getProgram() {
        if (program == null)
            program = new Program();
        return program;
    }
}
