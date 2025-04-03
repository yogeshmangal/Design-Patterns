# Structural Design Patterns

## 06-05-2024

### Flyweight Pattern

- The Flyweight Pattern is a structural design pattern that minimizes memory usage by sharing common object instances instead of creating new ones for every request. It is particularly useful when a large number of similar objects need to be created, as it reduces object duplication and improves performance.
- There are 3 scenarios in which we can use Flyweight Pattern:

(a) No of objects creation is Huge.
(b) Object creation is heavy on memory.
(c) Object has intrinsic and extrinsic properties.

Note: Intrinsic: The unique object properties.
            Extrinsic: The properties that are added by client.

For eg:
class Book {
   String name;
   String type;
   int price;
}
Here, 'type' will be either comic or study, so it is a intrinsic property because this is fix and rest name and price are extrinisic because these are set by client.

### Proxy Pattern

- Proxy Design Pattern is like a placeholder for another object. It controls access to that object, allowing you to add extra functionalities like lazy initialization, access control or caching without changing the original object's code. So, it's like a middleman that handle requests to the real object, adding some extra stuff as needed.

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
