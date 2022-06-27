# FoodTruckProject
 
# Description
Upon opening, this application will first present a description to the user of what it does. The user is then prompted to enter up to 5 Food Truck entries but may enter "quit" to got to a menu at any time. If the user does not provide a name or food type, a default value of "Not Entered" will be assigned. When giving a rating, if the user does not enter a number from 1 to 5, the user will be prompted of the error and prompted to re-enter all of the Food Trucks data. Once all trucks are enterd, the user is presented with a menu that will be presented to the user after every selection until they choose option 4; "quit".  
# Technologies Used
Java
Eclipse
Git
ZSH
# Approaching and Shaping FoodTruck
The approach: Drawing a UML on a whiteboard before beginning, writing a skeleton of the code, and finally writing the code. Written code cycled between troubleshooting, often through the application of sysouts to see data at different stages of the program, and re-factoring. 

Shaping: Once the program was operational I decided to address issues presented based on a few scenarios where the user does something unintended. When the user enters a non number or a number out of range, the program will recognize it and start the truck entry over again for the current index (the for-loop & FoodTruck "COUNTER" variable are thereby decremented). If a user does not make an entry for the truck name or food ty[e, a default entry will be made. Finally, should a user choose to quit during the very first truck entry, the program-closing method will be invoked.
# What I learned

Don't allow conditions where pointers "see" null values.

Abstraction: This pillar came in handy for achieving DRY. The toString constructor available in the FoodTruck class is the cleanest way to print each trucks details required for each truck when a listing of all trucks or highest rated truck is selected by the user from the menu. Abstraction was also applied to the assignment of an id number to each truck.

Encapsulation: It was great getting to spend in-depth time working through the FoodTruck class setup and better understanding its fields and overloading the constructors to grant it more fields than originally assigned. It's static field, "COUNTER" proved to be pivotal in achieving some of this programs capabilities such as decrementing it when a user needs to input a trucks data again when the rating input isn't within range. Accessing the "Getters and setters" from the Food Truck App also helped drive home the syntax required to get access to the encapsulated fields that each instance populated. This project brought the weeks introductory lessons of OOP together beautifully. 

Constructors: After the fields have been established for the class, one constructor is used to establish the class object with fields that are not provided by another class. The second constructor is an overloaded constructor of the first but has parameters set to match the class fields that will be provided by an outside class. You cannot combine fields whose data is sourced from an outside class with data that is sourced locally in the same constructor, hence the need for overloading. 

Arrays: Arrays of objects default value is null. Once iteration points at a value of null, it throws a "NullPointerException". To avoid looking at an index whose value is "null", iteration must stop before it is looked at. The FoodTruck class "COUNT" variable provides the limit needed in a for loop. For the "COUNT" to be accurate, you have to ensure a new instance of the FoodTruck class isn't created until after the user has selected a name for the truck. If they choose to quit instead, the counter should not be incremented.
 
