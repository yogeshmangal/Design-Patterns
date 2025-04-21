public class ColorCollection {
    private String[] colors;

    public ColorCollection(String[] colors) {
        this.colors = colors;
    }

    public ColorIterator getIterator() {
        return new ColorIteratorImpl(colors);
    }
}