DESIGN PATTERN - COMPOSITE
==============
TYPE - STRUCTURAL
--------------

The **Composite** pattern allows you to compose objects into TREE structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

Using a composite structure, we can apply the same operations over both composites and individual objects. In other words, in most cases we can ignore the differences between compositions of objects and individual objects. 
   

**Examples of the Composite Pattern in the JDK include**

 java.awt.Container#add(Component) (practically all over Swing thus)
 javax.faces.component.UIComponent#getChildren() (practically all over JSF UI thus)
