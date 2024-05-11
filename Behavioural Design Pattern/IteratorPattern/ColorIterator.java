import java.util.Iterator;

public class ColorIterator implements Iterator<String> {
    private int position;
    private String[] colors;

    public ColorIterator(String[] colors) {
        this.position = 0;
        this.colors = colors;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.colors.length;
    }

    @Override
    public String next() {
        if (hasNext())
            return this.colors[this.position++];
        throw new IllegalArgumentException("No more elements");
    }
}
