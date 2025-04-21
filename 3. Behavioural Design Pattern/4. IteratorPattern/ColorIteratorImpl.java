import java.util.NoSuchElementException;

public class ColorIteratorImpl implements ColorIterator {

    private String[] colors;
    private int index;

    public ColorIteratorImpl(String[] colors) {
        this.colors = colors;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < colors.length;
    }

    @Override
    public String next() {
        if (hasNext()) return colors[index++];
        throw new NoSuchElementException();
    }
}