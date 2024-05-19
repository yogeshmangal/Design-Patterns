public class FontImpl implements Font {
    private String fontName;

    public FontImpl(String fontName) {
        this.fontName = fontName;
    }

    @Override
    public void render(String character) {
        System.out.println("Rendering '" + character + " 'using font: " + this.fontName);
    }
}
