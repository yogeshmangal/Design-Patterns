import java.util.Stack;

public class RemoteController {
    private Command command;
    private Stack<Command> commandsList = new Stack<>();

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
        commandsList.add(command);
    }

    public void undo() {
        if (commandsList.size() == 0)
            System.out.println("There is nothing to undo!!");
        else {
            Command command1 = commandsList.pop();
            command1.undo();
        }
    }
}
