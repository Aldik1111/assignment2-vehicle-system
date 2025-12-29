A) Project Overview
\
Project Name: Vehicle Management System
Goal: Introduces object-oriented programming principles in Java, including exploration, abstraction, composition, and aggregation.

Description:
\
The project includes the abstract classes Vehicle and the subclasses Car, Motorcycle, Truck, and Airplane.
\
Each vehicle belongs to a driver.
\
Audio polymorphism program using the Vehicle[] array and the overriding methods startEngine() and stopEngine().

B) Class Hierarchy

Superclass:
\
Vehicle (abstract)
\
Fields: Make, Year, Driver
\
Abstract methods: startEngine(), stopEngine().
\
Concrete method: displayInfo()

Subclasses:
\
Car
\
Fields: Doors, Fuel Type
\
Overrides the methods startEngine(), stopEngine(), displayInfo().

Motorcycle
\
Field: hasSidecar
\
Overrides the startEngine(), stopEngine(), and displayInfo() methods.

Truck
\
Fields: capacity, number of axles
\
Overrides the startEngine(), stopEngine(), and displayInfo() methods.

Airplane (bonus)
\
Fields: capacity, fuel type
\
Overrides the startEngine(), stopEngine(), and displayInfo() methods.

Driver class:
\
Fields: name, license number
\
Method: displayDriverInfo()
\
Shows composition (a vehicle has a driver) and aggregation (one driver can drive multiple vehicles).

Relationships:
\
Vehicle → Car / Motorcycle / Truck / Airplane (inheritance)
\
Vehicle → Driver (composition)
\
One driver can drive multiple vehicles (aggregation)

C) Instructions to Compile and Run
\
Compile all Java files:
javac *.java
\
Run the program:
Java Home

D) Screenshots
\
in docs/screenshots/

E) Reflection Section

Inheritance: helped create a foundation for all vehicles, reducing code repetition.
\
Overriding methods: rotation setup methods startEngine() and stopEngine() for each vehicle type.
\
Composition and union: Each vehicle has a driver, and a single driver can control multiple vehicles.
\
Access modifiers: Using private fields with getters/setters according to encapsulation rules; protected rotation fields of subclasses provide access to appearance data.