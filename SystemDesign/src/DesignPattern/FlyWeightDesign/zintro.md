The Flyweight Design Pattern is a structural design pattern used to reduce memory usage by sharing
common data of an object among multiple objects. It is especially useful when an application 
needs to create a large number of similar objects. By reusing existing objects, it improves 
performance and memory efficiency.
1. Separates object data into intrinsic (shared) and extrinsic (unique) states.
2. Stores shared data centrally so it can be reused by multiple objects.
3. Commonly used in scenarios like text editors, graphics systems, and game development.

Real world analogy
1. Like you are building a game in which there should requires many stones
2. Now each stones have these properties colour, weight and position where this stone is present.
3. Now stone should only three colours (i.e. red, yellow, green) and two possible weights (i.e. 1kg 
or 2kg)
4. Now instead of creating 1,000 separate heavy stones class's objects
5. Create six object of shared of object with different combination of colour and weight. Store 
only position separately. So stone-design = flyweight (shared) and position = extrinsic state.
6. So we are separating object state into separate extrinsic and intrinsic states.

Component of fly-weight design
1. Flyweight Class: This defines the flyweight class which only operates the intrinsic states
2. Flyweight context: This defines the class which contains the extrinsic states and reference
to flyweight class's object.
3. Flyweight Factory: The factory is responsible for creating and managing flyweight objects 
efficiently. Maintains a pool or cache of existing flyweight objects (with intrinsic states).

Uses
1. The Flyweight Pattern is used when an application needs to handle a very large number of 
similar objects efficiently.
2. When memory optimization is critical due to a large number of objects.
3. When many objects share common data that can be reused. When object creation cost is high
and sharing can improve performance.

Working
1. The Flyweight Pattern works by separating shared and unique data and reusing objects through a 
factory
2. The client requests a flyweight object from the Flyweight Factory. 
3. The factory checks if a matching flyweight already exists; if yes, it returns the existing one.
4. If not, the factory creates a new flyweight and stores it for future reuse.
5. The client supplies extrinsic state to the flyweight during method calls.

Real-Life Example 
1. Text Editor Characters: Thousands of characters share the same font, size, and style, while 
position and content vary.
2. Traffic Signals: Different intersections reuse the same signal types (red, yellow, green) instead 
of creating new ones each time.
3. Trees in a Forest Game: Tree models are shared, while position and height differ for each tree.
