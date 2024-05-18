public class Test {
    public static void main(String[] args) {
        String text = "Hello, world!";
        String[] fontNames = {"Arial", "Times New Roman", "Arial"};
        for (int i = 0; i < text.length(); i++) {
            String character = String.valueOf(text.charAt(i));
            String fontName = fontNames[i % fontNames.length];
            Font font = FontFlyweight.getFont(fontName);
            font.render(character);
        }
    }
}
