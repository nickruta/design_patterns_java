DESIGN PATTERN - PROXY
==============
TYPE - STRUCTURAL
--------------

The **Proxy** pattern provides a surrogate or placeholder for another object to control access to it.

Use the PROXY pattern to create a representative object that controls access to another object, which may be remote, expensive to create or in need of securing. 

Here are a few ways proxies can control access - 

- controls access to a remote object
- a virtual proxy controls access to a resource that is expensive to create
- a protection proxy controls access to a resource based on access rights
   

**Examples of the Proxy Pattern in the JDK include**

java.lang.reflect.Proxy
java.rmi.*, the whole API actually.