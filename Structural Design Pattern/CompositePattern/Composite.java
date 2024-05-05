import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponents(Component comp) {
        this.components.add(comp);
    }

    @Override
    public void showPrice() {
        System.out.println(this.name);
        for (Component comp : this.components) {
            comp.showPrice();
        }
    }
}
