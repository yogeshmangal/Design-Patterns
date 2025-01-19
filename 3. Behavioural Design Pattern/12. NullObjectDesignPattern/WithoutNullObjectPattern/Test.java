package WithoutNullObjectPattern;

public class Test {
    public static void main(String[] args) {
        Animal animal = getAnimal(false);
        animal.makeSound();
    }

    private static Animal getAnimal(boolean hasAnimal) {
        return hasAnimal ? new Dog() : null;
    }
}
