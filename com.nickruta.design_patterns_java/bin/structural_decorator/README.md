DESIGN PATTERN - DECORATOR
==============

TYPE - STRUCTURAL
--------------

The **Decorator** pattern attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

The Decorator pattern provides an alternative to subclassing for extending behavior. 

The abstract class Application is subclassed in order to have the correct type, not to inherit its behavior. The behavior comes in through the composition of decorators with the base components as well as other decorators.

If we rely only on inheritance, we get only whatever behavior the superclass gives us or that we override. With composition, we can mix and match decorators any way we like, **at runtime.**

**The java.io package is largely based on Decorator**

Java I/O points out one of the downsides of the Decorator Pattern - design using this pattern often result in a large number of small classes that can be overwhelming to a developer trying to use the Decorator-based API.




