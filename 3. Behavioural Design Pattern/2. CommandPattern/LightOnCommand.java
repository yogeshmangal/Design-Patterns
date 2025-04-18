public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.switchOn();
    }

    @Override
    public void undo() {
        this.light.switchOff();
    }
}
