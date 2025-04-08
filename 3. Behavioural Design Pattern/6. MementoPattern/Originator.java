public class Originator {

    private String content = "";

    public void type(String word) {
        content += word;
    }

    public String getContent() {
        return content;
    }

    public Memento saveContent() {
        return new Memento(content);
    }

    public void restore(Memento memento) {
        content = memento.getContent();
    }
}
