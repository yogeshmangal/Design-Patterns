public class Test {
    public static void main(String[] args) {
        String[] colors = {"Red", "Orange", "Green"};
        ColorCollection collection = new ColorCollection(colors);
        ColorIterator iterator = collection.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}