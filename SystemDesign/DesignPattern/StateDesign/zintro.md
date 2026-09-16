The State Design Pattern is a behavioral design pattern that lets an object alter its behavior 
when its internal state changes. In simpler terms same object behaves differently depending on 
its state. Instead of writing many if-else conditions, we create separate classes for each state.

Real-life use case
1. The state pattern is commonly used when an object’s behavior depends on its state and changes 
over time.
2. Vending machines (item selected, money inserted, item dispensed)
3. Traffic light systems (green, yellow, red states)
4. Media players (playing, paused, stopped states)

Working
1. The pattern works by encapsulating each possible state in a separate class and letting the 
context object delegate behavior to the current state.
2. The context (main object) holds a reference to the current state
3. Each state class defines behavior specific to that state and the state it will make transition
after performing operation.
4. When the context state changes, it changes the state object, automatically changing its behavior
5. Clients interact with the context without needing to know the current state

Components
1. Context: The main object whose behavior changes. Maintains a reference to the current state, 
delegates behavior to it, and provides an interface for clients.
2. State Interface: Defines common methods for all states, allowing Context to work with them 
without knowing concrete implementing states.
3. Concrete States: Implement the state interface, encapsulating behavior for specific states and 
defining context’s actions in those states.

Advantages
1. This pattern makes state-dependent behavior easier to manage and extend.
2. Eliminates large conditional statements for state handling
3. Makes it easy to add or modify states without affecting existing code
4. Improves code readability and maintainability
5. Supports dynamic behavior changes at runtime