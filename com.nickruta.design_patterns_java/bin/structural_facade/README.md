DESIGN PATTERN - FACADE
==============

TYPE - STRUCTURAL
--------------

The **Facade** pattern provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher lievel interface that makes the subsystem easier to use.


**Java API Examples include - **

javax.faces.context.FacesContext, it internally uses among others the abstract/interface types

LifeCycle, ViewHandler, NavigationHandler and many more without that the end user has to worry about it (which are however overrideable by injection).

javax.faces.context.ExternalContext, which internally uses ServletContext, HttpSession, HttpServletRequest, HttpServletResponse, etc.




