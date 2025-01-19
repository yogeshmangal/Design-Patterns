# Behavioural Design Patterns

## 19-01-2025

### Null Object Design Pattern

- The Null Object Design Pattern is a behavioral design pattern that provides a default, "do nothing" implementation of an interface or abstract class, representing the absence of an object, instead of using null.
- The key idea is Instead of returning null to represent the absence of an object (which can lead to NullPointerException and conditional checks), return a "neutral" object that implements the same interface but does nothing or provides default behavior.
- It is used to avoid null checks everywhere in the code.

## 19-05-2024

### Visitor Pattern

- Visitor design pattern is one of the behavioral design patterns. It is used when we have to perform an operation on a group of similar kind of Objects. With the help of visitor pattern, we can move the operational logic from the objects to another class.
- The visitor pattern consists of two parts:
	- a method called Visit() which is implemented by the visitor and is called for every element in the data structure
	- visitable classes providing Accept() methods that accept a visitor

## 18-05-2024

### Template Pattern

- The Template Design Pattern is a behavioral design pattern that defines the basic structure of an algorithm in a superclass, while allowing subclasses to provide specific implementations of certain steps of the algorithm without modifying its overall structure.

## 17-05-2024

### Strategy Pattern

- The Strategy Design Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing clients to switch algorithms dynamically without altering the code structure.
- We will use the Strategy Design Pattern when we have the same code present in the subclasses and that code is not present in the Parent class. So to optimize the redundant code, we use the Strategy Pattern.
- I have done the implementation with and without Strategy Pattern, so that it's easy to understand the Strategy Pattern.

## 16-05-2024

### State Pattern

- The State design pattern is a behavioral design pattern that allows an object to change its behavior when its internal state changes. The pattern encapsulates state-specific behavior into separate classes and delegates the behavior to the current state, making the object appear to change its class.

## 15-05-2024

### Observer Pattern

- The Observer Design Pattern is a behavioral pattern where an observable maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods. It is commonly used to implement distributed event-handling systems.

## 12-05-2024

### Mediator Pattern

- The Mediator Design Pattern is a behavioral design pattern that promotes loose coupling by controlling communication between different objects. It centralizes communication between objects by introducing a mediator object that encapsulates how objects interact.

### Memento Pattern

- The Memento Pattern is a behavioral design pattern that allows an object to capture its internal state and restore it later, without exposing its internal structure. It's like taking a snapshot of an object's state and being able to revert to that snapshot whenever needed.

- Here's a breakdown of the components of the Memento Pattern:

- a) Originator: This is the object whose state needs to be saved. It creates a memento object containing a snapshot of its current state and uses that memento to restore its state later.

- b) Memento: This is the object that stores the state of the originator. It has two main responsibilities: storing the state of the originator and providing access to the state for the originator.

- c) Caretaker: This is the object that keeps track of the mementos. It doesn't modify or even look inside the mementos; it just holds onto them and provides them back to the originator when needed.

- The Memento Pattern is useful in scenarios where you need to implement undo functionality, maintain a history of states, or provide a way to revert to previous states of an object.

## 11-05-2024

### Interpreter Pattern

- The Interpreter pattern is a behavioral design pattern that specifies how to evaluate sentences in a language. It defines a grammatical representation for a language, as well as an interpreter that can interpret sentences in that language.

### Iterator Pattern

- The Iterator pattern is a behavioral design pattern that provides a way to access the elements of an aggregate object (such as a list) sequentially without exposing its underlying representation. It separates the traversal logic from the aggregate object, making it possible to iterate over the elements of the collection in a uniform manner.

## 09-05-2024

### Command Pattern

- The Command Design Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing parameterization of clients with queues, requests, and operations. It enables the separation of concerns between the sender (client) of a request and the receiver (the object that performs the action). This pattern consists of several key components:

- (a) Command: This represents an action to be performed. It typically includes a method that defines what action needs to be taken (e.g., execute()).
- (b) Receiver: This is the object that performs the action associated with the command.
- (c) Invoker: This asks the command to carry out the request. It doesn't have the knowledge of how the request is executed; it simply knows how to trigger it.
- (d) Client: This creates a concrete command object and sets its receiver. It then associates the command with the receiver.

- Note: In the code of Command Pattern: 
- (a) Command is Command interface and its subclass like LightOnCommand and LightOffCommand
- (b) Receiver is Light class.
- (c) Invoker is RemoteController class.
- (d) Client is Test class.

## 08-05-2024

### Chain Of Responsibility Pattern

- The Chain of Responsibility Design Pattern is a behavioural pattern that allows a request to be passed alone a chain of handlers. Each handler decides either to process the request or to pass it on the next handle in the chain. This pattern decouples senders and receivers of requests.

