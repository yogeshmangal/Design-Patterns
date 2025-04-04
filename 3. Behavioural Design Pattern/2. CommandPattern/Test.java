public class Test {
    public static void main(String[] args) {
        //Receiver
        Light light = new Light();

        //Command
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        //Invoker
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(lightOnCommand);
        remoteController.pressButton();
        remoteController.undo();

        System.out.println();

        remoteController.setCommand(lightOffCommand);
        remoteController.pressButton();
        remoteController.undo();
        remoteController.undo();
    }
}
