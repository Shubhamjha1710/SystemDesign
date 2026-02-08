Proxy means someone who acts on behalf of someone else. A Proxy object controls access to a real
object.

Proxy Design Pattern is a structural design pattern where a proxy object acts as a placeholder
to control access to the real object. The client communicates with the proxy, which forwards
requests to the real object. The proxy can also provide extra functionality such as access control,
lazy initialization, logging, and caching. When to forward/block the request and when to add
extra behavior.


Why do we need Proxy Design Pattern?
We need the Proxy Design Pattern to control and manage access to objects. This helps optimize
performance, enhance security, and maintain flexibility in system design.


Real Life Use of Proxy Design Pattern/Types of proxy design pattern
1. Virtual Proxy: Creates the real object only when it is actually needed. Key idea is that don't
create the expensive object until it is need. In web browsers or apps, proxies are used to load
large images lazily. A placeholder proxy object represents the image and loads the actual image
only when needed, improving performance. Like in gallery apps image thumbnail loads instantly but
actual image only gets loaded when user clicked on it.

2. Protection Proxy for Access Control: Checks permissions before allowing access to the real
object. Proxies can control access to sensitive resources by checking user permissions before
forwarding requests, commonly used in authentication and authorization systems.

3. Remote Proxy: Remote proxies act as local representatives for objects running on a different
machine, handling communication details like network calls and serialization transparently to
the client.

4. Caching Proxy for Expensive Operations: Caching proxies store results of expensive operations
(e.g., database queries or API calls) and return cached results for repeated requests, reducing
latency and resource consumption.


Component of Proxy Design Pattern
1. Real Object Interface: Define an interface or abstract class that represents the operations the 
real object will provide. Both the real object and proxy will implement this interface.
2. Real class Object: This class implements the interface and contains the actual logic or operation
that the client wants to use.
3. Proxy class object: The proxy class also implements the same interface as the real object. It 
holds a reference to the real object and controls access to it. The proxy can add extra logic like 
logging, caching, or security checks.
4. Client: Instead of creating the real object directly, the client interacts with the proxy. The 
proxy decides when and how to forward the client’s request to the real object.