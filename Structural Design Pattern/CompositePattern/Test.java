public class Test {
    public static void main(String[] args) {
        Component hardDrive = new Leaf("HardDrive", 5000);
        Component ram = new Leaf("RAM", 8000);
        Component cpu = new Leaf("CPU", 1000);
        Component mouse = new Leaf("Mouse", 500);
        Component keyBoard = new Leaf("KeyBoard", 700);

        Composite motherBoard = new Composite("MotherBoard");
        motherBoard.addComponents(ram);
        motherBoard.addComponents(cpu);

        Composite cabinet = new Composite("Cabinet");
        cabinet.addComponents(hardDrive);
        cabinet.addComponents(motherBoard);

        Composite peripheral = new Composite("Peripheral");
        peripheral.addComponents(mouse);
        peripheral.addComponents(keyBoard);

        Composite computer = new Composite("Computer");
        computer.addComponents(cabinet);
        computer.addComponents(peripheral);
        computer.showPrice();

    }
}
