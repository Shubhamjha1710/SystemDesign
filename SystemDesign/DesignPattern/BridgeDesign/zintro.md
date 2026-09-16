The Bridge Design Pattern is a structural design pattern that separates an abstraction from its 
implementation so that both can vary independently. In simpler terms let says a car has two 
component i.e. model (aka high level part or abstraction) and engine (aka low level part or 
implementation), now bridge design pattern separates this high level part with low leve part.
It helps avoid tight coupling between abstraction and implementation, making the system more 
flexible and extensible.

Uses
1. Abstraction and implementation need to evolve independently.
2. When you want to avoid permanent binding between abstraction and implementation.
3. When changes in implementation should not affect client code.
4. When you want to hide implementation details from the client.

Real-World Analogy (Very Clear)
1. Let say you two types of components i.e. a remote Control and device.
2. In remotes, you have two types of remote i.e. basic remote and advanced remote.
3. In device, you have two types of system i.e. TV and radio
4. Now, if you want to create combination using inheritance then there would four classes (2*2)
   1. BasicRemoteTV 
   2. BasicRemoteRadio 
   3. AdvancedRemoteTV 
   4. AdvancedRemoteRadio
5. So this leads to explosion of classes and adding two new of remote or device creates more classes.
6. Instead, use remote (abstraction) has-a device (implementation). Now remote can work with any
device. This is bridge design pattern.

Problem it solves
1. Decouples abstraction from implementation using composition instead of inheritance.
2. Allows both abstraction and implementation to be developed and extended independently.
3. Improves flexibility and maintainability of the code.

Components of bridge design pattern
1. Abstraction: This is high level control in bridge design pattern. Contains a reference to the 
implementer.
2. Refined Abstraction: Extends the abstraction takes the finer detail one level below.
3. Implementer: This is low level control. It defines the interface for implementation classes.
4. Concrete Implementation: Implements the implementer by providing the concrete implementation.

Working
1. The Bridge Pattern works by delegating implementation-specific work to a separate interface.
2. The abstraction contains a reference to the implementation interface.
3. Concrete implementations provide the actual behavior. The client interacts only with the 
abstraction, not the implementation.
