Chain of responsibility design pattern is behavioral design pattern. That allows to pass request 
in the chain of handlers. Each handler decide either to process the request or pass it to next 
handler in the chain. Pass a request along a chain of handlers until someone handles it.
1. This pattern is frequently used in the chain of handlers, where each handler either handles the 
request or passes it on to the next handler in the chain if it is unable to handle that request.
2. This pattern encourages loose coupling between sender and receiver, providing freedom in handling
the request.
3. So no object need to know which handler will handle it. Each handler will get a chance to handle 
the request object.

Think it like there is an issue handling in customer care service. You raise a complaint. 
1. First level support it will handle simple issues, if not then forwards it.
2. Second level support it will handle technical issues, if not, forwards it. 
3. Third level support it will handle serious issues. 
You don’t know who will solve it. You just submit the complaint. This is Chain of Responsibility.

Problem it solved
1. Without chain of responsibility there will too many if else condition 
2. Component will be tightly coupled 
3. Hard to add new levels
4. But with chain of responsibility handler.handle(request);

Characteristic of chain of responsibility function
1. Loose Coupling: This means the sender of a request doesn't need to know which specific handler 
will handle it. Similarly, the handler doesn’t need to understand how the requests are sent. This 
keeps the components separate and flexible.
2. Dynamic Chain: While the program is running, changing the chain is simple. This makes your code 
flexible because you may add or delete handlers without changing the main body of the code.
3. Single Responsibility Principle: Each handler in the chain has one job either to handle the 
request or to pass it to the next handler. This keeps the code organized and focused, making it 
easier to manage.
4. Sequential Order: Requests move through the chain one at a time. Each handler gets a chance to
process the request in a specific order, ensuring consistency.
5. Fallback Mechanism: If a request isn’t handled by any of the handlers, the chain can include a 
fallback option. There's a default way to deal with requests that don't fit anywhere else.

Where chain of responsibility is used
1. Logging frameworks
2. Middleware pipelines
3. Authentication / Authorization filters
4. Event handling
5. HTTP request processing
6. Exception handling

Components of the Chain of Responsibility Design Pattern
1. Handler Interface: This is the base class that defines the interface for handling requests 
and, in many cases, for chaining to the next handler in the sequence.
2. Concrete Handlers: These are the classes that implement how the requests are going to be handled. 
They can handle the request or pass it to the next handler in the chain if unable to handle it. Each
handler has a reference to handler interface.
3. Client: The request is sent by the client, who then forwards it to the chain’s first handler. 

