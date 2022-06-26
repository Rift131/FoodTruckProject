# FoodTruckProject

# Description

# Technologies Used

# What I learned
The approach: Drawing a UML on a whiteboard before beginning, writing a skeleton of the code, and finally writing the code.  

Constructors: After the fields have been established for the class, one constructor is used to establish the class object with fields that are not provided by another class. The second constructor is an overloaded constructor of the first but has parameters set to match the class fields that will be provided by an outside class. You cannot combine fields whose data is sourced from an outside class with data that is sourced locally in the same constructor, hence the need for overloading. 

Abstraction: This pillar came in handy for achieving DRY. The toString constructor available in the FoodTruck class is the cleanest way to print each trucks details required for each truck when a listing of all trucks or highest rated truck is selected by the user from the menu. Abstraction was also applied to the assignment of an id number to each truck as well. 
