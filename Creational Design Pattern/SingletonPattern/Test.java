public class Test {
    public static void main(String[] args) {
        Program p1 = Program.getProgram();
        System.out.println(p1.hashCode());

        Program p2 = Program.getProgram();
        System.out.println(p2.hashCode());
    }
}
