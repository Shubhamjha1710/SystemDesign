The Mediator Design Pattern is used when many objects need to communicate with each other, but 
you want to avoid direct connections between them. Instead of objects talking directly to each 
other, they communicate through a central mediator object, this reduces dependencies. This makes 
the system easier to manage and maintain.

Why we need mediator design pattern
1. Without mediator design pattern each object needs hold the reference of other objects P2P.
2. Centralizes communication between multiple objects 
3. Reduces direct dependencies between components and tight coupling. 
4. Simplifies object interaction and maintenance. 
5. Makes it easier to modify or add new components without affecting others.

Components of mediator design pattern
1. Mediator: The Mediator interface defines the communication contract, specifying methods that 
concrete mediators should implement to facilitate interactions among colleagues. It encapsulate 
the logic of coordinating and managing the interactions between these objects. 
2. Colleague: Colleague classes are the components or objects that interact with each other. They 
communicate through the Mediator, and each colleague class is only aware of the mediator, not the 
other colleagues. This isolation ensures loose coupling among colleagues.
3. Concrete Mediator: Concrete Mediator is a specific implementation of the Mediator interface. It 
coordinates the communication between concrete colleague objects, handling their interactions and 
ensuring a well-organized collaboration while keeping them decoupled.
4. Concrete colleague: Concrete Colleague classes are the specific implementations of the Colleague
interface. They rely on the Mediator to communicate with other colleagues.

Uses
The Mediator pattern is commonly used to manage complex interactions between objects.
1. GUI systems where Buttons, text fields, and dialogs communicate via a mediator/controller
2. Chat applications where users communicate through a central server.
3. Air traffic control systems managing communication between airplanes.
4. Workflow or event-driven systems to coordinate multiple components.

Advantages 
1. Reduces dependencies: Objects don't depend on each other.
2. Centralized control: All communication logic in one place.
3. Easier maintenance: Change mediator instead of all objects.