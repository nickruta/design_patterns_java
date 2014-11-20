DESIGN PATTERN - STATE
==============
TYPE - BEHAVIORAL
--------------

The **State** pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

- Localize the behavior of each state into its own class.
- Create a code base and class structure that maps closely to the design hierarchy that we started with

Think of the State Pattern as an alternative to puttings lots of conditionals in your context; by encapsulating the behaviors within state objects, you can simply change the state object in context to change its behavior. 

**Examples of the State Pattern in the JDK include**

javax.faces.lifecycle.LifeCycle#execute() (controlled by FacesServlet, the behavior is dependent on current phase (state) of JSF life-cycle)
