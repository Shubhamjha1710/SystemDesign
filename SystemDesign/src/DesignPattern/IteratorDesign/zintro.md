The Iterator design pattern is a behavioral design pattern that provides a way to access the 
elements of a collection (like a list) sequentially without exposing its underlying representation.
It defines a separate object, called an iterator, which encapsulates the details of traversing the 
elements of collection, allowing the object to change its internal structure without affecting the
way its elements are accessed.
1. Iterator Pattern is a relatively simple and frequently used design pattern. 
2. There are a lot of data structures/collections available in every language.
3. Each collection must provide an iterator object to iterate through its object.

Problem it solves
1. Suppose you have two data structure List<string> and other is HashSet<string>
2. Now if iterator is not present than you have to write the different traversal logic for each.
3. And client code becomes dependent on internal structure.

Components of iterator design pattern
1. Iterator interface: Defines the interface for accessing and traversing elements in collection. 
It typically includes methods like hasNext(), next(), and optionally remove().
2. Concrete Iterator: Implements the Iterator interface and maintains the current position in 
traversal of the collection. Contains the reference of collection data structure
3. Iterable (Collection) interface: Defines the interface for creating an Iterator object. This 
includes the method like createIterator() that return iterator object of Iterable
4. Concrete Iterable: Implements the iterable interface and contains the multiple of objects in
some data structure which need to be iterated, and an implementation of createIterator which 
helps to iterate the object in collection.

Advantages
1. This pattern simplifies traversal of collections without exposing their internal structure.
2. Provides a uniform way to access elements of a collection
3. Hides the internal representation of the collection
4. Supports multiple traversals at the same time
