Core Java for testing area.
- Java Object oriented programming (OOP) concepts;
    * Encapsulation = It is data hiding.
                      It provides you the control over the data.
                      The encapsulate class is easy to test.

    * Abstraction = It is about hiding details and showing only functionality. 
        We use abstract class and interface to achieve abstraction
        Multiple inheritance is allowed by Java among INTERFACES.

        Differences between Abstract Class and Interface
            1) Method Differences:
             ==> Abstract classes can have both abstract and concrete methods but interfaces normally can have just abstract methods.
            After Java 8, we can use "default" and "static" keywords to create concrete methods in an interface
            2) Variable Differences:
             ==> Abstract classes can have final or non-final, static or non-static variables. But interfaces can have just final(must be initialized) and just static varibles.
            ==> Abstract classes can have public, protected, default, private variables but interfaces can have just public variables.
            3) Inheritance Differences:
            ==> We use "extends" keyword to inherit from a class(abstract or not) to a class(abstract or not).
            We use "implements" keyword to inherit from a  class(abstract or not) to interface.
            We use "extends" keyword to inherit from an interface to an interface.
            An interface cannot accept a class as parent
            ==> We cannot create multiple inheritance between classes but multiple inheritance is supported by Java when we use interfaces

    * Polymorphism = Multiform. methods in same name but they will be in different form
        Note: Overloading is a "polymorphism".(static polymorphism, compile time polymorphism)
	    Note: Overriding is a "polymorphism".(dynamic polymorphism, run time polymorphism)
    * Inheritance = It is a mechanism in which one object get all the properties and behaviors of a parent object.
        Note : From child(sub) class to parent(super) class Java calls "IS-A" relationship
	     From  parent(super) class to child(sub) class Java calls "HAS-A" relationship
    * Class = It is a group of objects which have common properties. It is a template or blueprint from which objects are created.
    * Object = An entity that has state and behavior. 
            An object has three characteristics:

            State: represents the data (value) of an object.
            Behavior: represents the behavior (functionality) of an object such as deposit, withdraw, etc.
            Identity: An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely.

-Lambda is a "Functional Programming".

-Keywords of Java