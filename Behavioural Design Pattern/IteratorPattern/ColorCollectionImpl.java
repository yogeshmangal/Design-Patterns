import java.util.Iterator;

public class ColorCollectionImpl implements ColorCollection {
    private String[] colors = {"Red", "Blue", "Orange", "Green", "Violet"};

    @Override
    public Iterator<String> createIterator() {
        return new ColorIterator(colors);
    }
}
