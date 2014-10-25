DESIGN PATTERN - STRATEGY
==============

TYPE - BEHAVIORAL
--------------

Favor composition over inheritance - using composition gives more flexibility. It lets you encapsulate a family of algorithms into their own set of classes, but also lets you change behavior at runtime as long as the object you're composing with implements the correct behavior interface. 

The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

The "Client" (Motorcycle - Cruiser and Sport) makes use of an encapsulated family of algorithms (DriveBehavior) for Driving. 

The set of behaviors, DriveAtEase and DriveFastAndFurious are a family of algorithms named DriveBehavior.

The algorithms are interchangeable.

