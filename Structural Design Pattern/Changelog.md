# Structural Design Patterns

## 05-05-2024

### Composite Pattern

- The Composite Design Pattern is a structural design pattern that lets you compose objects into tree-like structures to represent part-whole hierarchies. It allows clients to treat individual objects and compositions of objects uniformly. 
- Note: In the Composite Design Pattern, whatever operations we perform on leaf node, the same operations should be perform on composite object as well.

### Decorator Pattern

- The Decorator Design Pattern is a structural design pattern that allows you to enhance or modify the behaviour of objects at runtime. It achieves this by creating a set of decorator classes that are used to wrap concrete components. Each decorator adds a specific feature or behaviour to the component and you can stack multiple decorators to create various combinations.

### Facade Pattern

- Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.

## 04-05-2024

### Adapter Pattern

- The Adapter design pattern is a structural pattern that allows the interface of an existing class to be used as another interface. It acts as a bridge between two incompatible interfaces, making them work together. This pattern involves a single class, known as the adapter, which is responsible for joining functionalities of independent or incompatible interfaces.

### Bridge Pattern

- Bridge is a structural design pattern that lets you split a large class or a set of closely related classes into two separate hierarchies—abstraction and implementation which can be developed independently of each other.