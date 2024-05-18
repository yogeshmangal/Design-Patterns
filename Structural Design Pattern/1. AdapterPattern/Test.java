public class Test {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        Pen pen = new PenAdapter();
        aw.setPen(pen);
        aw.writeAssignment("Just keep working hard!!");
    }
}
