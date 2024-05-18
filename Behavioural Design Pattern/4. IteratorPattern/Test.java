import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ColorCollection colorCollection = new ColorCollectionImpl();
        Iterator<String> iterator = colorCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
