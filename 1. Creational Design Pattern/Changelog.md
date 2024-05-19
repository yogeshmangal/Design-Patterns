# Creational Design Patterns

## 04-05-2024

### Prototype Pattern

- Prototype pattern provides a mechanism to copy the original object to a new object and then modify it according to our needs. The concept is to copy an existing object rather than create a new instance from scratch, something that may include costly operations. Prototype design pattern uses java cloning to copy the object.

## 02-05-2024

### Builder Pattern

- The Builder design pattern is used to construct complex objects. It is particularly useful when an object has a large number of attributes, some of which may be optional, and provides a flexible way to create objects with varying configurations.

## 01-05-2024

### Factory Pattern

- A Factory Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.

### Abstract Factory Pattern

- Since in Factory Design Pattern, we saw that we have a single Factory class. This Factory class returns different subclasses based on the input provided and factory class uses if-else or switch statement to achive this. Now, in Abstract Factory Design Pattern, we get rid off if-else/switch block and have a factory class for each subclass. Then an Abstract Factory class that will return the subclass based on the input factory class.

## 29-04-2024

### Singleton Pattern

- The Singleton design pattern ensures that a class has only one instance and provides a global point of access to that instance.