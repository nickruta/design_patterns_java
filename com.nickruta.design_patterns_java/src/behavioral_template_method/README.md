DESIGN PATTERN - TEMPLATE METHOD
==============

TYPE - BEHAVIORAL
--------------

The **Template Method** pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.

This allows the algorithm to live in one place and code changes only need to be made there.

Template Method provides a framework. New features only need to implement a couple of methods.


**Java API Examples include - **

All non-abstract methods of java.io.InputStream, java.io.OutputStream, java.io.Reader and java.io.Writer.

All non-abstract methods of java.util.AbstractList, java.util.AbstractSet and java.util.AbstractMap.

javax.servlet.http.HttpServlet, all the doXXX() methods by default sends a HTTP 405 "Method Not Allowed" error to the response. You're free to implement none or any of them.




