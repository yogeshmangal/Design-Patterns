/* This is the CareTaker class **/

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Memento> history = new Stack<>();
        Originator originator = new Originator();

        originator.type("Hello");
        history.push(originator.saveContent());

        originator.type(" World!!");
        history.push(originator.saveContent());

        System.out.println("Current State is: " + originator.getContent());

        originator.restore(history.pop());
        System.out.println("After undo: " + originator.getContent());

        originator.restore(history.pop());
        System.out.println("After second undo: " + originator.getContent());
    }
}