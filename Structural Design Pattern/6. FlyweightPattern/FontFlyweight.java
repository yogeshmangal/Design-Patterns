import java.util.HashMap;

public class FontFlyweight {
    private static HashMap<String, Font> fontMap = new HashMap<>();

    public static Font getFont(String fontName) {
        Font font = fontMap.get(fontName);
        if (font == null) {
            font = new FontImpl(fontName);
            fontMap.put(fontName, font);
        }
        return font;
    }
}
