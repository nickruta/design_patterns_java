DESIGN PATTERN - ITERATOR
==============
TYPE - BEHAVIORAL
--------------

The **Iterator** pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying
representation.

It also places the task of traversal on the iterator object, not on the aggregate, which simplifies the 
aggregate interface and implementation, and places the responsibility where it should be

**Examples of the Iterator Pattern in the JDK include**

 All implementations of java.util.Iterator (thus among others also java.util.Scanner!).
 All implementations of java.util.Enumeration
